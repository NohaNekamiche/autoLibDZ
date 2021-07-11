package com.clovertech.autolibdz.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0013H\u0014J\b\u0010\u0017\u001a\u00020\u0013H\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/clovertech/autolibdz/activities/FindYourCarActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "bluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "getBluetoothAdapter", "()Landroid/bluetooth/BluetoothAdapter;", "setBluetoothAdapter", "(Landroid/bluetooth/BluetoothAdapter;)V", "mSocket", "Lio/socket/client/Socket;", "onConnected", "Lio/socket/emitter/Emitter$Listener;", "onDisconnect", "onError", "onLink", "onLinkFailed", "onLinkStarted", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "requestLocationPermission", "app_debug"})
public final class FindYourCarActivity extends androidx.appcompat.app.AppCompatActivity {
    private io.socket.client.Socket mSocket;
    @org.jetbrains.annotations.Nullable()
    private android.bluetooth.BluetoothAdapter bluetoothAdapter;
    private final io.socket.emitter.Emitter.Listener onError = null;
    private final io.socket.emitter.Emitter.Listener onLink = null;
    private final io.socket.emitter.Emitter.Listener onDisconnect = null;
    private final io.socket.emitter.Emitter.Listener onLinkFailed = null;
    private final io.socket.emitter.Emitter.Listener onLinkStarted = null;
    private final io.socket.emitter.Emitter.Listener onConnected = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final android.bluetooth.BluetoothAdapter getBluetoothAdapter() {
        return null;
    }
    
    public final void setBluetoothAdapter(@org.jetbrains.annotations.Nullable()
    android.bluetooth.BluetoothAdapter p0) {
    }
    
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