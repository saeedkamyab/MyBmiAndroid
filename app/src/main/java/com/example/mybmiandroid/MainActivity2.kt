package com.example.mybmiandroid

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets*/

            val ResultTxtView=findViewById<TextView>(R.id.ResultTextView)
        val bmiRes=intent.getDoubleExtra("bmi",0.0)
      // }
        ResultTxtView.text=getStatus(bmiRes)

    }
    private fun getStatus(bmi: Double):String{
       return if(bmi<=18.5) "Under weight" else if(bmi<=24.9) "Normal" else if(bmi<=29.9) "Over weight"
        else "Obese"
    }


}