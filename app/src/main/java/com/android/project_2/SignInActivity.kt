package com.android.project_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val id = intent.getStringExtra("id")
        val userPassword = intent.getStringExtra("password")
        // 받은 데이터를 사용하여 EditText에 표시
        val idEditText = findViewById<EditText>(R.id.id1)
        idEditText.setText(id)
        val passwordEditText = findViewById<EditText>(R.id.password2)
        passwordEditText.setText(userPassword)

        val btn2 = findViewById<Button>(R.id.singinbt)
        btn2.setOnClickListener {
            val 넘겨주는친구 = findViewById<EditText>(R.id.id1)
            val strData = 넘겨주는친구.text.toString()
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("dataFromSignInActivity", strData)
            startActivity(intent)
        }
        val btn = findViewById<Button>(R.id.singupbt)
        btn.setOnClickListener {
            val intent = Intent(this, SignpActivity::class.java)
            startActivity(intent)

        }
    }
}
