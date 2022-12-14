package com.sefu.foodninjadelivery.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.ShoppingCart
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
fun HomeMainScreen(modifier: Modifier = Modifier) {
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
            TopHeader()
            SearchBox()
            RestaurantContent()
            Spacer(modifier = Modifier.height(20.dp))
            BottomBar()
        }
    }

}

@Composable
fun TopHeader(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Find Your \nFavourite Food", fontWeight = FontWeight.Bold, fontSize = 34.sp)
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
                        .border(width = 2.dp, color = Color.White, shape = RoundedCornerShape(8.dp))
                        .background(color = Color.Red)
                        .size(15.dp)
                ) {

                }
            }

        }
    }
}

@Composable
fun SearchBox(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {


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
        Box(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(12.dp))
                .size(width = 400.dp, height = 150.dp)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            colorResource(id = R.color.light_green),
                            colorResource(id = R.color.dark_green)
                        )
                    )
                )
        ) {


            Image(
                painter = painterResource(id = R.drawable.image),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .size(300.dp),
                contentDescription = ""
            )
            Box(
                contentAlignment = Alignment.Center, modifier = Modifier
                    .size(200.dp)
                    .align(alignment = Alignment.TopEnd)
            ) {

                Column(modifier = Modifier.padding(start = 22.dp)) {
                    Text(
                        text = "Special Deal For\nOctober", fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        style = TextStyle(color = Color.White)
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Card(
                        shape = RoundedCornerShape(5.dp),
                        elevation = 10.dp

                    ) {
                        Text(
                            modifier = Modifier
                                .padding(vertical = 8.dp, horizontal = 16.dp)
                                .background(color = Color.White),
                            text = "Buy Now",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            style = TextStyle(
                                colorResource(id = R.color.dark_green)
                            )
                        )
                    }
                }
            }
        }
        Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Nearest Restaurant", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Text(
                text = "View more",
                fontSize = 16.sp,
                style = TextStyle(colorResource(id = R.color.Light_baige))
            )
        }
    }

}

@Composable
fun RestaurantContent(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 20.dp), horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Box(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(12.dp))
                .background(color = Color.White)
        ) {
            Column(
                modifier = Modifier.padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.res),
                    contentDescription = "restaurant",
                    modifier = Modifier.size(100.dp)
                )
                Text(text = "Vegan Resto", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                Text(text = "12 Mins", style = TextStyle(color = Color.Gray))
            }
        }
        Box(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(12.dp))
                .background(color = Color.White)
        ) {
            Column(
                modifier = Modifier.padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img),
                    contentDescription = "restaurant",
                    modifier = Modifier.size(100.dp)
                )
                Text(text = "Healthy Food", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                Text(text = "8 Mins", style = TextStyle(color = Color.Gray))
            }
        }
    }
}

@Composable
fun BottomBar(modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .clip(shape = RoundedCornerShape(12.dp))
            .fillMaxWidth()
            .height(80.dp)
            .background(color = Color.White)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()
        ) {

            Box(
                contentAlignment = Alignment.Center, modifier = Modifier
                    .clip(shape = RoundedCornerShape(12.dp))

                    .background(colorResource(id = R.color.light_green).copy(0.3f))
            ) {

                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(vertical = 6.dp, horizontal = 12.dp)
                ) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            Icons.Rounded.Home,
                            contentDescription = "", tint = colorResource(id = R.color.dark_green),
                            modifier = Modifier.size(40.dp)
                        )

                    }
                    Text(text = "Home", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                }
            }
            Icon(
                Icons.Rounded.Person,
                contentDescription = "person",
                modifier = Modifier.size(28.dp),
                tint = colorResource(
                    id = R.color.light_green
                )
            )
            Box(contentAlignment = Alignment.Center, modifier = Modifier.size(50.dp)) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        Icons.Rounded.ShoppingCart,
                        contentDescription = "Cart",
                        modifier = Modifier.size(28.dp),
                        tint = colorResource(
                            id = R.color.light_green
                        )
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 18.dp, start = 16.dp, top = 2.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.Top
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .clip(shape = RoundedCornerShape(8.dp))
                            .border(
                                width = 2.dp,
                                color = Color.White,
                                shape = RoundedCornerShape(8.dp)
                            )
                            .background(color = Color.Red)
                            .size(18.dp)
                    ) {
                        Text(text = "7", style = TextStyle(color = Color.White))
                    }
                }

            }
            Box(contentAlignment = Alignment.Center, modifier = Modifier.size(50.dp)) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painterResource(id = R.drawable.sms),
                        modifier = Modifier.size(24.dp),
                        contentDescription = "Cart",
                        tint = colorResource(
                            id = R.color.light_green
                        )
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
                                .size(17.dp)
                        ) {

                        }
                    }
                }

            }

        }
    }
}

@Preview
@Composable
fun PreviewHomeMainScreen() {
    FoodNinjaDeliveryTheme {
        HomeMainScreen()
    }
}

@Preview
@Composable
fun PreviewTopHeader() {
    FoodNinjaDeliveryTheme {
        TopHeader()
    }
}

@Preview
@Composable
fun PreviewSearchBox() {
    FoodNinjaDeliveryTheme {
        SearchBox()
    }
}

@Preview
@Composable
fun PreviewRestaurantContent() {
    FoodNinjaDeliveryTheme {
        RestaurantContent()
    }
}

@Preview
@Composable
fun PreviewBottomBar() {
    FoodNinjaDeliveryTheme {
        BottomBar()
    }
}