package com.example.splitexpenses

import android.annotation.SuppressLint
import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.compose.ui.layout.PinnableContainer
import com.example.splitexpenses.databinding.CalenderBinding
import com.example.splitexpenses.databinding.HomeBinding
import com.example.splitexpenses.databinding.LoginBinding
import com.example.splitexpenses.databinding.RatioBinding
import com.example.splitexpenses.databinding.TradingBinding

class MainActivity : ComponentActivity() {
    private lateinit var loginBinding: LoginBinding
    private lateinit var homeBinding: HomeBinding
    private lateinit var tradingBinding: TradingBinding
    private lateinit var calenderBinding: CalenderBinding
    private lateinit var ratioBinding: RatioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginBinding = LoginBinding.inflate(layoutInflater)
        homeBinding = HomeBinding.inflate(layoutInflater)
        tradingBinding = TradingBinding.inflate(layoutInflater)
        calenderBinding = CalenderBinding.inflate(layoutInflater)
        ratioBinding = RatioBinding.inflate(layoutInflater)
        setContentView(R.layout.login)

    }
    private var _binding: TradingBinding? = null
    private val binding get() = _binding!!
    fun onCreateView(
        inflater: LayoutInflater?,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = TradingBinding.inflate(inflater!!, container, false)
        return binding.root
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


}





