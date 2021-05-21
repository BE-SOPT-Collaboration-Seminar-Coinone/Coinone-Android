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
            1-> CoinListFragment() //실제론 두번쨰
            2->  GumaeFragment() //실제론 세번쨰
            3-> InfoFragment()//실제론 네번재
            else->  MyFragment() //실제론 첫번쨰
        }
        return fragment

    }

    override fun getPageTitle(position: Int): CharSequence? {
       val title = when(position){
           1->"거래소" //실제론 두번쨰
           2->"간편구매" //실제론 세번째
           3->"정보" //실제론 네번쨰
           else->"마이" //실제론 첫번쨰
       }
        return title
    }



}

