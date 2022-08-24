package com.sefu.foodninjadelivery.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
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
fun PasswordContent(modifier: Modifier = Modifier) {
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
                    modifier = Modifier.padding(16.dp)
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
                            text = "Reset your password here",
                            fontSize = 32.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Text(text = "Select which contact details should we\nuse to reset your password")
                    Spacer(modifier = Modifier.height(16.dp))
                    Card(
                        elevation = 10.dp, shape = RoundedCornerShape(12.dp),
                        modifier = modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .background(color = Color.White)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            TextField(
                                modifier = Modifier.fillMaxWidth(),
                                colors = TextFieldDefaults.textFieldColors(
                                    textColor = Color.Transparent,
                                    disabledTextColor = Color.Transparent,
                                    backgroundColor = Color.Transparent,
                                    focusedIndicatorColor = Color.Transparent,
                                    unfocusedIndicatorColor = Color.Transparent,
                                    disabledIndicatorColor = Color.Transparent
                                ),
                                value = "", onValueChange = {}, placeholder = {
                                    Text(
                                        text = "New Password",
                                        fontSize = 16.sp,
                                        style = TextStyle(color = Color.LightGray),
                                      
                                    )
                                }, trailingIcon = {
                                    IconButton(onClick = { /*TODO*/ }) {
                                        Icon(
                                            painterResource(id = R.drawable.visibility),
                                            contentDescription = "",
                                            tint = colorResource(id = R.color.dark_green),
                                            modifier = Modifier.size(20.dp)
                                        )
                                    }
                                }
                            )
                        }
                    }


                    Card(
                        elevation = 10.dp, shape = RoundedCornerShape(12.dp),
                        modifier = modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .background(color = Color.White)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            TextField(
                                modifier = Modifier.fillMaxWidth(),
                                colors = TextFieldDefaults.textFieldColors(
                                    textColor = Color.Transparent,
                                    disabledTextColor = Color.Transparent,
                                    backgroundColor = Color.Transparent,
                                    focusedIndicatorColor = Color.Transparent,
                                    unfocusedIndicatorColor = Color.Transparent,
                                    disabledIndicatorColor = Color.Transparent
                                ),
                                value = "", onValueChange = {}, placeholder = {
                                    Text(
                                        text = "Confirm Password",
                                        fontSize = 16.sp,
                                        style = TextStyle(color = Color.LightGray),

                                    )
                                }, trailingIcon = {
                                    IconButton(onClick = { /*TODO*/ }) {
                                        Icon(
                                            painterResource(id = R.drawable.visibility),
                                            contentDescription = "",
                                            modifier = Modifier.size(20.dp)
                                        )
                                    }
                                }
                            )
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
fun PreviewPassWordContent() {
    FoodNinjaDeliveryTheme {
        PasswordContent()
    }
}