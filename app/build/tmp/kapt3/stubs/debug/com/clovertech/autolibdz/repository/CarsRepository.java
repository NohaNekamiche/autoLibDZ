package com.clovertech.autolibdz.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\'\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/clovertech/autolibdz/repository/CarsRepository;", "Lcom/clovertech/autolibdz/api/SafeCarsRequest;", "apiCarsByStat", "Lcom/clovertech/autolibdz/api/CarsApi;", "(Lcom/clovertech/autolibdz/api/CarsApi;)V", "addRental", "Lcom/clovertech/autolibdz/model/Rental;", "rental", "(Lcom/clovertech/autolibdz/model/Rental;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCarsByStat", "", "Lcom/clovertech/autolibdz/model/Vehicle;", "Stat", "", "idborn", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CarsRepository extends com.clovertech.autolibdz.api.SafeCarsRequest {
    private final com.clovertech.autolibdz.api.CarsApi apiCarsByStat = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCarsByStat(@org.jetbrains.annotations.NotNull()
    java.lang.String Stat, int idborn, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.clovertech.autolibdz.model.Vehicle>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addRental(@org.jetbrains.annotations.NotNull()
    com.clovertech.autolibdz.model.Rental rental, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.clovertech.autolibdz.model.Rental> p1) {
        return null;
    }
    
    public CarsRepository(@org.jetbrains.annotations.NotNull()
    com.clovertech.autolibdz.api.CarsApi apiCarsByStat) {
        super();
    }
}