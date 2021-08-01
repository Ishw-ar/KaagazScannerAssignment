package com.varsha.myapplication.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.varsha.myapplication.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_preview.*

class PreviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)
        setImage()


    }

    fun setImage(){
        if (intent.extras!=null){
            Glide.with(this).load(intent.getStringExtra("image")).into(previewImage)
        }
    }


}