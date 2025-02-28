package com.practice.counterapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
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
import com.practice.counterapp.ui.theme.CounterAppTheme
import java.util.logging.Logger

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val numberTextView = findViewById<TextView>(R.id.numberTextView)
        val plusButton = findViewById<Button>(R.id.plusButton)
        val resetButton = findViewById<Button>(R.id.resetButton)
        var number = 0
        resetButton.setOnClickListener {
            number = 0
            numberTextView.text = String.format(number.toString())
        }
        plusButton.setOnClickListener{
            number +=1
            numberTextView.text = String.format(number.toString())
            Log.d("plusClick", "플러스 버튼이 클릭됐습니다. 숫자는 : ${number}")
        }


    }
    }