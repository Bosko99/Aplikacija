package com.example.domaci

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.domaci.databinding.ItemSpecialistBinding

class Adapter (private val specijalistList : List<String>) :
    RecyclerView.Adapter<Adapter.SpecialistViewHolder>() {

    //naziv ove klase ide na dosta mjesta
    class SpecialistViewHolder(private val binding : ItemSpecialistBinding) :
        RecyclerView.ViewHolder(binding.root){

        fun bind(specijalistName : String){//tip npr string ili klasa
            //u ove moje prebacam ono iz liste //potreban id za npr text u itemu
            binding.TextViewItem.text = specijalistName

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SpecialistViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemSpecialistBinding.inflate(inflater,parent,false)
        return SpecialistViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SpecialistViewHolder, position: Int) {
        //odje pozivamo funkciju za dodavanje itrma
        (holder as SpecialistViewHolder).bind(specijalistList[position])

    }

    //koliko treba notova da vrati lista, odje moze stranicenje odraditi
    override fun getItemCount() = specijalistList.size
}