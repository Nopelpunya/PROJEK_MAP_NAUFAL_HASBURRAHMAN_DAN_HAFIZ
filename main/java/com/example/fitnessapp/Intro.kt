package com.example.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Intro : AppCompatActivity(), View.OnClickListener {

    lateinit var btnready : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        val btnready: Button = findViewById(R.id.btn_ready)
        btnready.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        if (v != null) {
            when(v.id){
                R.id.btn_ready -> {
                    val intent = Intent(this, ChooseExercises::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}