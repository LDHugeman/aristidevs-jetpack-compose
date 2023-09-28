package com.example.helloworldcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.helloworldcompose.ui.theme.HelloWorldComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloApp()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HelloApp(){
    HelloWorldComposeTheme {
        Surface(color = MaterialTheme.colors.background) {
            Greeting("Android")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ExampleModifier(){
    Text(text = "Subscríbete", modifier = Modifier.padding(horizontal = 16.dp))
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HelloWorldComposeTheme {
        Greeting("Android")
    }
}