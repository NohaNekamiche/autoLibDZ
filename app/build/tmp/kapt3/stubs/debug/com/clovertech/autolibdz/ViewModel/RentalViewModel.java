package com.clovertech.autolibdz.ViewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012J\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bR&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\nR\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/clovertech/autolibdz/ViewModel/RentalViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/clovertech/autolibdz/repository/RentalRepository;", "(Lcom/clovertech/autolibdz/repository/RentalRepository;)V", "locationRep", "Landroidx/lifecycle/MutableLiveData;", "Lretrofit2/Response;", "Lcom/clovertech/autolibdz/DataClasses/Location;", "getLocationRep", "()Landroidx/lifecycle/MutableLiveData;", "setLocationRep", "(Landroidx/lifecycle/MutableLiveData;)V", "msg", "", "getMsg", "setMsg", "myResponse", "Lcom/clovertech/autolibdz/model/Rental;", "getMyResponse", "rentalResponse", "getRentalResponse", "addRental", "", "rental", "endRental", "id", "", "validateLocation", "app_debug"})
public final class RentalViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.clovertech.autolibdz.model.Rental> myResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<retrofit2.Response<com.clovertech.autolibdz.model.Rental>> rentalResponse = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<retrofit2.Response<java.lang.String>> msg;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<retrofit2.Response<com.clovertech.autolibdz.DataClasses.Location>> locationRep;
    private final com.clovertech.autolibdz.repository.RentalRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.clovertech.autolibdz.model.Rental> getMyResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<retrofit2.Response<com.clovertech.autolibdz.model.Rental>> getRentalResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<retrofit2.Response<java.lang.String>> getMsg() {
        return null;
    }
    
    public final void setMsg(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<retrofit2.Response<java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<retrofit2.Response<com.clovertech.autolibdz.DataClasses.Location>> getLocationRep() {
        return null;
    }
    
    public final void setLocationRep(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<retrofit2.Response<com.clovertech.autolibdz.DataClasses.Location>> p0) {
    }
    
    public final void addRental(@org.jetbrains.annotations.NotNull()
    com.clovertech.autolibdz.model.Rental rental) {
    }
    
    public final void endRental(int id) {
    }
    
    public final void validateLocation(int id) {
    }
    
    public RentalViewModel(@org.jetbrains.annotations.NotNull()
    com.clovertech.autolibdz.repository.RentalRepository repository) {
        super();
    }
}