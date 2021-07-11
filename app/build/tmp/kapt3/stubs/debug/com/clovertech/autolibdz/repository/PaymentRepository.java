package com.clovertech.autolibdz.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\'\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/clovertech/autolibdz/repository/PaymentRepository;", "", "()V", "addSub", "Lretrofit2/Response;", "Lcom/clovertech/autolibdz/model/SubscriptionResponse;", "subscriptionRequest", "Lcom/clovertech/autolibdz/model/SubscriptionRequest;", "(Lcom/clovertech/autolibdz/model/SubscriptionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pay", "Lcom/clovertech/autolibdz/model/PayResponse;", "token", "", "Lcom/clovertech/autolibdz/model/Pay;", "(Ljava/lang/String;Lcom/clovertech/autolibdz/model/Pay;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushCard", "Lcom/clovertech/autolibdz/model/paymentResponse;", "paymentMethod", "Lcom/clovertech/autolibdz/model/PaymentMethod;", "(Lcom/clovertech/autolibdz/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subPay", "Lcom/clovertech/autolibdz/model/paySubResponse;", "paySubRequest", "Lcom/clovertech/autolibdz/model/paySubRequest;", "(Lcom/clovertech/autolibdz/model/paySubRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PaymentRepository {
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object pushCard(@org.jetbrains.annotations.NotNull()
    com.clovertech.autolibdz.model.PaymentMethod paymentMethod, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.clovertech.autolibdz.model.paymentResponse>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object pay(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    com.clovertech.autolibdz.model.Pay pay, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.clovertech.autolibdz.model.PayResponse>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addSub(@org.jetbrains.annotations.NotNull()
    com.clovertech.autolibdz.model.SubscriptionRequest subscriptionRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.clovertech.autolibdz.model.SubscriptionResponse>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object subPay(@org.jetbrains.annotations.NotNull()
    com.clovertech.autolibdz.model.paySubRequest paySubRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.clovertech.autolibdz.model.paySubResponse>> p1) {
        return null;
    }
    
    public PaymentRepository() {
        super();
    }
}