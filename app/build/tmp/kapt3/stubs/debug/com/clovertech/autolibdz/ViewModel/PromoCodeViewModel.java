package com.clovertech.autolibdz.ViewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u000fH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/clovertech/autolibdz/ViewModel/PromoCodeViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/clovertech/autolibdz/repository/PromoRepository;", "(Lcom/clovertech/autolibdz/repository/PromoRepository;)V", "job", "Lkotlinx/coroutines/Job;", "myResponse", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/clovertech/autolibdz/model/Promo;", "promo", "Landroidx/lifecycle/LiveData;", "getPromo", "()Landroidx/lifecycle/LiveData;", "", "onCleared", "app_debug"})
public final class PromoCodeViewModel extends androidx.lifecycle.ViewModel {
    private kotlinx.coroutines.Job job;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.clovertech.autolibdz.model.Promo>> myResponse = null;
    private final com.clovertech.autolibdz.repository.PromoRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.clovertech.autolibdz.model.Promo>> getPromo() {
        return null;
    }
    
    public final void getPromo() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public PromoCodeViewModel(@org.jetbrains.annotations.NotNull()
    com.clovertech.autolibdz.repository.PromoRepository repository) {
        super();
    }
}