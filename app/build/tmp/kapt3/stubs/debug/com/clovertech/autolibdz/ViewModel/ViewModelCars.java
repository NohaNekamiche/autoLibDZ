package com.clovertech.autolibdz.ViewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u0017H\u0014R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/clovertech/autolibdz/ViewModel/ViewModelCars;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/clovertech/autolibdz/repository/CarsRepository;", "(Lcom/clovertech/autolibdz/repository/CarsRepository;)V", "carsByStat", "Landroidx/lifecycle/LiveData;", "", "Lcom/clovertech/autolibdz/model/Vehicle;", "getCarsByStat", "()Landroidx/lifecycle/LiveData;", "job", "Lkotlinx/coroutines/Job;", "locationRep", "Landroidx/lifecycle/MutableLiveData;", "Lretrofit2/Response;", "Lcom/clovertech/autolibdz/DataClasses/Location;", "myResponse", "addRental", "Lcom/clovertech/autolibdz/model/Rental;", "rental", "(Lcom/clovertech/autolibdz/model/Rental;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getListCarsByStat", "", "Status", "", "idborn", "", "onCleared", "app_debug"})
public final class ViewModelCars extends androidx.lifecycle.ViewModel {
    private kotlinx.coroutines.Job job;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.clovertech.autolibdz.model.Vehicle>> myResponse = null;
    private final androidx.lifecycle.MutableLiveData<retrofit2.Response<com.clovertech.autolibdz.DataClasses.Location>> locationRep = null;
    private final com.clovertech.autolibdz.repository.CarsRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.clovertech.autolibdz.model.Vehicle>> getCarsByStat() {
        return null;
    }
    
    public final void getListCarsByStat(@org.jetbrains.annotations.NotNull()
    java.lang.String Status, int idborn) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addRental(@org.jetbrains.annotations.NotNull()
    com.clovertech.autolibdz.model.Rental rental, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.clovertech.autolibdz.model.Rental> p1) {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public ViewModelCars(@org.jetbrains.annotations.NotNull()
    com.clovertech.autolibdz.repository.CarsRepository repository) {
        super();
    }
}