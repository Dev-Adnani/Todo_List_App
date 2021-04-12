package com.devx.todolist.fragments.settings

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import com.devx.todolist.R
import kotlinx.android.synthetic.main.fragment_settings.view.*


class SettingsFragment : Fragment() {

    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_settings, container, false)

        sharedPreferences =
            activity?.getSharedPreferences(R.string.nMode.toString(), Context.MODE_PRIVATE)!!

        checkNightMode(view)
        checkMode(view)
        return view

    }

    private fun checkMode(view: View) {
        view.settingSwitch.setOnCheckedChangeListener { _, isChecked ->

            if (isChecked) {
                saveNightModeState(true)
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                view.settingSwitch.isChecked = true
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                saveNightModeState(false)
                view.settingSwitch.isChecked = false

            }

        }
    }


    private fun saveNightModeState(isNightMode: Boolean) {
        val editor: SharedPreferences.Editor = sharedPreferences.edit()
        editor.putBoolean(R.string.key_isNight.toString(), isNightMode)
        editor.apply()
    }

    private fun checkNightMode(view: View) {
        if (sharedPreferences.getBoolean(R.string.key_isNight.toString(), false)) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            view.settingSwitch.isChecked = true
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            view.settingSwitch.isChecked = false

        }
    }

}