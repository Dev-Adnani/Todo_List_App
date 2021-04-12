package com.devx.todolist.activity

import android.app.KeyguardManager
import android.content.Context
import android.content.DialogInterface
import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.hardware.biometrics.BiometricPrompt
import android.os.Build
import android.os.Bundle
import android.os.CancellationSignal
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.app.ActivityCompat
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.devx.todolist.R
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var cancellationSignal: CancellationSignal? = null
    lateinit var sharedPreferences: SharedPreferences

    private val authenticationCallback: BiometricPrompt.AuthenticationCallback
        get() =
            @RequiresApi(Build.VERSION_CODES.P)
            object : BiometricPrompt.AuthenticationCallback() {
                override fun onAuthenticationError(errorCode: Int, errString: CharSequence?) {
                    super.onAuthenticationError(errorCode, errString)
                    notifyUser("Authentication Failed :$errString")
                    disableUserAction()
                }

                override fun onAuthenticationSucceeded(result: BiometricPrompt.AuthenticationResult?) {
                    super.onAuthenticationSucceeded(result)
                    successMessage("Successfully Verified")
                    errorRelativeLayout.visibility = View.GONE
                    window.clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE)
                }
            }


    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sharedPreferences = getSharedPreferences(R.string.nMode.toString(), MODE_PRIVATE)

        checkBioSupport()
        checkAuth()
        disableUserAction()
        checkNightMode()

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        val navController = navHostFragment.navController
        setupActionBarWithNavController(navController)


    }

    private fun disableUserAction() {
        errorRelativeLayout.visibility = View.VISIBLE
        window.setFlags(
            WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
            WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE
        )
    }

    @RequiresApi(Build.VERSION_CODES.P)
    private fun checkAuth() {
        val biometricPrompt = BiometricPrompt.Builder(this)
            .setTitle("Authentication is Required")
            .setSubtitle("The App uses Fingerprint Authentication To Keep Your Data Secure")
            .setNegativeButton("Cancel", this.mainExecutor, DialogInterface.OnClickListener()
            { dialog, which ->
                notifyUser("Authentication Was Cancelled By User")
            }).build()

        biometricPrompt.authenticate(getCancellationSignal(), mainExecutor, authenticationCallback)
    }

    private fun getCancellationSignal(): CancellationSignal {
        cancellationSignal = CancellationSignal()
        cancellationSignal?.setOnCancelListener {
            notifyUser("Authentication Was Cancelled By User")
        }
        return cancellationSignal as CancellationSignal
    }


    private fun checkBioSupport(): Boolean {
        val keyguardManager = getSystemService(Context.KEYGUARD_SERVICE) as KeyguardManager

        if (!keyguardManager.isKeyguardSecure) {
            notifyUser("Please Enable Fingerprint Authentication in Settings")
            return false
        }

        if (ActivityCompat.checkSelfPermission(
                this,
                android.Manifest.permission.USE_BIOMETRIC
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            notifyUser("Please Enable Fingerprint Permission in Settings")
            return false
        }
        return if (packageManager.hasSystemFeature(PackageManager.FEATURE_FINGERPRINT)) {
            true
        } else
            true

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.navHostFragment)
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

    private fun notifyUser(message: String) {
        Toasty.warning(this, message, Toast.LENGTH_SHORT, true).show()
    }

    private fun successMessage(message: String) {
        Toasty.success(this, message, Toast.LENGTH_SHORT, true).show()
    }

    private fun checkNightMode() {
        if (sharedPreferences.getBoolean(R.string.key_isNight.toString(), false)) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        }
    }

}