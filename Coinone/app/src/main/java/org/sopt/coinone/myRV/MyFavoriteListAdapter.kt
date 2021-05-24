package org.sopt.coinone.myRV

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import org.sopt.coinone.R
import org.sopt.coinone.databinding.ItemMyFavoriteBinding


class MyFavoriteListAdapter : RecyclerView.Adapter<MyFavoriteListAdapter.MyFavoriteListViewHolder>() {

    val favoriteList = mutableListOf<MyFavoriteListInfo>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyFavoriteListViewHolder {
        val binding = ItemMyFavoriteBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return MyFavoriteListViewHolder(binding)
    }

    override fun getItemCount(): Int = favoriteList.size

    override fun onBindViewHolder(holder: MyFavoriteListViewHolder, position: Int) {
        holder.onBind(favoriteList[position])
    }

    class MyFavoriteListViewHolder(
        private val binding: ItemMyFavoriteBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(favoriteListInfo: MyFavoriteListInfo) {
            Glide.with(itemView)
                .load(favoriteListInfo.logo)
                .into(binding.imgFavoriteLogo)
            binding.tvFavoriteKorName.text = favoriteListInfo.name_k
            binding.tvFavoriteEngName.text = favoriteListInfo.name_e
            binding.tvFavoritePrice.text = favoriteListInfo.price
            binding.tvFavoriteDegree.text = favoriteListInfo.degree
            binding.tvFavoritePercent.text = favoriteListInfo.percent
            if(favoriteListInfo.state == "+"){
                binding.imgFavoriteState.setImageResource(R.drawable.icn_allow_up)
            }

        }
    }

}