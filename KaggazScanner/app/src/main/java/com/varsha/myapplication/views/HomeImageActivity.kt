package com.varsha.myapplication.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.varsha.myapplication.R
import com.varsha.myapplication.data.CameraEntity
import com.varsha.myapplication.viewmodels.CameraViewModel
import com.varsha.myapplication.viewmodels.CameraViewModelFactory
import com.varsha.myapplication.views.adapter.CameraAdapter
import kotlinx.android.synthetic.main.activity_home_image.*

class HomeImageActivity : AppCompatActivity() {
    private lateinit var viewModel: CameraViewModel
    val images = mutableListOf<CameraEntity>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_image)

        val cameraAdapter = CameraAdapter(images,this)
        recyclerView.layoutManager=GridLayoutManager(this,2)
        recyclerView.adapter=cameraAdapter

        val application = application as CameraApplication

        val repository= application.cameraRepository

        val viewModelFactory=CameraViewModelFactory(repository)
        viewModel= ViewModelProviders.of(this,viewModelFactory).get(CameraViewModel::class.java)
        viewModel.getImage().observe(this, Observer {
            images.clear()
            images.addAll(it)
            cameraAdapter.notifyDataSetChanged()
        })

         btnOpenCamera.setOnClickListener {
             val intent = Intent(this,CameraActivity::class.java)
             startActivity(intent)
         }
    }
}