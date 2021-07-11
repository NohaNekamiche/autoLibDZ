package com.clovertech.autolibdz.ViewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0012R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\n\u00a8\u0006\u001d"}, d2 = {"Lcom/clovertech/autolibdz/ViewModel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/clovertech/autolibdz/repository/Repository;", "(Lcom/clovertech/autolibdz/repository/Repository;)V", "authenticationResponse", "Landroidx/lifecycle/MutableLiveData;", "Lretrofit2/Response;", "Lcom/clovertech/autolibdz/model/AuthenticationResponse;", "getAuthenticationResponse", "()Landroidx/lifecycle/MutableLiveData;", "myResponse", "Lcom/clovertech/autolibdz/model/User;", "getMyResponse", "profil", "Lcom/clovertech/autolibdz/model/Profil;", "getProfil", "signalResponse", "Lcom/clovertech/autolibdz/model/Signal;", "getSignalResponse", "getUser", "", "id", "", "pushAuthentication", "authentication", "Lcom/clovertech/autolibdz/model/Authentication;", "pushSignal", "signal", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.clovertech.autolibdz.model.User> myResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<retrofit2.Response<com.clovertech.autolibdz.model.Signal>> signalResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<retrofit2.Response<com.clovertech.autolibdz.model.AuthenticationResponse>> authenticationResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.clovertech.autolibdz.model.Profil> profil = null;
    private final com.clovertech.autolibdz.repository.Repository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.clovertech.autolibdz.model.User> getMyResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<retrofit2.Response<com.clovertech.autolibdz.model.Signal>> getSignalResponse() {
        return null;
    }
    
    public final void getUser() {
    }
    
    public final void pushSignal(@org.jetbrains.annotations.NotNull()
    com.clovertech.autolibdz.model.Signal signal) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<retrofit2.Response<com.clovertech.autolibdz.model.AuthenticationResponse>> getAuthenticationResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.clovertech.autolibdz.model.Profil> getProfil() {
        return null;
    }
    
    public final void pushAuthentication(@org.jetbrains.annotations.NotNull()
    com.clovertech.autolibdz.model.Authentication authentication) {
    }
    
    public final void getUser(int id) {
    }
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.clovertech.autolibdz.repository.Repository repository) {
        super();
    }
}