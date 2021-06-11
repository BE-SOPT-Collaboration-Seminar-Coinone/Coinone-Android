package org.sopt.coinone.data.response

data class ResponseMyCoinData(
    val status : Int,
    val success : Boolean,
    val message : String,
    val data: CoinData?
)

data class CoinData(
    val _id: String,
    val coinLogoImage: String,
    val coinEnglishTitle: String,
    val coinKoreanTitle: String,
    val coinCurrentPrice: String,
    val riseOrDescent: String,
    val degree: String,
    val percentage: String,
    val coinTotalPrice: String,
    val graphImage: String
)