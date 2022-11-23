package com.example.check_parking_v10.usuarios

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.check_parking_v10.Interfaces.OnPersonaListener


class PersonaAdapter (private val personaList: MutableList<Persona>, private val listener: OnPersonaListener):
    RecyclerView.Adapter<PersonaAdapter.ViewHolder>() {



    inner class ViewHolder(view: View) :RecyclerView.ViewHolder(view){
        val binding = ItemProductBinding.bind(view)

        fun setListener(persona: Persona){
            binding.root.setOnClickListener{
                listener.onClick(persona)
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}