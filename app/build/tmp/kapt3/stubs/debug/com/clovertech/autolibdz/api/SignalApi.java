package com.clovertech.autolibdz.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/clovertech/autolibdz/api/SignalApi;", "", "pushSignal", "Lretrofit2/Response;", "Lcom/clovertech/autolibdz/model/Signal;", "signal", "(Lcom/clovertech/autolibdz/model/Signal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface SignalApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "signals")
    public abstract java.lang.Object pushSignal(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.clovertech.autolibdz.model.Signal signal, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.clovertech.autolibdz.model.Signal>> p1);
}