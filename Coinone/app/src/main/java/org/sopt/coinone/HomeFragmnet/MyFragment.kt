package org.sopt.coinone.HomeFragmnet

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import org.sopt.coinone.api.ServiceCreator
import org.sopt.coinone.data.response.ResponseMyCoinData
import org.sopt.coinone.databinding.ActivityMyBinding
import org.sopt.coinone.myRV.MyFavoriteListAdapter
import org.sopt.coinone.myRV.MyFavoriteListInfo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MyFragment:Fragment() {

    private var _binding: ActivityMyBinding? = null
    private val binding get() =_binding ?: error("View 를 참조하기 위해 binding 이 초기화 되지 않았습니다.")
    private val favoriteListAdapter: MyFavoriteListAdapter by lazy{MyFavoriteListAdapter()}

    var datas= mutableListOf<MyFavoriteListInfo>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ActivityMyBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvFavoriteList.adapter = favoriteListAdapter

        // 서버 연결 o
        loadDatas()

        // 서버 연결 x
//        favoriteListAdapter.favoriteList.addAll(
//            listOf<MyFavoriteListInfo>(
//                MyFavoriteListInfo(
//                    logo="https://lh3.googleusercontent.com/proxy/OnCK_oJvRkdQl_RbFgSJfyQX7cGrONtYPMMMduPHm-naBBdEE9cDs_i-WNx0CRK5J3DkmdJEhIVMkjoQ7qrhI1PRb_mCO6cg3Luihc7vARnTc2jEyPMHfmD4ZsJsRGgIeh6RmKi3gesdpkcj2oEeYvWW5cDDgrrD4sfe1gv313HND_LC-FAWBmeJVWSekiq3GUF9618Q_yqkr20WP0d8gj35M-Bp-NUYyKQpSuwdB4xMXqbQV6i-PC8bWCk",
//                    name_k = "클레이튼",
//                    name_e = "KLAY",
//                    price = "1,900.0",
//                    degree = "66.8",
//                    percent = "(+3.64%)",
//                    state="+"
//                ),
//                MyFavoriteListInfo(
//                    logo="https://lh3.googleusercontent.com/proxy/OnCK_oJvRkdQl_RbFgSJfyQX7cGrONtYPMMMduPHm-naBBdEE9cDs_i-WNx0CRK5J3DkmdJEhIVMkjoQ7qrhI1PRb_mCO6cg3Luihc7vARnTc2jEyPMHfmD4ZsJsRGgIeh6RmKi3gesdpkcj2oEeYvWW5cDDgrrD4sfe1gv313HND_LC-FAWBmeJVWSekiq3GUF9618Q_yqkr20WP0d8gj35M-Bp-NUYyKQpSuwdB4xMXqbQV6i-PC8bWCk",
//                    name_k = "클레이튼",
//                    name_e = "KLAY",
//                    price = "1,900.0",
//                    degree = "66.8",
//                    percent = "(+3.64%)",
//                    state="+"
//                ),
//                MyFavoriteListInfo(
//                    logo="https://lh3.googleusercontent.com/proxy/OnCK_oJvRkdQl_RbFgSJfyQX7cGrONtYPMMMduPHm-naBBdEE9cDs_i-WNx0CRK5J3DkmdJEhIVMkjoQ7qrhI1PRb_mCO6cg3Luihc7vARnTc2jEyPMHfmD4ZsJsRGgIeh6RmKi3gesdpkcj2oEeYvWW5cDDgrrD4sfe1gv313HND_LC-FAWBmeJVWSekiq3GUF9618Q_yqkr20WP0d8gj35M-Bp-NUYyKQpSuwdB4xMXqbQV6i-PC8bWCk",
//                    name_k = "클레이튼",
//                    name_e = "KLAY",
//                    price = "1,900.0",
//                    degree = "66.8",
//                    percent = "(+3.64%)",
//                    state="+"
//                ),
//                MyFavoriteListInfo(
//                    logo="https://lh3.googleusercontent.com/proxy/OnCK_oJvRkdQl_RbFgSJfyQX7cGrONtYPMMMduPHm-naBBdEE9cDs_i-WNx0CRK5J3DkmdJEhIVMkjoQ7qrhI1PRb_mCO6cg3Luihc7vARnTc2jEyPMHfmD4ZsJsRGgIeh6RmKi3gesdpkcj2oEeYvWW5cDDgrrD4sfe1gv313HND_LC-FAWBmeJVWSekiq3GUF9618Q_yqkr20WP0d8gj35M-Bp-NUYyKQpSuwdB4xMXqbQV6i-PC8bWCk",
//                    name_k = "클레이튼",
//                    name_e = "KLAY",
//                    price = "1,900.0",
//                    degree = "66.8",
//                    percent = "(+3.64%)",
//                    state="+",
//                    graph_image = ""
//                ),
//            )
//        )
//        // 데이터 변경되었으니 업데이트해라
//        favoriteListAdapter.notifyDataSetChanged()
    }

    // 서버 연결
    private fun loadDatas(){
        ServiceCreator.coinoneService.getCoinData(
            ).enqueue(object : Callback<ResponseMyCoinData> {
                override fun onFailure(call: Call<ResponseMyCoinData>, t: Throwable) {
                    Log.d("통신 실패", "${t}")
                }

                override fun onResponse(
                    call: Call<ResponseMyCoinData>,
                    response: Response<ResponseMyCoinData>
                ) {
                    // 통신 성공
                    if (response.isSuccessful) {   // statusCode가 200-300 사이일 때, 응답 body 이용 가능
                        Log.d("서버",response.body()!!.success.toString())
                        Log.d("서버",response.body()!!.status.toString())
                        Log.d("서버",response.body()!!.coin.toString())
                        // if (response.body()!!.success) {  // 참고 코드에서 없는 부분
                        if(true) {
                            Log.d("서버성공", "MyFavorite 성공")
                            Log.d(response.body()!!.coin.toString(),response.body()!!.coin.toString())

                            var coin_logo: String
                            var coin_name_k: String
                            var coin_name_e: String
                            var coin_price: String
                            var coin_degree: String
                            var coin_percent: String
                            var coin_state: String
                            var coin_graph_image: String

                            for (i in 0 until response.body()!!.coin.size){
                                coin_logo = response.body()!!.coin[i]!!.coinLogoImage
                                coin_name_k = response.body()!!.coin[i]!!.coinKoreanTitle
                                coin_name_e = response.body()!!.coin[i]!!.coinEnglishTitle
                                coin_price = response.body()!!.coin[i]!!.coinTotalPrice
                                coin_degree = response.body()!!.coin[i]!!.degree
                                coin_percent = response.body()!!.coin[i]!!.percentage
                                coin_state = response.body()!!.coin[i]!!.riseOrDescent
                                coin_graph_image = response.body()!!.coin[i]!!.graphImage

                                Log.d("서버",response.body()!!.coin[i]!!.coinKoreanTitle.toString())

                                datas= mutableListOf<MyFavoriteListInfo>()
                                datas.apply{
                                    add(
                                        MyFavoriteListInfo(
                                            logo=coin_logo,
                                            name_k = coin_name_k,
                                            name_e = coin_name_e,
                                            price = coin_price,
                                            degree = coin_degree,
                                            percent = "(${coin_state}${coin_percent}%)",
                                            state=coin_state,
                                            graph_image=coin_graph_image
                                        ))}

                                favoriteListAdapter.favoriteList.addAll(
                                    datas
                                )

                                // 데이터 변경되었으니 업데이트해라
                                favoriteListAdapter.notifyDataSetChanged()
                            }
                        } else {
                            Log.d("서버실패", "${response.body()}")
                        }
                    }
                }

            })
    }

}