package com.clovertech.autolibdz.ViewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0010H\u0014R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/clovertech/autolibdz/ViewModel/BillViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/clovertech/autolibdz/repository/FactureRepository;", "(Lcom/clovertech/autolibdz/repository/FactureRepository;)V", "facts", "Landroidx/lifecycle/LiveData;", "", "Lcom/clovertech/autolibdz/model/Facture;", "getFacts", "()Landroidx/lifecycle/LiveData;", "job", "Lkotlinx/coroutines/Job;", "myResponse", "Landroidx/lifecycle/MutableLiveData;", "getFact", "", "onCleared", "app_debug"})
public final class BillViewModel extends androidx.lifecycle.ViewModel {
    private kotlinx.coroutines.Job job;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.clovertech.autolibdz.model.Facture>> myResponse = null;
    private final com.clovertech.autolibdz.repository.FactureRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.clovertech.autolibdz.model.Facture>> getFacts() {
        return null;
    }
    
    public final void getFact() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public BillViewModel(@org.jetbrains.annotations.NotNull()
    com.clovertech.autolibdz.repository.FactureRepository repository) {
        super();
    }
}