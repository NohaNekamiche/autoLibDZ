package com.clovertech.autolibdz.ui.tarification;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J&\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000eR\u001a\u0010\u001c\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0019\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\"\u0010\u0007R\u001a\u0010#\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001e\"\u0004\b%\u0010 \u00a8\u00060"}, d2 = {"Lcom/clovertech/autolibdz/ui/tarification/TarificationFragment;", "Landroidx/fragment/app/Fragment;", "()V", "cardslist", "", "", "getCardslist", "()[Ljava/lang/String;", "[Ljava/lang/String;", "days", "", "getDays", "()I", "setDays", "(I)V", "idrental", "getIdrental", "setIdrental", "period_d", "getPeriod_d", "setPeriod_d", "rentalViewModel", "Lcom/clovertech/autolibdz/ViewModel/RentalViewModel;", "tarificationViewModel", "Lcom/clovertech/autolibdz/ui/tarification/TarificationViewModel;", "totalprice", "getTotalprice", "setTotalprice", "type", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "typepaiement", "getTypepaiement", "typerental", "getTyperental", "setTyperental", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "app_debug"})
public final class TarificationFragment extends androidx.fragment.app.Fragment {
    private com.clovertech.autolibdz.ui.tarification.TarificationViewModel tarificationViewModel;
    private com.clovertech.autolibdz.ViewModel.RentalViewModel rentalViewModel;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String[] typepaiement = {"Jour", "Heur"};
    @org.jetbrains.annotations.NotNull()
    private java.lang.String typerental = "";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String[] cardslist = {"Credit Card", "Carte d\'abonnement"};
    private int days = 0;
    private int totalprice = 0;
    private int idrental = -1;
    private int period_d = 0;
    public java.lang.String type;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getTypepaiement() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTyperental() {
        return null;
    }
    
    public final void setTyperental(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getCardslist() {
        return null;
    }
    
    public final int getDays() {
        return 0;
    }
    
    public final void setDays(int p0) {
    }
    
    public final int getTotalprice() {
        return 0;
    }
    
    public final void setTotalprice(int p0) {
    }
    
    public final int getIdrental() {
        return 0;
    }
    
    public final void setIdrental(int p0) {
    }
    
    public final int getPeriod_d() {
        return 0;
    }
    
    public final void setPeriod_d(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public TarificationFragment() {
        super();
    }
}