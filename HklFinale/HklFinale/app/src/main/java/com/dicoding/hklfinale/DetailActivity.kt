package com.dicoding.hklfinale

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val title = intent.getStringExtra("TITLE")
        val fullOverview = intent.getStringExtra("OVERVIEW")
        val imageResource = intent.getIntExtra("IMAGE_RESOURCE", 0)

        val textViewTitleDetail: TextView = findViewById(R.id.textViewTitleDetail)
        val textViewDescriptionDetail: TextView = findViewById(R.id.textViewDescriptionDetail)
        val imageViewDetail: ImageView = findViewById(R.id.imageViewDetail)

        textViewTitleDetail.text = title
        textViewDescriptionDetail.text = fullOverview
        imageViewDetail.setImageResource(imageResource)
    }
}