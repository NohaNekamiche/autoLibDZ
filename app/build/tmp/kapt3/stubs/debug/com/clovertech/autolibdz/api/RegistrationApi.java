package com.clovertech.autolibdz.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\'J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0007H\'\u00a8\u0006\b"}, d2 = {"Lcom/clovertech/autolibdz/api/RegistrationApi;", "", "registerLocataire", "Lretrofit2/Call;", "Lcom/clovertech/autolibdz/model/Locataire;", "user", "registerUser", "Lcom/clovertech/autolibdz/model/User;", "app_debug"})
public abstract interface RegistrationApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "users")
    public abstract retrofit2.Call<com.clovertech.autolibdz.model.User> registerUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.clovertech.autolibdz.model.User user);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "locataires")
    public abstract retrofit2.Call<com.clovertech.autolibdz.model.Locataire> registerLocataire(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.clovertech.autolibdz.model.Locataire user);
}