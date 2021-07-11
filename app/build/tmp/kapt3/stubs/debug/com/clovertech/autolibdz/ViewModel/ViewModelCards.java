package com.clovertech.autolibdz.ViewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0010H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0012"}, d2 = {"Lcom/clovertech/autolibdz/ViewModel/ViewModelCards;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/clovertech/autolibdz/repository/CardsRepository;", "(Lcom/clovertech/autolibdz/repository/CardsRepository;)V", "job", "Lkotlinx/coroutines/Job;", "myResponse", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/clovertech/autolibdz/model/PaymentInfo;", "userCards", "Landroidx/lifecycle/LiveData;", "getUserCards", "()Landroidx/lifecycle/LiveData;", "getCards", "", "onCleared", "app_debug"})
public final class ViewModelCards extends androidx.lifecycle.ViewModel {
    private kotlinx.coroutines.Job job;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.clovertech.autolibdz.model.PaymentInfo>> myResponse = null;
    private final com.clovertech.autolibdz.repository.CardsRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.clovertech.autolibdz.model.PaymentInfo>> getUserCards() {
        return null;
    }
    
    public final void getCards() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public ViewModelCards(@org.jetbrains.annotations.NotNull()
    com.clovertech.autolibdz.repository.CardsRepository repository) {
        super();
    }
}