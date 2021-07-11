package com.clovertech.autolibdz.api

import com.clovertech.autolibdz.model.Pay
import com.clovertech.autolibdz.model.PayResponse
import com.clovertech.autolibdz.model.PaymentMethod
import com.clovertech.autolibdz.model.paymentResponse
import com.clovertech.autolibdz.model.SubscriptionRequest
import com.clovertech.autolibdz.model.SubscriptionResponse
import com.clovertech.autolibdz.model.paySubRequest
import com.clovertech.autolibdz.model.paySubResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface PayApi {
    @POST("add")
    suspend fun pushCard(
            @Body paymentMethod: PaymentMethod
    ): Response<paymentResponse>
    @POST("pay")
    suspend fun pay(
            @Body pay: Pay
    ): Response<PayResponse>
    @POST("addSub")
    suspend fun addSub(
            @Body subscriptionRequest: SubscriptionRequest
    ): Response<SubscriptionResponse>

    @GET("getSubByTenant/{idTenant}")
    fun getSubByTenant(@Path("idTenant") idTenant:Int): Call<SubscriptionResponse>
    @POST("debitBalance")
    suspend fun subPay(
            @Body paySubRequest: paySubRequest
    ): Response<paySubResponse>
}