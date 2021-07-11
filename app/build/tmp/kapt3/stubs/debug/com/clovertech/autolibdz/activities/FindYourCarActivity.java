package com.clovertech.autolibdz.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0014J\b\u0010\u0011\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/clovertech/autolibdz/activities/FindYourCarActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "mSocket", "Lio/socket/client/Socket;", "nameTablet", "", "onConnected", "Lio/socket/emitter/Emitter$Listener;", "onDisconnect", "onError", "onLink", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "requestLocationPermission", "app_debug"})
public final class FindYourCarActivity extends androidx.appcompat.app.AppCompatActivity {
    private java.lang.String nameTablet;
    private io.socket.client.Socket mSocket;
    private final io.socket.emitter.Emitter.Listener onError = null;
    private final io.socket.emitter.Emitter.Listener onLink = null;
    private final io.socket.emitter.Emitter.Listener onDisconnect = null;
    private final io.socket.emitter.Emitter.Listener onConnected = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void requestLocationPermission() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public FindYourCarActivity() {
        super();
    }
}