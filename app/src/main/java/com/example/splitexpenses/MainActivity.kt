package com.example.splitexpenses

import android.os.Bundle
import android.view.View
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

}

