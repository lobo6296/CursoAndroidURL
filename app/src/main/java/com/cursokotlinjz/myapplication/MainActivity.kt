package com.cursokotlinjz.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.btnChangeActivity
import kotlinx.android.synthetic.main.activity_main.etName


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnChangeActivity.setOnClickListener{checkValue()}
    }

    fun checkValue(){
        if (etName.text.isNotEmpty()){
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("INTENT_NAME", etName.text)
            startActivity(intent)
        }else {
            showErrorName()
        }
    }

    fun showErrorName() {
        Toast.makeText(this,"El nombre del usuario no pueder ser vacío", Toast.LENGTH_SHORT).show();
    }
}