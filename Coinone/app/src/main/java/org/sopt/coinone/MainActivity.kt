package org.sopt.coinone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.sopt.coinone.BottomFragmnet.DataFragment
import org.sopt.coinone.BottomFragmnet.HomeFragment
import org.sopt.coinone.BottomFragmnet.MoreFragment
import org.sopt.coinone.BottomFragmnet.PlusFragment
import org.sopt.coinone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initNavigationBar()
    }

    private fun initNavigationBar() {
        binding.bnvMain.run {
            setOnNavigationItemSelectedListener {
                when(it.itemId) {
                    R.id.item_home -> {
                        supportFragmentManager.beginTransaction().replace(R.id.fragment_container , HomeFragment()).commitAllowingStateLoss()
                    }
                    R.id.item_data -> {
                        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, DataFragment()).commitAllowingStateLoss()
                    }
                    R.id.item_plus -> {
                        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, PlusFragment()).commitAllowingStateLoss()
                    }
                    R.id.item_more -> {
                        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, MoreFragment()).commitAllowingStateLoss()
                    }
                }
                true
            }
            selectedItemId = R.id.item_home
        }
    }
}