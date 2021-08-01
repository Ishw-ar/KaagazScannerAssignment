package com.varsha.myapplication.views.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.varsha.myapplication.R
import com.varsha.myapplication.data.CameraEntity
import kotlinx.android.synthetic.main.preview_item.view.*

class CameraAdapter(val cameralist:List<CameraEntity>,val context: Context): RecyclerView.Adapter<CameraAdapter.CameraViewHolder>(){
    inner class CameraViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CameraViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.preview_item,parent,false)
        return CameraViewHolder(view)
    }

    override fun onBindViewHolder(holder: CameraViewHolder, position: Int) {

        holder.itemView.apply {
         Glide.with(context).load(cameralist[position].image).into(displayImage)
        }


    }

    override fun getItemCount(): Int {
        return cameralist.size
    }
}