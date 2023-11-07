package com.cursokotlinjz.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_result.btnBack
import kotlinx.android.synthetic.main.activity_result.tvGreeting


class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        btnBack.setOnClickListener { onBackPressed() }
        getAndShowName()
    }

    fun getAndShowName() {
        val bundle = intent.extras
        val name = bundle?.get("INTENT_NAME")
        tvGreeting.text = "Bienvenido: $name"
    }

}