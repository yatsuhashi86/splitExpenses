package com.example.splitexpenses

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
    }

    fun continueButtonOnClick(view: View){
        setContentView(R.layout.home)
    }

    fun calenderButtonOnClick(view: View){
        setContentView(R.layout.calender)
    }

    fun ratioButtonOnClick(view: View){
        setContentView(R.layout.ratio)
    }

    fun inputTradingButtonOnClick(view: View){
        setContentView(R.layout.trading)
    }
    var debug = ""


    fun enterPurchaseButtonOnClick(view: View){
        debug = findViewById(R.id.tradeMemo)

    }
}

class debugOnly(){
    private var _binding: debugOnly? = null
    private val binding get() = _binding!!
}

