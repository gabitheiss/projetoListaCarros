package com.lista.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lista.R
import com.lista.model.Car
import com.lista.singleton.CarListaControle
import com.lista.singleton.CarListaControle.listaCarros

class AdapterRecyclerView (
    var listOfCars : List<Car>
        ): RecyclerView.Adapter<ItemCarViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemCarViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_car_,parent,false)
        return ItemCarViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ItemCarViewHolder, position: Int) {
        listOfCars[position].apply {
            viewHolder.bind(this)
        }
    }

    override fun getItemCount(): Int {
        return listOfCars.size
    }

    //refresh para remover e atualizar lista nova (singleton)
    fun refresh(novaLista: MutableList<Car>){
        listOfCars = novaLista
        notifyDataSetChanged()

    }

}


class ItemCarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    fun bind(car: Car){

        itemView.findViewById<TextView>(R.id.TextViewMarca).apply {
            text = car.marca
        }
        itemView.findViewById<TextView>(R.id.TextViewModelo).apply {
            text = car.modelo
        }
        itemView.findViewById<TextView>(R.id.textViewAno).apply {
            text = car.ano.toString()
        }

    }
}