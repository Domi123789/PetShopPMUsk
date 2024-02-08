package com.example.petshop

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.petshop.databinding.ActivityUrediVlasnikaBinding
import com.example.petshop.databinding.ActivityUrediZivotinjuBinding

class UrediZivotinju(
    private val textList: ArrayList<Zivotinja>,
    private val th: Context
): RecyclerView.Adapter<UrediZivotinju.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = ActivityUrediZivotinjuBinding.inflate(LayoutInflater.from(th), parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: UrediZivotinju.ViewHolder, position: Int) {
        holder.bindItem(textList[position], th)
    }

    override fun getItemCount(): Int {
        return textList.size
    }

    class ViewHolder(private var itemBinding: ActivityUrediZivotinjuBinding):
        RecyclerView.ViewHolder(itemBinding.root) {
        fun bindItem(Zivotinja: Zivotinja, th: Context) {
            itemBinding.id.text=Zivotinja.id
            itemBinding.ime.text=Zivotinja.ime
            itemBinding.vrsta.text=Zivotinja.vrsta
            itemBinding.spol.text=Zivotinja.spol
        }
    }
}
