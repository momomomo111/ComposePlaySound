package com.momomomo111.playsound

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.momomomo111.playsound.ui.screen.HomeScreen
import com.momomomo111.playsound.ui.theme.PlaySoundTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlaySoundTheme {
                HomeScreen()
            }
        }
    }
}
