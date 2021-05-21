package org.sopt.coinone.HomeFragmnet
import android.icu.text.CaseMap
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import org.sopt.coinone.HomeFragmnet.CoinListFragment
import org.sopt.coinone.HomeFragmnet.GumaeFragment
import org.sopt.coinone.HomeFragmnet.InfoFragment
import org.sopt.coinone.HomeFragmnet.MyFragment

class PagerAdapter(fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager){


    val PAGE_MAX_CNT =4


    override fun getCount(): Int {
        return PAGE_MAX_CNT
    }

    override fun getItem(position: Int) : Fragment {
        val fragment= when(position){
            1-> MyFragment()
            2-> CoinListFragment()
            3-> GumaeFragment()
            else-> InfoFragment()
        }
        return fragment

    }

    override fun getPageTitle(position: Int): CharSequence? {
       val title = when(position){
           1->"마이"
           2->"거래소"
           3->"간편구매"
           else->"정보"
       }
        return title
    }



}

