package org.sopt.coinone.HomeFragmnet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.sopt.coinone.CoinListAdapter
import org.sopt.coinone.CoinListInfo
import org.sopt.coinone.R
import org.sopt.coinone.databinding.ActivityCoinListBinding

class CoinListFragment : Fragment() {

    private var _binding: ActivityCoinListBinding? = null
    private val binding get() =_binding ?: error("View 를 참조하기 위해 binding 이 초기화 되지 않았습니다.")

    private val coinListAdapter: CoinListAdapter by lazy{CoinListAdapter()}

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ActivityCoinListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvCoinList.adapter = coinListAdapter

        coinListAdapter.coinList.addAll(
            listOf<CoinListInfo>(
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

        coinListAdapter.notifyDataSetChanged()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}

