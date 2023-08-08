package com.android.project_2

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignpActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var idEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var signUpButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signp)

        nameEditText = findViewById(R.id.nameedit)
        idEditText = findViewById(R.id.idedit)
        passwordEditText = findViewById(R.id.passwordedit)
        signUpButton = findViewById(R.id.singupbt2)

        signUpButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val id = idEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (TextUtils.isEmpty(name) || TextUtils.isEmpty(id) || TextUtils.isEmpty(password)) {
                Toast.makeText(this, "모든 정보를 입력해주세요.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "가입 완료 되었습니다.", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, SignInActivity::class.java)
                intent.putExtra("id", id)
                intent.putExtra("password", password)
                startActivity(intent)
                finish()
            }
        }
    }
}