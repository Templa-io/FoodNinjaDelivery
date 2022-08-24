package com.sefu.foodninjadelivery.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
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
fun MethodScreen(modifier: Modifier = Modifier) {
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
                Column(
                    verticalArrangement = Arrangement.spacedBy(24.dp),
                    modifier = Modifier.fillMaxSize().padding(16.dp)
                ) {
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
                            text = "Forgot Password?",
                            fontSize = 32.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Text(text = "Select which contact detail should we\nuse to reset your password ")
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(20.dp),

                    ) {
                        Card(elevation = 10.dp, shape = RoundedCornerShape(12.dp)) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal =16.dp, vertical = 26.dp),
                                horizontalArrangement = Arrangement.spacedBy(8.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.sms),
                                    modifier = Modifier.size(40.dp),
                                    contentDescription = "email",
                                    tint = colorResource(
                                        id = R.color.dark_green
                                    )
                                )
                                Box(
                                    contentAlignment = Alignment.Center,
                                    modifier = Modifier.size(width = 160.dp, height = 50.dp)
                                ) {
                                    Column(horizontalAlignment = Alignment.Start,
                                        verticalArrangement = Arrangement.spacedBy(12.dp)) {
                                        Text(
                                            text = "Via sms:",
                                            fontSize = 16.sp,
                                            style = TextStyle(color = Color.Gray)
                                        )
                                        Row(modifier = Modifier.fillMaxWidth(),
                                            horizontalArrangement = Arrangement.SpaceAround,
                                            verticalAlignment = Alignment.CenterVertically) {
                                            Box(
                                                modifier = Modifier
                                                    .clip(shape = RoundedCornerShape(12.dp))
                                                    .size(10.dp)
                                                    .background(color = Color.Black)
                                            )
                                            Box(
                                                modifier = Modifier
                                                    .clip(shape = RoundedCornerShape(12.dp))
                                                    .size(10.dp)
                                                    .background(color = Color.Black)
                                            )


                                            Box(
                                                modifier = Modifier
                                                    .clip(shape = RoundedCornerShape(12.dp))
                                                    .size(10.dp)
                                                    .background(color = Color.Black)
                                            )
                                            Box(
                                                modifier = Modifier
                                                    .clip(shape = RoundedCornerShape(12.dp))
                                                    .size(10.dp)
                                                    .background(color = Color.Black)
                                            ) {

                                            }
                                            Spacer(modifier = Modifier.width(10.dp))
                                            Box(
                                                modifier = Modifier
                                                    .clip(shape = RoundedCornerShape(12.dp))
                                                    .size(10.dp)
                                                    .background(color = Color.Black)
                                            )

                                            Box(
                                                modifier = Modifier
                                                    .clip(shape = RoundedCornerShape(12.dp))
                                                    .size(10.dp)
                                                    .background(color = Color.Black)
                                            )
                                            Box(
                                                modifier = Modifier
                                                    .clip(shape = RoundedCornerShape(12.dp))
                                                    .size(10.dp)
                                                    .background(color = Color.Black)
                                            )
                                            Box(
                                                modifier = Modifier
                                                    .clip(shape = RoundedCornerShape(12.dp))
                                                    .size(10.dp)
                                                    .background(color = Color.Black)
                                            ) {

                                            }
Spacer(modifier = Modifier.width(12.dp))
                                            Text(text = "4345", fontSize = 16.sp)
                                        }
                                    }
                                }
                            }

                        }
                        Card(elevation = 10.dp, shape = RoundedCornerShape(12.dp)) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(16.dp),
                                horizontalArrangement = Arrangement.spacedBy(8.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    Icons.Rounded.Email,
                                    contentDescription = "email",
                                    modifier = Modifier.size(40.dp),
                                    tint = colorResource(
                                        id = R.color.dark_green
                                    )
                                )
                                Box(
                                    contentAlignment = Alignment.Center,
                                    modifier = Modifier.size(width = 160.dp, height = 50.dp)
                                ) {

                                    Column(
                                        horizontalAlignment = Alignment.Start,
                                        verticalArrangement = Arrangement.spacedBy(8.dp)
                                    ) {
                                        Text(
                                            text = "Via email:",
                                            fontSize = 16.sp,
                                            style = TextStyle(color = Color.Gray)
                                        )
                                        Row(
                                            modifier = Modifier.fillMaxWidth(),
                                            horizontalArrangement = Arrangement.SpaceAround,
                                            verticalAlignment = Alignment.CenterVertically
                                        ) {
                                            Box(
                                                modifier = Modifier
                                                    .clip(shape = RoundedCornerShape(12.dp))
                                                    .size(10.dp)
                                                    .background(color = Color.Black)
                                            )
                                            Box(
                                                modifier = Modifier
                                                    .clip(shape = RoundedCornerShape(12.dp))
                                                    .size(10.dp)
                                                    .background(color = Color.Black)
                                            )
                                            Box(
                                                modifier = Modifier
                                                    .clip(shape = RoundedCornerShape(12.dp))
                                                    .size(10.dp)
                                                    .background(color = Color.Black)
                                            )

                                            Box(
                                                modifier = Modifier
                                                    .clip(shape = RoundedCornerShape(12.dp))
                                                    .size(10.dp)
                                                    .background(color = Color.Black)
                                            ) {

                                            }
                                            Spacer(modifier = Modifier.width(10.dp))
                                            Text(text = "@gmail.com", fontSize = 16.sp)

                                        }

                                    }

                                }


                            }
                        }


                    }
                }
                Box(
                    contentAlignment = Alignment.Center, modifier = Modifier
                        .clip(shape = RoundedCornerShape(16.dp))
                        .align(alignment = Alignment.BottomCenter)
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
}

@Preview
@Composable
fun PreviewMethodScreen() {
    FoodNinjaDeliveryTheme {
        MethodScreen()
    }
}