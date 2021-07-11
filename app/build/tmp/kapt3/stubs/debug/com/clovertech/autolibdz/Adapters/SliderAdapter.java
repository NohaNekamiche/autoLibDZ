package com.clovertech.autolibdz.Adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010\'\u001a\u00020\u0010H\u0016J\u0018\u0010(\u001a\u00020&2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0010H\u0016J\u0018\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010%\u001a\u00020&H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000fX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u000fX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001b\u00a8\u0006-"}, d2 = {"Lcom/clovertech/autolibdz/Adapters/SliderAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "layoutInflater", "Landroid/view/LayoutInflater;", "getLayoutInflater", "()Landroid/view/LayoutInflater;", "setLayoutInflater", "(Landroid/view/LayoutInflater;)V", "lottieAnimations", "", "", "getLottieAnimations", "()[Ljava/lang/Integer;", "setLottieAnimations", "([Ljava/lang/Integer;)V", "[Ljava/lang/Integer;", "slider_descriptions", "", "getSlider_descriptions", "()[Ljava/lang/String;", "setSlider_descriptions", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "slider_first_headers", "getSlider_first_headers", "setSlider_first_headers", "destroyItem", "", "container", "Landroid/view/ViewGroup;", "position", "object", "", "getCount", "instantiateItem", "isViewFromObject", "", "view", "Landroid/view/View;", "app_debug"})
public final class SliderAdapter extends androidx.viewpager.widget.PagerAdapter {
    @org.jetbrains.annotations.Nullable()
    private android.view.LayoutInflater layoutInflater;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String[] slider_first_headers = {"Welcome to AutoLibDZ", "Secure payment", "Nearby rental"};
    @org.jetbrains.annotations.NotNull()
    private java.lang.Integer[] lottieAnimations = {2131886080, 2131886081, 2131886082};
    @org.jetbrains.annotations.NotNull()
    private java.lang.String[] slider_descriptions = {"AutoLib Dz is a digital application that help users to find a car and start there journey", "AutoLib Dz ensure the security of your informations and your payments", "We help you to find car from the closest parks to you"};
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.LayoutInflater getLayoutInflater() {
        return null;
    }
    
    public final void setLayoutInflater(@org.jetbrains.annotations.Nullable()
    android.view.LayoutInflater p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getSlider_first_headers() {
        return null;
    }
    
    public final void setSlider_first_headers(@org.jetbrains.annotations.NotNull()
    java.lang.String[] p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Integer[] getLottieAnimations() {
        return null;
    }
    
    public final void setLottieAnimations(@org.jetbrains.annotations.NotNull()
    java.lang.Integer[] p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getSlider_descriptions() {
        return null;
    }
    
    public final void setSlider_descriptions(@org.jetbrains.annotations.NotNull()
    java.lang.String[] p0) {
    }
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Object instantiateItem(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup container, int position) {
        return null;
    }
    
    @java.lang.Override()
    public boolean isViewFromObject(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.Object object) {
        return false;
    }
    
    @java.lang.Override()
    public void destroyItem(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup container, int position, @org.jetbrains.annotations.NotNull()
    java.lang.Object object) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    public SliderAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}