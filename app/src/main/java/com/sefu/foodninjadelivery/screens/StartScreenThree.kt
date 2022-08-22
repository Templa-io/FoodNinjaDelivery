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
import androidx.compose.ui.graphics.Color
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
fun StartScreenThree(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Image(
                painter = painterResource(id = R.drawable.pic1),
                contentDescription = "Illustration",
                modifier = Modifier.size(400.dp)
            )
            Box() {
                Column(modifier = Modifier.fillMaxWidth().padding(horizontal =50.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(28.dp)) {
                    Text(
                        text = "Food Ninja is Where your\nComfort Food Lives",
                        fontSize = 24.sp,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Enjoy Your fast and smooth food delivery at your doorstep",
                        textAlign = TextAlign.Center
                    )
                }
            }

            Box(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(12.dp))
                    .size(width = 150.dp, height = 50.dp)
                    .background(color = Color.Green),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Next", fontSize = 20.sp, style = TextStyle(color = Color.White))
            }
        }

    }
}

@Preview
@Composable
fun PreviewStartScreenThree() {
    FoodNinjaDeliveryTheme {
        StartScreenThree()
    }
}