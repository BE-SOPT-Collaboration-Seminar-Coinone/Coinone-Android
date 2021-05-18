package org.sopt.sopt_coinone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.sopt.sopt_coinone.databinding.ActivityCoinListBinding

class CoinListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCoinListBinding
    private lateinit var coinListAdapter: CoinListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCoinListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initCoinListRecyclerView()
    }

    private fun initCoinListRecyclerView() {
        coinListAdapter = CoinListAdapter()

        binding.rvCoinList.adapter = coinListAdapter

        coinListAdapter.coinList.addAll(
            listOf(
                CoinListInfo(
                    name ="XRP",
                    nameKr = "리플",
                    price = "1,625",
                    rate="-0.37%",
                    trading="2,059억"
                ),
                CoinListInfo(
                    name ="BTC",
                    nameKr = "비트코인",
                    price = "1,625",
                    rate="-0.37%",
                    trading="2,059억"
                ),

                CoinListInfo(
                    name ="ETH",
                    nameKr = "이더리움",
                    price = "1,625",
                    rate="-0.37%",
                    trading="2,059억"
                ),
                CoinListInfo(
                    name ="KLAY",
                    nameKr = "클레이튼",
                    price = "1,625",
                    rate="-0.37%",
                    trading="2,059억"
                ),
                CoinListInfo(
                    name ="BCH",
                    nameKr = "비트코인 캐시",
                    price = "1,625",
                    rate="-0.37%",
                    trading="2,059억"
                ),
                CoinListInfo(
                    name ="EOS",
                    nameKr = "이오스",
                    price = "1,625",
                    rate="-0.37%",
                    trading="2,059억"
                ),

                CoinListInfo(
                    name ="XRP",
                    nameKr = "리플",
                    price = "1,625",
                    rate="-0.37%",
                    trading="2,059억"
                ),
                CoinListInfo(
                    name ="BTC",
                    nameKr = "비트코인",
                    price = "1,625",
                    rate="-0.37%",
                    trading="2,059억"
                ),

                CoinListInfo(
                    name ="ETH",
                    nameKr = "이더리움",
                    price = "1,625",
                    rate="-0.37%",
                    trading="2,059억"
                ),
                CoinListInfo(
                    name ="KLAY",
                    nameKr = "클레이튼",
                    price = "1,625",
                    rate="-0.37%",
                    trading="2,059억"
                ),
                CoinListInfo(
                    name ="BCH",
                    nameKr = "비트코인 캐시",
                    price = "1,625",
                    rate="-0.37%",
                    trading="2,059억"
                ),
                CoinListInfo(
                    name ="EOS",
                    nameKr = "이오스",
                    price = "1,625",
                    rate="-0.37%",
                    trading="2,059억"
                )

            )
        )



    }
}
