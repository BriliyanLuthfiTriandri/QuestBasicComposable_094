package com.example.composablelayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.composablelayout.ui.theme.ComposableLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposableLayoutTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompos(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun BasicCompos(modifier: Modifier = Modifier
){
   // Text(text = " Ini adalah text")
    Column(
        horizontalAlignment =  Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Login",
            style = TextStyle(
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Red,
                ))
        Text(
            text = "Ini adalah halaman login",
            style = TextStyle(
                fontSize = 15.sp,
                color = Color.Black,
                fontFamily = FontFamily.Serif,
                ))
        Image(painter = painterResource(id =  R.drawable.logoumy),
            contentDescription = null
        )
        Text(
            text = "Nama",
            style = TextStyle(
                fontSize = 15.sp,
                color = Color.Black,
                fontFamily = FontFamily.Serif,
            ))
        Text(
            text = "Briliyan Luthfi Triandri",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            color = Color.Magenta,
            fontFamily = FontFamily.Serif,
            )
        Text(
            text = "20220140094",
            fontSize = 40.sp,
            color = Color.Black,
            fontFamily = FontFamily.Monospace,
            )
        Image(painter = painterResource(id =  R.drawable.fotokuhehe),
            contentDescription = null,
            modifier = Modifier
                .clip(RoundedCornerShape(5))
        ) //atau ""
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposableLayoutTheme {
        Greeting("Android")
    }
}