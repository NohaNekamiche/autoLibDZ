package com.clovertech.autolibdz.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/clovertech/autolibdz/repository/FactureRepository;", "Lcom/clovertech/autolibdz/api/SafeFactureRequest;", "apiFactures", "Lcom/clovertech/autolibdz/api/FactureApi;", "(Lcom/clovertech/autolibdz/api/FactureApi;)V", "geBillByID", "Lcom/clovertech/autolibdz/model/DownResponse;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFactures", "", "Lcom/clovertech/autolibdz/model/Facture;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class FactureRepository extends com.clovertech.autolibdz.api.SafeFactureRequest {
    private final com.clovertech.autolibdz.api.FactureApi apiFactures = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFactures(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.clovertech.autolibdz.model.Facture>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object geBillByID(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.clovertech.autolibdz.model.DownResponse> p1) {
        return null;
    }
    
    public FactureRepository(@org.jetbrains.annotations.NotNull()
    com.clovertech.autolibdz.api.FactureApi apiFactures) {
        super();
    }
}