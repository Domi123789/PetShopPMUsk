package com.example.petshop

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.petshop.databinding.ActivityUrediVlasnikaBinding
import com.example.petshop.databinding.VlasnikZivotinjeBinding

class UrediVlasnika(
    private val textList: ArrayList<Vlasnik>,
    private val th: Context

): RecyclerView.Adapter<UrediVlasnika.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = ActivityUrediVlasnikaBinding.inflate(LayoutInflater.from(th), parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: UrediVlasnika.ViewHolder, position: Int) {
        holder.bindItem(textList[position], th)
    }

    override fun getItemCount(): Int {
        return textList.size
    }

    class ViewHolder(private var itemBinding: ActivityUrediVlasnikaBinding):
        RecyclerView.ViewHolder(itemBinding.root) {
        fun bindItem(Vlasnik: Vlasnik, th: Context) {
            itemBinding.oib.text=Vlasnik.oib
            itemBinding.ime.text=Vlasnik.ime
            itemBinding.prezime.text=Vlasnik.prezime
            itemBinding.mail.text=Vlasnik.mail
            itemBinding.adresa.text=Vlasnik.adresa
        }
    }
}