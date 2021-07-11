package ViewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\nR\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"LViewModel/ViewModelCard;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/clovertech/autolibdz/repository/PaymentRepository;", "(Lcom/clovertech/autolibdz/repository/PaymentRepository;)V", "AddCardResponse", "Landroidx/lifecycle/MutableLiveData;", "Lretrofit2/Response;", "Lcom/clovertech/autolibdz/model/paymentResponse;", "getAddCardResponse", "()Landroidx/lifecycle/MutableLiveData;", "CardResponse", "Lcom/clovertech/autolibdz/model/CardRequest;", "getCardResponse", "PayResponse", "Lcom/clovertech/autolibdz/model/PayResponse;", "getPayResponse", "PaySubResponse", "Lcom/clovertech/autolibdz/model/paySubResponse;", "getPaySubResponse", "SubResponse", "Lcom/clovertech/autolibdz/model/SubscriptionResponse;", "getSubResponse", "addSub", "", "subscriptionRequest", "Lcom/clovertech/autolibdz/model/SubscriptionRequest;", "pay", "token", "", "Lcom/clovertech/autolibdz/model/Pay;", "pushCard", "paymentMethod", "Lcom/clovertech/autolibdz/model/PaymentMethod;", "subPay", "paySubRequest", "Lcom/clovertech/autolibdz/model/paySubRequest;", "app_debug"})
public final class ViewModelCard extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.clovertech.autolibdz.model.CardRequest> CardResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<retrofit2.Response<com.clovertech.autolibdz.model.paymentResponse>> AddCardResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<retrofit2.Response<com.clovertech.autolibdz.model.PayResponse>> PayResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<retrofit2.Response<com.clovertech.autolibdz.model.SubscriptionResponse>> SubResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<retrofit2.Response<com.clovertech.autolibdz.model.paySubResponse>> PaySubResponse = null;
    private final com.clovertech.autolibdz.repository.PaymentRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.clovertech.autolibdz.model.CardRequest> getCardResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<retrofit2.Response<com.clovertech.autolibdz.model.paymentResponse>> getAddCardResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<retrofit2.Response<com.clovertech.autolibdz.model.PayResponse>> getPayResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<retrofit2.Response<com.clovertech.autolibdz.model.SubscriptionResponse>> getSubResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<retrofit2.Response<com.clovertech.autolibdz.model.paySubResponse>> getPaySubResponse() {
        return null;
    }
    
    public final void pushCard(@org.jetbrains.annotations.NotNull()
    com.clovertech.autolibdz.model.PaymentMethod paymentMethod) {
    }
    
    public final void pay(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    com.clovertech.autolibdz.model.Pay pay) {
    }
    
    public final void addSub(@org.jetbrains.annotations.NotNull()
    com.clovertech.autolibdz.model.SubscriptionRequest subscriptionRequest) {
    }
    
    public final void subPay(@org.jetbrains.annotations.NotNull()
    com.clovertech.autolibdz.model.paySubRequest paySubRequest) {
    }
    
    public ViewModelCard(@org.jetbrains.annotations.NotNull()
    com.clovertech.autolibdz.repository.PaymentRepository repository) {
        super();
    }
}