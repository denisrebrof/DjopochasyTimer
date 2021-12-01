package com.denisrebrof.djopochasytimer.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.denisrebrof.theming.presentation.theme.DjopochasyTimerTheme

@Preview
@Composable
fun MainActivityViewPreview() = DjopochasyTimerTheme(darkTheme = true) {
    MainActivityUI {
        Text(text = "aaa")
    }
}

@Composable
fun MainActivityView() {
    MainActivityUI {
        Text(text = "aaa")
    }
}

@Composable
fun MainActivityUI(
    content: @Composable () -> Unit = {}
) = Scaffold(
    backgroundColor = MaterialTheme.colors.background,
) {
    Column(modifier = Modifier.padding(8f.dp)) {
        content()
    }
}