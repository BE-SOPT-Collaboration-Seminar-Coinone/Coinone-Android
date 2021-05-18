package org.sopt.sopt_coinone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.sopt.sopt_coinone.databinding.ItemCoinBinding

class CoinListAdapter : RecyclerView.Adapter<CoinListAdapter.CoinListViewHolder>() {

    val coinList = mutableListOf<CoinListInfo>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinListViewHolder {
        val binding = ItemCoinBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return CoinListViewHolder(binding)
    }

    override fun getItemCount(): Int = coinList.size

    override fun onBindViewHolder(holder: CoinListViewHolder, position: Int) {
        holder.onBind(coinList[position])
    }

    class CoinListViewHolder(
        private val binding: ItemCoinBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(coinListInfo: CoinListInfo) {
            binding.tvName.text = coinListInfo.name
            binding.tvNameKr.text = coinListInfo.nameKr
            binding.tvPrice.text = coinListInfo.price
            binding.tvRate.text = coinListInfo.rate
            binding.tvTrading.text = coinListInfo.trading
        }
    }

}