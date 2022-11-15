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
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
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
            .background(Color(0xDA688662))
            .padding(20.dp)
            .background(Color(0xD57C9C7E))

        ) {
        Column(
            Modifier
                .fillMaxWidth()
                .weight(1f),
                verticalArrangement = Arrangement.Top
        ) {

            Row(Modifier.fillMaxWidth()) {
                Text(
                    text = "CALCULADORA",
                    textDecoration= TextDecoration.Underline,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    color = Color(0xD5E0EED5),
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Serif,
                    style = MaterialTheme.typography.h4.copy(
                        shadow = Shadow(
                            offset = Offset(10f,10f),
                            blurRadius= 10f
                        ))
                    )

            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .padding(25.dp)

            ) {
                Text(
                    text = "0.", modifier=Modifier.fillMaxWidth(), textAlign = TextAlign.End,
                    fontSize = 35.sp
                    )
            }

            Row(Modifier
                .fillMaxWidth()) {
                Text(modifier = Modifier.fillMaxWidth(),
                    text = "by Angel Miranda Enterprises™",
                    textAlign = TextAlign.End, fontStyle = FontStyle.Italic)

            }
        }
        Column(
            Modifier
                .fillMaxWidth()
                .weight(2f)
        ) {
            Row(Modifier.fillMaxWidth()
                .padding(20.dp)){
                Text(text = "/////RESET////",
                    Modifier
                        .background(Color(0xFFE6B670))
                        .weight(1f)
                        .border(width = 2.dp, color = Color.Black)
                        .fillMaxWidth(),
                    fontSize = 30.sp,
                    textAlign = TextAlign.Center)

            }
            Row(Modifier.fillMaxWidth()) {
                Text(text = "+",
                    Modifier
                        .background(Color.White)
                        .weight(1f)
                        .border(width = 2.dp, color = Color.Black)
                        .fillMaxWidth(),
                    fontSize = 45.sp,
                    textAlign = TextAlign.Center
                )
                Text(text = "-",
                    Modifier
                        .background(Color.White)
                        .weight(1f)
                        .border(width = 2.dp, color = Color.Black)
                        .fillMaxWidth(),
                    fontSize = 45.sp,
                    textAlign = TextAlign.Center
                )
                Text(text = "x",
                    Modifier
                        .background(Color.White)
                        .weight(1f)
                        .border(width = 2.dp, color = Color.Black)
                        .fillMaxWidth(),
                    fontSize = 45.sp,
                    textAlign = TextAlign.Center
                )
                Text(text = "%",
                    Modifier
                        .background(Color.White)
                        .weight(1f)
                        .border(width = 2.dp, color = Color.Black)
                        .fillMaxWidth(),
                    fontSize = 45.sp,
                    textAlign = TextAlign.Center
                )
            }


            Column(
                Modifier
                    .fillMaxWidth()
                    .weight(4f)
            ) {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    Text(text = "1",
                        Modifier
                            .background(Color.White)
                            .weight(1f)
                            .border(width = 2.dp, color = Color.Black)
                            .fillMaxSize(),
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center
                    )
                    Text(text = "2",
                        Modifier
                            .background(Color.White)
                            .weight(1f)
                            .border(width = 2.dp, color = Color.Black)
                            .fillMaxSize(),
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center
                    )
                    Text(text = "3",
                        Modifier
                            .background(Color.White)
                            .weight(1f)
                            .border(width = 2.dp, color = Color.Black)
                            .fillMaxSize(),
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center
                    )
                }
                Row(
                    Modifier
                        .fillMaxWidth()
                        .weight(1f)) {
                    Text(text = "4",
                        Modifier
                            .background(Color.White)
                            .weight(1f)
                            .border(width = 2.dp, color = Color.Black)
                            .fillMaxSize(),
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center
                    )
                    Text(text = "5",
                        Modifier
                            .background(Color.White)
                            .weight(1f)
                            .border(width = 2.dp, color = Color.Black)
                            .fillMaxSize(),
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center
                    )
                    Text(text = "6",
                        Modifier
                            .background(Color.White)
                            .weight(1f)
                            .border(width = 2.dp, color = Color.Black)
                            .fillMaxSize(),
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center
                    )
                }
                Row(
                    Modifier
                        .fillMaxWidth()
                        .weight(1f)) {
                    Text(text = "7",
                        Modifier
                            .background(Color.White)
                            .weight(1f)
                            .border(width = 2.dp, color = Color.Black)
                            .fillMaxSize(),
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center
                    )
                    Text(text = "8",
                        Modifier
                            .background(Color.White)
                            .weight(1f)
                            .border(width = 2.dp, color = Color.Black)
                            .fillMaxSize(),
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center
                    )
                    Text(text = "9",
                        Modifier
                            .background(Color.White)
                            .weight(1f)
                            .border(width = 2.dp, color = Color.Black)
                            .fillMaxSize(),
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center
                    )
                }
                Row(
                    Modifier
                        .fillMaxWidth()
                        .weight(1f)) {
                    Text(text = "0",
                        Modifier
                            .background(Color.White)
                            .weight(1f)
                            .border(width = 2.dp, color = Color.Black)
                            .fillMaxSize(),
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center
                    )
                    Text(text = ".",
                        Modifier
                            .background(Color.White)
                            .weight(1f)
                            .border(width = 2.dp, color = Color.Black)
                            .fillMaxSize(),
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center
                    )
                    Text(text = "=",
                        Modifier
                            .background(Color.White)
                            .weight(1f)
                            .border(width = 2.dp, color = Color.Black)
                            .fillMaxSize(),
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center
                    )


                }

            }


        }}}



