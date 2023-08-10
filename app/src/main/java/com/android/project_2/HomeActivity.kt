package com.android.project_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val strData = intent.getStringExtra("dataFromSignInActivity")
        val textView = findViewById<TextView>(R.id.zz)
        textView.text = "아이디 : $strData"

        val imageView = findViewById<ImageView>(R.id.imageView)
        val randomImage = getRandomImage()
        imageView.setImageResource(randomImage)

        val btn = findViewById<Button>(R.id.backbt)
        btn.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            finish()
        }
    }

    private fun getRandomImage(): Int {
        val imageArray = arrayOf(
            R.drawable.pado,
            R.drawable.sum,
            R.drawable.mat,
        )
        return imageArray[Random.nextInt(imageArray.size)]
    }
}
