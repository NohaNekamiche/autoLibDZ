package com.clovertech.autolibdz.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010T\u001a\u0002002\u0006\u0010U\u001a\u00020VR\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u000f\u0010\fR\u001b\u0010\u0011\u001a\u00020\u00128FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010\b\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010\b\u001a\u0004\b\"\u0010#R\u001b\u0010%\u001a\u00020&8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010\b\u001a\u0004\b\'\u0010(R\u001b\u0010*\u001a\u00020+8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b.\u0010\b\u001a\u0004\b,\u0010-R#\u0010/\u001a\n 1*\u0004\u0018\u000100008BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b4\u0010\b\u001a\u0004\b2\u00103R#\u00105\u001a\n 1*\u0004\u0018\u000100008BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b7\u0010\b\u001a\u0004\b6\u00103R#\u00108\u001a\n 1*\u0004\u0018\u000100008BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b:\u0010\b\u001a\u0004\b9\u00103R#\u0010;\u001a\n 1*\u0004\u0018\u000100008BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b=\u0010\b\u001a\u0004\b<\u00103R\u001b\u0010>\u001a\u00020?8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bB\u0010\b\u001a\u0004\b@\u0010AR#\u0010C\u001a\n 1*\u0004\u0018\u000100008BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bE\u0010\b\u001a\u0004\bD\u00103R#\u0010F\u001a\n 1*\u0004\u0018\u000100008BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bH\u0010\b\u001a\u0004\bG\u00103R#\u0010I\u001a\n 1*\u0004\u0018\u000100008BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bK\u0010\b\u001a\u0004\bJ\u00103R\u001b\u0010L\u001a\u00020M8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bP\u0010\b\u001a\u0004\bN\u0010OR\u001b\u0010Q\u001a\u00020\u001c8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bS\u0010\b\u001a\u0004\bR\u0010\u001e\u00a8\u0006W"}, d2 = {"Lcom/clovertech/autolibdz/utils/RetrofitInstance;", "", "()V", "AddRentalApi", "Lcom/clovertech/autolibdz/api/RentalApi;", "getAddRentalApi", "()Lcom/clovertech/autolibdz/api/RentalApi;", "AddRentalApi$delegate", "Lkotlin/Lazy;", "api", "Lcom/clovertech/autolibdz/api/UserApi;", "getApi", "()Lcom/clovertech/autolibdz/api/UserApi;", "api$delegate", "apiUser", "getApiUser", "apiUser$delegate", "authenticationApi", "Lcom/clovertech/autolibdz/api/AuthenticationApi;", "getAuthenticationApi", "()Lcom/clovertech/autolibdz/api/AuthenticationApi;", "authenticationApi$delegate", "borneApi", "Lcom/clovertech/autolibdz/api/BorneApi;", "getBorneApi", "()Lcom/clovertech/autolibdz/api/BorneApi;", "borneApi$delegate", "cardApi", "Lcom/clovertech/autolibdz/api/PayApi;", "getCardApi", "()Lcom/clovertech/autolibdz/api/PayApi;", "cardApi$delegate", "client", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "client$delegate", "factureApi", "Lcom/clovertech/autolibdz/api/FactureApi;", "getFactureApi", "()Lcom/clovertech/autolibdz/api/FactureApi;", "factureApi$delegate", "registrationApi", "Lcom/clovertech/autolibdz/api/RegistrationApi;", "getRegistrationApi", "()Lcom/clovertech/autolibdz/api/RegistrationApi;", "registrationApi$delegate", "retrofitAddCard", "Lretrofit2/Retrofit;", "kotlin.jvm.PlatformType", "getRetrofitAddCard", "()Lretrofit2/Retrofit;", "retrofitAddCard$delegate", "retrofitGetCard", "getRetrofitGetCard", "retrofitGetCard$delegate", "retrofitGetCards", "getRetrofitGetCards", "retrofitGetCards$delegate", "retrofitGetPring", "getRetrofitGetPring", "retrofitGetPring$delegate", "retrofitReduPrice", "Lcom/clovertech/autolibdz/api/PromoApi;", "getRetrofitReduPrice", "()Lcom/clovertech/autolibdz/api/PromoApi;", "retrofitReduPrice$delegate", "retrofitRental", "getRetrofitRental", "retrofitRental$delegate", "retrofitSignal", "getRetrofitSignal", "retrofitSignal$delegate", "retrofitUser", "getRetrofitUser", "retrofitUser$delegate", "signalApi", "Lcom/clovertech/autolibdz/api/SignalApi;", "getSignalApi", "()Lcom/clovertech/autolibdz/api/SignalApi;", "signalApi$delegate", "subApi", "getSubApi", "subApi$delegate", "retrofitInstance", "url", "", "app_debug"})
public final class RetrofitInstance {
    private static final kotlin.Lazy client$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy authenticationApi$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy registrationApi$delegate = null;
    private static final kotlin.Lazy retrofitUser$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy api$delegate = null;
    private static final kotlin.Lazy retrofitSignal$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy signalApi$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy borneApi$delegate = null;
    private static final kotlin.Lazy retrofitGetCard$delegate = null;
    private static final kotlin.Lazy retrofitGetPring$delegate = null;
    private static final kotlin.Lazy retrofitGetCards$delegate = null;
    private static final kotlin.Lazy retrofitRental$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy AddRentalApi$delegate = null;
    private static final kotlin.Lazy retrofitAddCard$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy retrofitReduPrice$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy subApi$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy factureApi$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy apiUser$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy cardApi$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.clovertech.autolibdz.utils.RetrofitInstance INSTANCE = null;
    
    private final okhttp3.OkHttpClient getClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit retrofitInstance(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.clovertech.autolibdz.api.AuthenticationApi getAuthenticationApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.clovertech.autolibdz.api.RegistrationApi getRegistrationApi() {
        return null;
    }
    
    private final retrofit2.Retrofit getRetrofitUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.clovertech.autolibdz.api.UserApi getApi() {
        return null;
    }
    
    private final retrofit2.Retrofit getRetrofitSignal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.clovertech.autolibdz.api.SignalApi getSignalApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.clovertech.autolibdz.api.BorneApi getBorneApi() {
        return null;
    }
    
    private final retrofit2.Retrofit getRetrofitGetCard() {
        return null;
    }
    
    private final retrofit2.Retrofit getRetrofitGetPring() {
        return null;
    }
    
    private final retrofit2.Retrofit getRetrofitGetCards() {
        return null;
    }
    
    private final retrofit2.Retrofit getRetrofitRental() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.clovertech.autolibdz.api.RentalApi getAddRentalApi() {
        return null;
    }
    
    private final retrofit2.Retrofit getRetrofitAddCard() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.clovertech.autolibdz.api.PromoApi getRetrofitReduPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.clovertech.autolibdz.api.PayApi getSubApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.clovertech.autolibdz.api.FactureApi getFactureApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.clovertech.autolibdz.api.UserApi getApiUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.clovertech.autolibdz.api.PayApi getCardApi() {
        return null;
    }
    
    private RetrofitInstance() {
        super();
    }
}