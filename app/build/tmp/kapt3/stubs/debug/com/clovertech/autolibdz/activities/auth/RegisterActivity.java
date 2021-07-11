package com.clovertech.autolibdz.activities.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\u0006\u0010\"\u001a\u00020\u001bJ\u0016\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006\'"}, d2 = {"Lcom/clovertech/autolibdz/activities/auth/RegisterActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "()V", "currentFragment", "", "getCurrentFragment", "()I", "setCurrentFragment", "(I)V", "model", "Lcom/clovertech/autolibdz/ViewModel/RegisterViewModel;", "getModel", "()Lcom/clovertech/autolibdz/ViewModel/RegisterViewModel;", "model$delegate", "Lkotlin/Lazy;", "storage", "Lcom/google/firebase/storage/FirebaseStorage;", "getStorage", "()Lcom/google/firebase/storage/FirebaseStorage;", "storageReference", "Lcom/google/firebase/storage/StorageReference;", "getStorageReference", "()Lcom/google/firebase/storage/StorageReference;", "setStorageReference", "(Lcom/google/firebase/storage/StorageReference;)V", "onBackPressed", "", "onClick", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "register", "uploadImage", "profile", "Landroid/net/Uri;", "permit", "app_debug"})
public final class RegisterActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener {
    private int currentFragment = 1;
    private final kotlin.Lazy model$delegate = null;
    public com.google.firebase.storage.StorageReference storageReference;
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.storage.FirebaseStorage storage = null;
    private java.util.HashMap _$_findViewCache;
    
    public final int getCurrentFragment() {
        return 0;
    }
    
    public final void setCurrentFragment(int p0) {
    }
    
    private final com.clovertech.autolibdz.ViewModel.RegisterViewModel getModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.storage.StorageReference getStorageReference() {
        return null;
    }
    
    public final void setStorageReference(@org.jetbrains.annotations.NotNull()
    com.google.firebase.storage.StorageReference p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.storage.FirebaseStorage getStorage() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    public final void register() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public final void uploadImage(@org.jetbrains.annotations.NotNull()
    android.net.Uri profile, @org.jetbrains.annotations.NotNull()
    android.net.Uri permit) {
    }
    
    public RegisterActivity() {
        super();
    }
}