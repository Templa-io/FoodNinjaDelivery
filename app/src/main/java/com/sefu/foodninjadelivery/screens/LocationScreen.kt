package com.sefu.foodninjadelivery.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.KeyboardArrowLeft
import androidx.compose.material.icons.rounded.LocationOn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sefu.foodninjadelivery.R
import com.sefu.foodninjadelivery.ui.theme.FoodNinjaDeliveryTheme

@Composable
fun LocationScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.White),
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Box() {
                Column(verticalArrangement = Arrangement.spacedBy(24.dp)) {
                    Box(
                        modifier = Modifier
                            .clip(shape = RoundedCornerShape(12.dp))
                            .background(colorResource(id = R.color.Light_baige).copy(0.1f))
                            .size(60.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            Icons.Rounded.KeyboardArrowLeft,
                            contentDescription = "Arrow",
                            modifier = Modifier.size(50.dp),
                            tint = colorResource(id = R.color.baige)
                        )
                    }
                    Box() {
                        Text(
                            text = "Set Your Location",
                            fontSize = 32.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Text(text = "This data will be displayed in you account\nprofile for security")
                    Card(elevation = 10.dp, shape = RoundedCornerShape(12.dp)) {
                        Column(modifier = Modifier.padding(12.dp)) {
                            Box(
                                contentAlignment = Alignment.CenterStart,modifier = Modifier
                                    .clip(shape = RoundedCornerShape(12.dp))
                                    .size(width = 300.dp, height = 60.dp)
                            ) {
                                Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
                                    Box(
                                        modifier = Modifier
                                            .clip(shape = RoundedCornerShape(16.dp))
                                            .background(colorResource(id = R.color.light_yellow))
                                            .size(32.dp),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Icon(Icons.Rounded.LocationOn, contentDescription = "Location", tint = colorResource(
                                            id = R.color.dark_orange
                                        ))
                                    }
                                    Spacer(modifier = Modifier.width(12.dp))
                                    Text(text = "Your Location", fontWeight = FontWeight.Bold)

                                }
                            }
                            Box(
                                contentAlignment = Alignment.Center,modifier = Modifier
                                    .clip(shape = RoundedCornerShape(16.dp))
                                    .background(colorResource(id = R.color.Light_baige).copy(0.1F)).padding(8.dp)
                                    .size(width = 300.dp, height = 60.dp)
                            ) {
                                Text(text = "Set Location", fontWeight = FontWeight.Bold)
                            }


                        }
                    }

                }
            }
            Box(
                contentAlignment = Alignment.Center, modifier = Modifier
                    .clip(shape = RoundedCornerShape(16.dp))
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
                    text = "Next",
                    fontSize = 20.sp,
                    style = TextStyle(color = Color.White)
                )

            }
        }
    }
}

@Preview
@Composable
fun PreviewLocationScreen() {
    FoodNinjaDeliveryTheme {
        LocationScreen()
    }
}