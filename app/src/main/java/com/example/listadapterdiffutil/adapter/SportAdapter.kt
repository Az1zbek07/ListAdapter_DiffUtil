package com.example.listadapterdiffutil.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.listadapterdiffutil.SportsData
import com.example.listadapterdiffutil.databinding.ItemLayoutBinding

class SportAdapter: RecyclerView.Adapter<SportAdapter.RvViewHolder>() {
    lateinit var onClick: (SportsData) -> Unit

    private val diffCallback = object : DiffUtil.ItemCallback<SportsData>(){
        override fun areItemsTheSame(oldItem: SportsData, newItem: SportsData): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: SportsData, newItem: SportsData): Boolean {
            return oldItem == newItem
        }
    }

    private val differ = AsyncListDiffer(this, diffCallback)
    var sports: MutableList<SportsData>
    get() = differ.currentList
    set(value) = differ.submitList(value)



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvViewHolder {
        return RvViewHolder(ItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ))
    }

    override fun onBindViewHolder(holder: RvViewHolder, position: Int) {
        holder.bind(sports[position])
    }

    override fun getItemCount(): Int = sports.size

    inner class RvViewHolder(private val binding: ItemLayoutBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(sportsData: SportsData){
            binding.apply {
                itemImage.setImageResource(sportsData.image)
                textName.text = sportsData.name
                textTime.text = sportsData.time
            }
            itemView.setOnClickListener {
                onClick.invoke(sportsData)
            }
        }
    }
}