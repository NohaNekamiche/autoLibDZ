package com.clovertech.autolibdz.repository

import com.clovertech.autolibdz.api.FactureApi
import com.clovertech.autolibdz.api.SafeFactureRequest

class FactureRepository(
        private val apiFactures : FactureApi
) : SafeFactureRequest(){
         suspend fun getFactures(token:String)=ApiFactureRequest{apiFactures.getFactures(token)}
        suspend fun geBillByID(token:String,id:Int)=ApiFactureRequest{apiFactures.getBillByID(token,id)}

    }

