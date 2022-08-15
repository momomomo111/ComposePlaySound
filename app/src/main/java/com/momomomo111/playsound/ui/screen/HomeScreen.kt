package com.momomomo111.playsound.ui.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.momomomo111.playsound.ui.component.ButtonGrid
import com.momomomo111.playsound.util.SoundUtil

@Composable
fun HomeScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
    ) {
        ButtonGrid(context = LocalContext.current, soundList = SoundUtil.getSound())
    }
}

@Preview(showSystemUi = true)
@Composable
private fun PreviewHomeScreen() {
    HomeScreen()
}
