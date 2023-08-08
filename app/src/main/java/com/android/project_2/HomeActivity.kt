package com.android.project_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val strData = intent.getStringExtra("dataFromSignInActivity")
        val textView = findViewById<TextView>(R.id.zz)
        textView.text = "아이디 : $strData"

        val btn = findViewById<Button>(R.id.backbt)
        btn.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            finish()

        }
    }
}