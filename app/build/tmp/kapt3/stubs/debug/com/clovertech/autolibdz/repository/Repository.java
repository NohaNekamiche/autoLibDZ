package com.clovertech.autolibdz.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/clovertech/autolibdz/repository/Repository;", "", "()V", "getUser", "Lcom/clovertech/autolibdz/model/User;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserById", "Lcom/clovertech/autolibdz/model/Profil;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushAuthentication", "Lretrofit2/Response;", "Lcom/clovertech/autolibdz/model/AuthenticationResponse;", "authentication", "Lcom/clovertech/autolibdz/model/Authentication;", "(Lcom/clovertech/autolibdz/model/Authentication;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushSignal", "Lcom/clovertech/autolibdz/model/Signal;", "signal", "(Lcom/clovertech/autolibdz/model/Signal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class Repository {
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object pushAuthentication(@org.jetbrains.annotations.NotNull()
    com.clovertech.autolibdz.model.Authentication authentication, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.clovertech.autolibdz.model.AuthenticationResponse>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object pushSignal(@org.jetbrains.annotations.NotNull()
    com.clovertech.autolibdz.model.Signal signal, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.clovertech.autolibdz.model.Signal>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUser(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.clovertech.autolibdz.model.User> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUserById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.clovertech.autolibdz.model.Profil> p1) {
        return null;
    }
    
    public Repository() {
        super();
    }
}