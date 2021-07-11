package com.clovertech.autolibdz.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u000f\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/clovertech/autolibdz/api/RentalApi;", "", "addRental", "Lretrofit2/Response;", "Lcom/clovertech/autolibdz/model/Rental;", "rental", "(Lcom/clovertech/autolibdz/model/Rental;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "endRental", "", "idVehicule", "", "idBorn", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateLocation", "Lcom/clovertech/autolibdz/DataClasses/Location;", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface RentalApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "addRental")
    public abstract java.lang.Object addRental(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.clovertech.autolibdz.model.Rental rental, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.clovertech.autolibdz.model.Rental>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PUT(value = "updateVehicleState/{id}")
    public abstract java.lang.Object validateLocation(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.clovertech.autolibdz.DataClasses.Location>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "endRental/{idVehicule}/{idBorn}")
    public abstract java.lang.Object endRental(@retrofit2.http.Path(value = "idVehicule")
    int idVehicule, @retrofit2.http.Path(value = "idBorn")
    int idBorn, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.lang.String>> p2);
}