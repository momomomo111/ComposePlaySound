package com.momomomo111.playsound.ui.component

import android.content.Context
import android.media.MediaPlayer
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp

@Composable
fun ButtonGrid(
    context: Context, soundList: List<Int>
) {
    var isPlay by remember { mutableStateOf(false) }
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 96.dp),
        contentPadding = PaddingValues(horizontal = 12.dp, vertical = 12.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        itemsIndexed(soundList) { index, soundValue ->
            Button(onClick = {
                if (!isPlay) {
                    isPlay = true
                    MediaPlayer.create(context, soundValue).apply {
                        setOnCompletionListener {
                            stop()
                            reset()
                            release()
                            isPlay = false
                        }
                        start()
                    }
                }
            }) {
                Text(text = "$index:00")
            }
        }
    }
}