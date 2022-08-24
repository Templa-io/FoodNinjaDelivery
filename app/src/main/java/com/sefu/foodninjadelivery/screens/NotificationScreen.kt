package com.sefu.foodninjadelivery.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sefu.foodninjadelivery.R
import com.sefu.foodninjadelivery.ui.theme.FoodNinjaDeliveryTheme

@Composable
fun NotificationScreen(modifier: Modifier=Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Image(
            painter = painterResource(
                id =
                R.drawable.pattern
            ), contentDescription = "pattern",
            contentScale = ContentScale.FillBounds, modifier = Modifier
                .size(400.dp)
                .align(alignment = Alignment.TopCenter)
        )
        Box(
            modifier = Modifier
                .size(width = 400.dp, height = 400.dp)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.White.copy(0.1F),
                            Color.White
                        )
                    )
                )
        ) {
            Image(
                painter = painterResource(id = R.drawable.pic),
                contentDescription = "",

                modifier = Modifier
                    .align(alignment = Alignment.BottomCenter)
                    .size(200.dp)
            )
        }
        Box(modifier = Modifier
            .size(width = 400.dp, height = 300.dp)
            .align(alignment = Alignment.Center), contentAlignment = Alignment.BottomCenter) {
            Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(12.dp), modifier = Modifier.padding(16.dp)) {
                Text(
                    text = "Congrats!",
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        colorResource(id = R.color.dark_green),
                        fontSize = 40.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(text = "Password reset successful", textAlign = TextAlign.Center, fontSize = 26.sp, fontWeight = FontWeight.Bold)
            }
        }
        Box( modifier = Modifier
            .size(200.dp)
            .align(alignment = Alignment.BottomCenter)) {
            Box(
                contentAlignment = Alignment.Center, modifier = Modifier
                    .clip(shape = RoundedCornerShape(16.dp))
                    .align(alignment = Alignment.Center)
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(
                                colorResource(id = R.color.light_green),
                                colorResource(id = R.color.dark_green)
                            )
                        )
                    )
                    .size(width = 150.dp, height = 50.dp)
            ) {
                Text(
                    text = "Back", fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    style = TextStyle(color = Color.White)
                )

            }
        }


    }
}

@Preview
@Composable
fun PreviewNotificationScreen() {
    FoodNinjaDeliveryTheme {
        NotificationScreen()
    }
}