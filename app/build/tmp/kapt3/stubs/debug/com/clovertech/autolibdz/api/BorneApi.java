package com.clovertech.autolibdz.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u001e\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/clovertech/autolibdz/api/BorneApi;", "", "getBornes", "Lretrofit2/Call;", "", "Lcom/clovertech/autolibdz/model/Borne;", "getVehiculesBorne", "Lcom/clovertech/autolibdz/model/Vehicle;", "idBorne", "", "app_debug"})
public abstract interface BorneApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "bornes")
    public abstract retrofit2.Call<java.util.List<com.clovertech.autolibdz.model.Borne>> getBornes();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "borne/{id}/vehicles")
    public abstract retrofit2.Call<java.util.List<com.clovertech.autolibdz.model.Vehicle>> getVehiculesBorne(@retrofit2.http.Path(value = "id")
    int idBorne);
}