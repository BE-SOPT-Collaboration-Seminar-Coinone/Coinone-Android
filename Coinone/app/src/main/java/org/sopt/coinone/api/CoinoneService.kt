package org.sopt.coinone.api

import org.sopt.coinone.data.response.ResponseMyCoinData
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET

interface CoinoneService {

    @GET("/api/my-coin/1")
    fun getCoinData(
    ) : Call<ResponseMyCoinData>
}