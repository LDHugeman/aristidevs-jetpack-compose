package com.example.helloworldcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Preview
@Composable
fun App() {
    LazyColumn(modifier = Modifier.fillMaxSize().background(Color.Red)) {
        item {
            Image(
                modifier = Modifier.fillMaxWidth().height(400.dp),
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "Logo Android"
            )
            Text(
                text = "AristiDevs",
                fontSize = 32.sp,
                color = Color.White,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Text(text = "Subscribe", color = Color.White)
            Text(text = "Hello", color = Color.White)
            LazyRow(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth().padding(16.dp)
            ) {
                item {
                    Text(text = "Stack:", color = Color.White)
                    Text(text = "Java", color = Color.White)
                    Text(text = "KOTLIN", color = Color.White)
                    Text(text = "SUBSCRIBE", color = Color.White)
                    Text(text = "SUBSCRIBE", color = Color.White)
                    Text(text = "SUBSCRIBE", color = Color.White)
                    Text(text = "SUBSCRIBE", color = Color.White)
                    Text(text = "SUBSCRIBE", color = Color.White)
                    Text(text = "SUBSCRIBE", color = Color.White)
                    Text(text = "SUBSCRIBE", color = Color.White)
                    Text(text = "SUBSCRIBE", color = Color.White)
                    Text(text = "SUBSCRIBE", color = Color.White)
                }
            }
        }
    }
}