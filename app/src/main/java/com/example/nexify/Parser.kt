package com.example.nexify

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import retrofit2.Retrofit

private const val eventsURL = "https://it-event-hub.ru/"
private val retrofit = Retrofit.Builder()

@Preview (showSystemUi = true)
@Composable
fun testCard(){



    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
        .height(100.dp)
        .clip(shape = RoundedCornerShape(8.dp))
        .background(color = colorResource(id = R.color.dark_blue))
       ){
        Text(text = "1")
    }
}