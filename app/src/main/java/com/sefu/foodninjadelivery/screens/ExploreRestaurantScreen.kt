package com.sefu.foodninjadelivery.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.rounded.Search
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
fun ExploreRestaurantScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.background))
    ) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(24.dp)
        ) {
            TopContent()

        }
    }
}

@Composable
fun TopContent(modifier: Modifier = Modifier) {
    Column() {


        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Find Your \nFavourite Food",
                fontWeight = FontWeight.Bold,
                fontSize = 34.sp
            )
            Card(
                shape = RoundedCornerShape(12.dp),
                elevation = 10.dp, modifier = Modifier
                    .size(50.dp)
            ) {
                Icon(
                    Icons.Outlined.Notifications, modifier = Modifier
                        .padding(2.dp)
                        .size(48.dp), tint = colorResource(
                        id = R.color.dark_green
                    ), contentDescription = "notification"
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 18.dp, start = 16.dp, top = 2.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.Top
                ) {
                    Box(
                        modifier = Modifier
                            .clip(shape = RoundedCornerShape(8.dp))
                            .border(
                                width = 2.dp,
                                color = Color.White,
                                shape = RoundedCornerShape(8.dp)
                            )
                            .background(color = Color.Red)
                            .size(15.dp)
                    ) {

                    }
                }

            }
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {


            Box(
                modifier = modifier
                    .clip(shape = RoundedCornerShape(12.dp))
                    .width(250.dp)
                    .height(50.dp)
                    .background(colorResource(id = R.color.Light_baige).copy(0.1f))
            ) {
                Row(
                    modifier = modifier
                        .padding(start = 12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        Icons.Rounded.Search,
                        tint = colorResource(id = R.color.Light_baige),
                        modifier = Modifier.size(40.dp),
                        contentDescription = "Person"
                    )
                    TextField(

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
                                text = "What do you what to order?",
                                style = TextStyle(colorResource(id = R.color.Light_baige))
                            )
                        })
                }
            }
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(12.dp))
                    .size(50.dp)
                    .background(colorResource(id = R.color.Light_baige).copy(0.1f))
            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painterResource(id = R.drawable.filter),
                        tint = colorResource(id = R.color.baige),
                        modifier = Modifier.size(30.dp),
                        contentDescription = ""
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewExploreRestaurant() {
    FoodNinjaDeliveryTheme {
        ExploreRestaurantScreen()
    }
}

@Preview
@Composable
fun PreviewTopContent() {
    FoodNinjaDeliveryTheme {
        TopContent()
    }
}