package com.denisrebrof.djopochasytimer.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.denisrebrof.theming.presentation.theme.DjopochasyTimerTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Draw()
        }
    }

    @Composable
    fun Draw() {
        DjopochasyTimerTheme {
            MainActivityView()
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DrawPreview() {
        DjopochasyTimerTheme {
            MainActivityViewPreview()
        }
    }
}