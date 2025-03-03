package com.practice.changeunit

import android.os.Bundle
import android.text.Editable
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.practice.changeunit.databinding.ActivityMainBinding
import com.practice.changeunit.ui.theme.ChangeUnitTheme
import androidx.core.widget.addTextChangedListener
import java.text.NumberFormat


class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val outputText = binding.outputText
        val inputButton = binding.inputButton
        val inputEditText = binding.inputEditText
        val swapImageButton = binding.inputButton


        var inputNumber : Int = 0
        var cmToMeter = true

        swapImageButton.setOnClickListener {
            cmToMeter = cmToMeter.not()
            if(cmToMeter) {
                inputEditText.text = "cm"
            }
        }

        inputEditText.addTextChangedListener { text ->
                inputNumber = if(text.isNullOrEmpty()){
                    0 }
                    else text.toString().toInt()
            Log.d("inputNumber", inputNumber.toString())
            var outputNumber = inputNumber.times(0.01)
            outputText.text = outputNumber.toString()
        }

    }
}