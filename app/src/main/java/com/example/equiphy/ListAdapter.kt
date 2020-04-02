package com.example.equiphy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListAdapter(val listEquipment: ArrayList<Equipment>): RecyclerView.Adapter<ListAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        var view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_equip, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listEquipment.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        var equipment: Equipment = listEquipment[position]
        Glide.with(holder.itemView.context)
            .load(equipment.img)
            .apply(RequestOptions.overrideOf(55,55))
            .into(holder.equipmentImg)
        holder.name.text = equipment.name
        holder.type.text = equipment.type
        holder.itemView.setOnClickListener{onItemClickCallback.onItemClickCallBack(
            listEquipment[position]
        ) }
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.equip_name)
        val type: TextView = itemView.findViewById(R.id.equip_type)
        val equipmentImg: ImageView = itemView.findViewById(R.id.img_item)
    }

    interface OnItemClickCallback {
        fun onItemClickCallBack (data: Equipment)
    }
}