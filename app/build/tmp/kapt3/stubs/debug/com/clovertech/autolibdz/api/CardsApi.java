package com.clovertech.autolibdz.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/clovertech/autolibdz/api/CardsApi;", "", "getAllCards", "Lretrofit2/Response;", "", "Lcom/clovertech/autolibdz/model/PaymentInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface CardsApi {
    @org.jetbrains.annotations.NotNull()
    public static final com.clovertech.autolibdz.api.CardsApi.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "all")
    public abstract java.lang.Object getAllCards(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.clovertech.autolibdz.model.PaymentInfo>>> p0);
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0086\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/clovertech/autolibdz/api/CardsApi$Companion;", "", "()V", "invoke", "Lcom/clovertech/autolibdz/api/CardsApi;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.clovertech.autolibdz.api.CardsApi invoke() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}