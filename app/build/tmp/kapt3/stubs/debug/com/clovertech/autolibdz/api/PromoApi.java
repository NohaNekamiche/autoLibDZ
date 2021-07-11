package com.clovertech.autolibdz.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u000bH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/clovertech/autolibdz/api/PromoApi;", "", "getAllPromo", "Lretrofit2/Response;", "", "Lcom/clovertech/autolibdz/model/Promo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReduPriceByidPromo", "Lretrofit2/Call;", "Lcom/clovertech/autolibdz/model/ReduPriceResponse;", "basePrice", "", "idPromoCode", "idTenant", "Companion", "app_debug"})
public abstract interface PromoApi {
    @org.jetbrains.annotations.NotNull()
    public static final com.clovertech.autolibdz.api.PromoApi.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "getPromoCodes")
    public abstract java.lang.Object getAllPromo(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.clovertech.autolibdz.model.Promo>>> p0);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "getReductionPrice/{basePrice}/{idPromoCode}/{idTenant}")
    public abstract retrofit2.Call<com.clovertech.autolibdz.model.ReduPriceResponse> getReduPriceByidPromo(@retrofit2.http.Path(value = "basePrice")
    int basePrice, @retrofit2.http.Path(value = "idPromoCode")
    int idPromoCode, @retrofit2.http.Path(value = "idTenant")
    int idTenant);
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0086\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/clovertech/autolibdz/api/PromoApi$Companion;", "", "()V", "invoke", "Lcom/clovertech/autolibdz/api/PromoApi;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.clovertech.autolibdz.api.PromoApi invoke() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}