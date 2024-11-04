package com.chv.study_case_expo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.chv.study_case_expo.main.TouhouScreen
import com.chv.study_case_expo.ui.theme.StudycaseexpoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StudycaseexpoTheme {
                TouhouScreen()
            }
        }
    }
}