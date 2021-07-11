package com.clovertech.autolibdz.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J1\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/clovertech/autolibdz/api/CarsApi;", "", "addRental", "Lretrofit2/Response;", "Lcom/clovertech/autolibdz/model/Rental;", "rental", "(Lcom/clovertech/autolibdz/model/Rental;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCarsListByState", "", "Lcom/clovertech/autolibdz/model/Vehicle;", "state", "", "idborn", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface CarsApi {
    @org.jetbrains.annotations.NotNull()
    public static final com.clovertech.autolibdz.api.CarsApi.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "vehiclesListByState/{state}/{idborn}")
    public abstract java.lang.Object getCarsListByState(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "state")
    java.lang.String state, @retrofit2.http.Path(value = "idborn")
    int idborn, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.clovertech.autolibdz.model.Vehicle>>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "addRental")
    public abstract java.lang.Object addRental(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.clovertech.autolibdz.model.Rental rental, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.clovertech.autolibdz.model.Rental>> p1);
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0086\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/clovertech/autolibdz/api/CarsApi$Companion;", "", "()V", "invoke", "Lcom/clovertech/autolibdz/api/CarsApi;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.clovertech.autolibdz.api.CarsApi invoke() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}