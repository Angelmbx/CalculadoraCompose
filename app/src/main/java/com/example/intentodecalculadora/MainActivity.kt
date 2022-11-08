package com.example.intentodecalculadora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.intentodecalculadora.ui.theme.IntentoDeCalculadoraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppView()
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun AppView() {

    Column(
        Modifier
            .fillMaxSize()
            .background(Color(0xFF58855A))
            .padding(20.dp)
            .background(Color.LightGray)

        ) {
        Column(
            Modifier
                .fillMaxWidth().weight(1f),
                verticalArrangement = Arrangement.Top
        ) {

            Row(Modifier.fillMaxWidth()) {
                Text(
                    text = "CALCULADORA",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Serif
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .padding(25.dp)
            ) {
                Text(
                    text = "",
                    textAlign = TextAlign.Center,

                    )


            }

        }
        Column(
            Modifier.fillMaxWidth().weight(4f)
        ){
            Row(Modifier.fillMaxWidth(), Arrangement.SpaceAround) {
                Text(text = "1", Modifier.background(Color.White) .border(width = 2.dp, color = Color.Black) .padding(horizontal=16.dp, vertical= 8.dp), fontSize = 25.sp)
                Text(text = "2", Modifier.background(Color.White) .border(width = 2.dp, color = Color.Black) .padding(horizontal=16.dp, vertical= 8.dp), fontSize = 25.sp)
                Text(text = "3", Modifier.background(Color.White) .border(width = 2.dp, color = Color.Black) .padding(horizontal=16.dp, vertical= 8.dp), fontSize = 25.sp)
            }
            Row(Modifier.fillMaxWidth(), Arrangement.SpaceAround) {
                Text(text = "4", Modifier.background(Color.White) .border(width = 2.dp, color = Color.Black) .padding(horizontal=16.dp, vertical= 8.dp), fontSize = 25.sp)
                Text(text = "5", Modifier.background(Color.White) .border(width = 2.dp, color = Color.Black) .padding(horizontal=16.dp, vertical= 8.dp), fontSize = 25.sp)
                Text(text = "6", Modifier.background(Color.White) .border(width = 2.dp, color = Color.Black) .padding(horizontal=16.dp, vertical= 8.dp), fontSize = 25.sp)
            }
            Row(Modifier.fillMaxWidth(), Arrangement.SpaceAround) {
                Text(text = "7", Modifier.background(Color.White) .border(width = 2.dp, color = Color.Black) .padding(horizontal=16.dp, vertical= 8.dp), fontSize = 25.sp)
                Text(text = "8", Modifier.background(Color.White) .border(width = 2.dp, color = Color.Black) .padding(horizontal=16.dp, vertical= 8.dp), fontSize = 25.sp)
                Text(text = "9", Modifier.background(Color.White) .border(width = 2.dp, color = Color.Black) .padding(horizontal=16.dp, vertical= 8.dp), fontSize = 25.sp)
            }

        }
    }




}

