package com.example.rv_f_test

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class VarorAdapter(val onitemclicked : ()->Unit) : RecyclerView.Adapter<VarorAdapter.ViewHolder>() {

    var varor= mutableListOf<String>("vara ett", "vara twå" ,"vara tre", "vara fyra", "vara fem")

        class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
            val varoNummer : TextView

            init {
                varoNummer= view.findViewById(R.id.varorTV)
            }
        }

            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

                Log.i("pia11debug", "SKAPA RAD")

                val view =
                    LayoutInflater.from(parent.context).inflate(R.layout.varor_item, parent, false)

                return ViewHolder(view)
            }

            override fun onBindViewHolder(holder: ViewHolder, position: Int) {
                Log.i("pia11debug", "RITA RAD " + position.toString())

                holder.varoNummer.text =varor[position]

                holder.itemView.setOnClickListener {
                    onitemclicked()

                }
            }

            override fun getItemCount(): Int {
                return varor.size
            }



        }
