package com.example.equiphy

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewAdapter(val listEquipment: ArrayList<Equipment>): RecyclerView.Adapter<CardViewAdapter.CardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        var view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.card_view_equip, parent, false)
        return CardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listEquipment.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        var equipment: Equipment = listEquipment[position]
        Glide.with(holder.itemView.context)
            .load(equipment.img)
            .apply(RequestOptions.overrideOf(350, 550))
            .into(holder.equipmentImg)
        holder.name.text = equipment.name
        holder.type.text = equipment.type
        holder.desc.text = equipment.desc
        holder.itemView.setOnClickListener {
            val moveDetail = Intent(it.context, DetailActivity::class.java)
            moveDetail.putExtra("Nama", equipment.name)
            moveDetail.putExtra("Type", equipment.type)
            moveDetail.putExtra("Desc", equipment.desc)
            moveDetail.putExtra("Img", equipment.img)

            it.context.startActivity(moveDetail)
        }
    }

    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView = itemView.findViewById(R.id.equip_name)
        var desc: TextView = itemView.findViewById(R.id.equip_desc)
        var type: TextView = itemView.findViewById(R.id.equip_type)
        var equipmentImg: ImageView = itemView.findViewById(R.id.img_item)
    }
}
