package com.sefu.foodninjadelivery.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sefu.foodninjadelivery.R
import com.sefu.foodninjadelivery.ui.theme.FoodNinjaDeliveryTheme

@Composable
fun MessageScreen(modifier: Modifier=Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.background))
    ) {
        Column(verticalArrangement = Arrangement.spacedBy(24.dp),
            modifier = modifier
                .fillMaxSize()
                .padding(vertical = 44.dp, horizontal = 24.dp)
        ) {
            TopBoxButton()
            MessageContent()
            Spacer(modifier = Modifier.height(180.dp))
            BottomBar()

        }
    }
}

@Composable
fun MessageContent(modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
        Text(text = "Chat", fontSize = 28.sp, fontWeight = FontWeight.Bold)
        Box(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(12.dp))
                .fillMaxWidth()
                .background(color = Color.White)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.annawp),
                    modifier = Modifier.size(60.dp),
                    contentDescription = "pancakes"
                )
                Box(
                    modifier = Modifier.size(width = 180.dp, height = 80.dp),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {


                        Text(
                            text = "Anawwp",
                            fontSize = 16.sp,

                        )
                        Text(
                            text = "Your Order Just Arrived!",
                            fontSize = 16.sp,
                            style = TextStyle(color = Color.LightGray)
                        )
                    }
                }
                Box(modifier = Modifier.size(50.dp), contentAlignment = Alignment.TopCenter) {
                    Box(modifier = Modifier.size(50.dp), contentAlignment = Alignment.TopCenter) {
                        Text(
                            text = "2:00",

                            fontSize = 16.sp,
                            style = TextStyle(
                                color = Color.LightGray
                            )
                        )
                    }
                }
            }
        }
        Box(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(12.dp))
                .fillMaxWidth()
                .background(color = Color.White)
        )
        {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.guy),
                    modifier = Modifier.size(60.dp),
                    contentDescription = "pancakes"
                )
                Box(
                    modifier = Modifier.size(width = 180.dp, height = 80.dp),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {


                        Text(
                            text = "Guy Hawkins",
                            fontSize = 16.sp,

                        )
                        Text(
                            text = "Your Order Just Arrived!",
                            fontSize = 16.sp,
                            style = TextStyle(color = Color.LightGray)
                        )
                    }
                }
                Box(modifier = Modifier.size(50.dp), contentAlignment = Alignment.TopCenter) {
                    Text(
                        text = "2:00",
                        fontSize = 16.sp,
                        style = TextStyle(
                            color = Color.LightGray
                        )
                    )
                }

            }
        }
        Box(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(12.dp))
                .fillMaxWidth()
                .background(color = Color.White)
        )
        {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.leslie),
                    modifier = Modifier.size(60.dp),
                    contentDescription = "pancakes"
                )
                Box(
                    modifier = Modifier.size(width = 180.dp, height = 80.dp),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {


                        Text(
                            text = "Leslie Alexander",
                            fontSize = 16.sp,

                        )
                        Text(
                            text = "Your Order Just Arrived!",
                            fontSize = 16.sp,
                            style = TextStyle(color = Color.LightGray)
                        )
                    }
                }
                Box(modifier = Modifier.size(50.dp), contentAlignment = Alignment.TopCenter) {
                    Text(
                        text = "2:00",

                        fontSize = 16.sp,
                        style = TextStyle(
                            color = Color.LightGray
                        )
                    )
                }
            }
        }
    }
}


@Composable
fun TopBoxButton() {
    Box(
        modifier = Modifier
            .clip(shape = RoundedCornerShape(12.dp))
            .background(colorResource(id = R.color.Light_baige).copy(0.1f))
            .size(40.dp),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            Icons.Rounded.KeyboardArrowLeft,
            contentDescription = "Arrow",
            modifier = Modifier.size(50.dp),
            tint = colorResource(id = R.color.baige)
        )
    }
}

@Preview
@Composable
fun PreviewMessageScreen() {
    FoodNinjaDeliveryTheme {
        MessageScreen()
    }
}

@Preview
@Composable
fun PreviewMessageContent() {
    FoodNinjaDeliveryTheme {
        MessageContent()
    }
}

@Preview
@Composable
fun PreviewTopBoxButton() {
    FoodNinjaDeliveryTheme {
        TopBoxButton()
    }
}