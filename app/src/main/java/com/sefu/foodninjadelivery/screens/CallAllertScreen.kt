package com.sefu.foodninjadelivery.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
fun CallingScreen(modifier: Modifier = Modifier) {
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
                .size(width = 400.dp, height = 500.dp)
                .padding(top = 60.dp)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.White.copy(0.1F),
                            Color.White
                        )
                    )
                )
        ) {}
        Column(
            verticalArrangement = Arrangement.spacedBy(24.dp),
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 24.dp)
        ) {

        }
        CallingContent()
    }
}

@Composable
fun CallingContent(modifier: Modifier = Modifier) {
    Column() {
        Box(
            modifier = Modifier
                .height(500.dp)
                .fillMaxWidth(),
            contentAlignment = Alignment.BottomCenter
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(24.dp)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.calling),
                    modifier = Modifier.size(200.dp),
                    contentDescription = ""
                )

                Text(
                    text = "Cortney Henry",
                    textAlign = TextAlign.Center,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "calling...",
                    textAlign = TextAlign.Center,
                    fontSize = 24.sp,
                    style = TextStyle(color = Color.Gray)
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewCallingScreen() {
    FoodNinjaDeliveryTheme {
        CallingScreen()
    }
}

@Preview
@Composable
fun PreviewCallingContent() {
    FoodNinjaDeliveryTheme {
        CallingContent()
    }
}