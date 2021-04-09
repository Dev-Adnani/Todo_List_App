package com.devx.todolist.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0003J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\bH\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0015J\b\u0010\u0015\u001a\u00020\fH\u0016J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/devx/todolist/activity/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "authenticationCallback", "Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;", "getAuthenticationCallback", "()Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;", "cancellationSignal", "Landroid/os/CancellationSignal;", "checkAuth", "", "checkBioSupport", "", "disableUserAction", "getCancellationSignal", "notifyUser", "message", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "successMessage", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private android.os.CancellationSignal cancellationSignal;
    private java.util.HashMap _$_findViewCache;
    
    private final android.hardware.biometrics.BiometricPrompt.AuthenticationCallback getAuthenticationCallback() {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.P)
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void disableUserAction() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.P)
    private final void checkAuth() {
    }
    
    private final android.os.CancellationSignal getCancellationSignal() {
        return null;
    }
    
    private final boolean checkBioSupport() {
        return false;
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    private final void notifyUser(java.lang.String message) {
    }
    
    private final void successMessage(java.lang.String message) {
    }
    
    public MainActivity() {
        super();
    }
}