package com.clovertech.autolibdz.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\'J!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0001\u0010\u0019\u001a\u00020\u001aH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/clovertech/autolibdz/api/PayApi;", "", "addSub", "Lretrofit2/Response;", "Lcom/clovertech/autolibdz/model/SubscriptionResponse;", "subscriptionRequest", "Lcom/clovertech/autolibdz/model/SubscriptionRequest;", "(Lcom/clovertech/autolibdz/model/SubscriptionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSubByTenant", "Lretrofit2/Call;", "idTenant", "", "getSubStateByTenant", "Lcom/clovertech/autolibdz/model/SubStateResponse;", "pay", "Lcom/clovertech/autolibdz/model/PayResponse;", "Lcom/clovertech/autolibdz/model/Pay;", "(Lcom/clovertech/autolibdz/model/Pay;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushCard", "Lcom/clovertech/autolibdz/model/paymentResponse;", "paymentMethod", "Lcom/clovertech/autolibdz/model/PaymentMethod;", "(Lcom/clovertech/autolibdz/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subPay", "Lcom/clovertech/autolibdz/model/paySubResponse;", "paySubRequest", "Lcom/clovertech/autolibdz/model/paySubRequest;", "(Lcom/clovertech/autolibdz/model/paySubRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface PayApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "add")
    public abstract java.lang.Object pushCard(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.clovertech.autolibdz.model.PaymentMethod paymentMethod, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.clovertech.autolibdz.model.paymentResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "pay")
    public abstract java.lang.Object pay(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.clovertech.autolibdz.model.Pay pay, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.clovertech.autolibdz.model.PayResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "addSub")
    public abstract java.lang.Object addSub(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.clovertech.autolibdz.model.SubscriptionRequest subscriptionRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.clovertech.autolibdz.model.SubscriptionResponse>> p1);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "getSubByTenant/{idTenant}")
    public abstract retrofit2.Call<com.clovertech.autolibdz.model.SubscriptionResponse> getSubByTenant(@retrofit2.http.Path(value = "idTenant")
    int idTenant);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "subState/{idTenant}")
    public abstract retrofit2.Call<com.clovertech.autolibdz.model.SubStateResponse> getSubStateByTenant(@retrofit2.http.Path(value = "idTenant")
    int idTenant);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "debitBalance")
    public abstract java.lang.Object subPay(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.clovertech.autolibdz.model.paySubRequest paySubRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.clovertech.autolibdz.model.paySubResponse>> p1);
}