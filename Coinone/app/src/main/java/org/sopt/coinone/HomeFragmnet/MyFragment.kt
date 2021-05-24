package org.sopt.coinone.HomeFragmnet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.sopt.coinone.databinding.ActivityMyBinding
import org.sopt.coinone.myRV.MyFavoriteListAdapter
import org.sopt.coinone.myRV.MyFavoriteListInfo

class MyFragment:Fragment() {

    private var _binding: ActivityMyBinding? = null
    private val binding get() =_binding ?: error("View 를 참조하기 위해 binding 이 초기화 되지 않았습니다.")
    private val favoriteListAdapter: MyFavoriteListAdapter by lazy{MyFavoriteListAdapter()}

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

        favoriteListAdapter.favoriteList.addAll(
            listOf<MyFavoriteListInfo>(
                MyFavoriteListInfo(
                    logo="https://lh3.googleusercontent.com/proxy/OnCK_oJvRkdQl_RbFgSJfyQX7cGrONtYPMMMduPHm-naBBdEE9cDs_i-WNx0CRK5J3DkmdJEhIVMkjoQ7qrhI1PRb_mCO6cg3Luihc7vARnTc2jEyPMHfmD4ZsJsRGgIeh6RmKi3gesdpkcj2oEeYvWW5cDDgrrD4sfe1gv313HND_LC-FAWBmeJVWSekiq3GUF9618Q_yqkr20WP0d8gj35M-Bp-NUYyKQpSuwdB4xMXqbQV6i-PC8bWCk",
                    name_k = "클레이튼",
                    name_e = "KLAY",
                    price = "1,900.0",
                    degree = "66.8",
                    percent = "(+3.64%)",
                    state="+"
                ),
                MyFavoriteListInfo(
                    logo="https://lh3.googleusercontent.com/proxy/OnCK_oJvRkdQl_RbFgSJfyQX7cGrONtYPMMMduPHm-naBBdEE9cDs_i-WNx0CRK5J3DkmdJEhIVMkjoQ7qrhI1PRb_mCO6cg3Luihc7vARnTc2jEyPMHfmD4ZsJsRGgIeh6RmKi3gesdpkcj2oEeYvWW5cDDgrrD4sfe1gv313HND_LC-FAWBmeJVWSekiq3GUF9618Q_yqkr20WP0d8gj35M-Bp-NUYyKQpSuwdB4xMXqbQV6i-PC8bWCk",
                    name_k = "클레이튼",
                    name_e = "KLAY",
                    price = "1,900.0",
                    degree = "66.8",
                    percent = "(+3.64%)",
                    state="+"
                ),
                MyFavoriteListInfo(
                    logo="https://lh3.googleusercontent.com/proxy/OnCK_oJvRkdQl_RbFgSJfyQX7cGrONtYPMMMduPHm-naBBdEE9cDs_i-WNx0CRK5J3DkmdJEhIVMkjoQ7qrhI1PRb_mCO6cg3Luihc7vARnTc2jEyPMHfmD4ZsJsRGgIeh6RmKi3gesdpkcj2oEeYvWW5cDDgrrD4sfe1gv313HND_LC-FAWBmeJVWSekiq3GUF9618Q_yqkr20WP0d8gj35M-Bp-NUYyKQpSuwdB4xMXqbQV6i-PC8bWCk",
                    name_k = "클레이튼",
                    name_e = "KLAY",
                    price = "1,900.0",
                    degree = "66.8",
                    percent = "(+3.64%)",
                    state="+"
                ),
                MyFavoriteListInfo(
                    logo="https://lh3.googleusercontent.com/proxy/OnCK_oJvRkdQl_RbFgSJfyQX7cGrONtYPMMMduPHm-naBBdEE9cDs_i-WNx0CRK5J3DkmdJEhIVMkjoQ7qrhI1PRb_mCO6cg3Luihc7vARnTc2jEyPMHfmD4ZsJsRGgIeh6RmKi3gesdpkcj2oEeYvWW5cDDgrrD4sfe1gv313HND_LC-FAWBmeJVWSekiq3GUF9618Q_yqkr20WP0d8gj35M-Bp-NUYyKQpSuwdB4xMXqbQV6i-PC8bWCk",
                    name_k = "클레이튼",
                    name_e = "KLAY",
                    price = "1,900.0",
                    degree = "66.8",
                    percent = "(+3.64%)",
                    state="+"
                ),
            )
        )
        // 데이터 변경되었으니 업데이트해라
        favoriteListAdapter.notifyDataSetChanged()
    }

}