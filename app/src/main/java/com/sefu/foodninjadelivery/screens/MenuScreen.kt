package com.sefu.foodninjadelivery.screens

import androidx.compose.foundation.Image
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
fun MenuScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.background))
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(24.dp),
            modifier = modifier
                .fillMaxSize()
                .padding(24.dp)
        ) {
            TopMenu()
            MenuContent()
           BottomBar()
        }
    }
}

@Composable
fun TopMenu(modifier: Modifier = Modifier) {
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
        Spacer(modifier = Modifier.height(12.dp))
        Box(
            contentAlignment = Alignment.Center, modifier = Modifier
                .clip(shape = RoundedCornerShape(12.dp))

                .background(colorResource(id = R.color.newcolor).copy(0.1f))
        ) {

            Row(
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(vertical = 16.dp, horizontal = 24.dp)
            ) {

                Text(
                    text = "Soup x",
                    fontSize = 16.sp,
                    style = TextStyle(colorResource(id = R.color.baige)),
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Composable
fun MenuContent(modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {

        Text(text = "Popular Menu", fontWeight = FontWeight.Bold, fontSize = 24.sp)
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
                    painter = painterResource(id = R.drawable.pancakes),
                    modifier = Modifier.size(60.dp),
                    contentDescription = "pancakes"
                )
                Box(
                    modifier = Modifier.size(width = 180.dp, height = 80.dp),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {


                        Text(
                            text = "Herbal Pancakes",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "Warung Herbal",
                            fontSize = 16.sp,
                            style = TextStyle(color = Color.LightGray)
                        )
                    }
                }
                Text(
                    text = "$7", fontWeight = FontWeight.Bold, fontSize = 25.sp, style = TextStyle(
                        colorResource(id = R.color.baige)
                    )
                )
            }
        }
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
                    painter = painterResource(id = R.drawable.salad),
                    modifier = Modifier.size(80.dp),
                    contentDescription = "salad"
                )
                Box(
                    modifier = Modifier.size(width = 150.dp, height = 80.dp),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {


                        Text(
                            text = "Fruit Salad",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "Wijji Resto",
                            fontSize = 16.sp,
                            style = TextStyle(color = Color.LightGray)
                        )
                    }
                }
                Text(
                    text = "$5", fontWeight = FontWeight.Bold, fontSize = 25.sp, style = TextStyle(
                        colorResource(id = R.color.baige)
                    )
                )
            }
        }
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
                    painter = painterResource(id = R.drawable.nodles),
                    modifier = Modifier.size(80.dp),
                    contentDescription = "noddles"
                )
                Box(
                    modifier = Modifier.size(width = 150.dp, height = 70.dp),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {


                        Text(
                            text = "Green Noddle",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "Noddle Home",
                            fontSize = 16.sp,
                            style = TextStyle(color = Color.LightGray)
                        )
                    }
                }
                Text(
                    text = "$15", fontWeight = FontWeight.Bold, fontSize = 25.sp, style = TextStyle(
                        colorResource(id = R.color.baige)
                    )
                )
            }
        }
    }
}


@Preview
@Composable
fun PreviewMenuScreen() {
    FoodNinjaDeliveryTheme {
        MenuScreen()
    }
}

@Preview
@Composable
fun PreviewTopMenu() {
    FoodNinjaDeliveryTheme {
        TopMenu()
    }
}

@Preview
@Composable
fun PreviewMenuContent() {
    FoodNinjaDeliveryTheme {
        MenuContent()
    }
}