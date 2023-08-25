package com.firstapp.calculatorapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.firstapp.calculatorapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


//        btnPlus.setOnClickListener {
//            val inPut1=TXTinput1.text.toString().toInt()
//            val input2=TXTinput2.text.toString().toInt()
//
//            ResulttextView.text=(inPut1+input2).toString()
//        }
        binding.btnPlus.setOnClickListener {
            val input1=binding.TXTinput1.text.toString().toInt()
            val input2=binding.TXTinput2.text.toString().toInt()

            binding.ResulttextView.text=(input1+input2).toString()
        }
        binding.btnMinus.setOnClickListener {
            val input1=binding.TXTinput1.text.toString().toInt()
            val input2=binding.TXTinput2.text.toString().toInt()

            binding.ResulttextView.text=(input1-input2).toString()
        }
        binding.btnDivide.setOnClickListener {
            val input1=binding.TXTinput1.text.toString().toDouble()
            val input2=binding.TXTinput2.text.toString().toDouble()
            binding.ResulttextView.text=(input1/input2).toString()

        }
        binding.btnMulti.setOnClickListener {
            val input1=binding.TXTinput1.text.toString().toInt()
            val input2=binding.TXTinput2.text.toString().toInt()

            binding.ResulttextView.text=(input1*input2).toString()
        }

    }
}