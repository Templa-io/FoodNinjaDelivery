package com.sefu.foodninjadelivery.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Search
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
fun FilterScreen(modifier: Modifier=Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.background))
    ) {
        Column(verticalArrangement = Arrangement.spacedBy(24.dp),
            modifier = modifier
                .fillMaxSize()
                .padding(24.dp)
        ) {
            TopBarFilter()
            ListContent()
            LocationContent()
            FoodContent()
            BottomButton()
        }
    }
}

@Composable
fun TopBarFilter(modifier: Modifier = Modifier) {
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


            Box(
                modifier = modifier
                    .clip(shape = RoundedCornerShape(12.dp))
                    .fillMaxWidth()
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


    }
}

@Composable
fun ListContent(modifier: Modifier=Modifier) {
    Column(verticalArrangement = Arrangement.spacedBy(20.dp)) {
        Text(text = "Type", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(24.dp)) {
            Box(
                contentAlignment = Alignment.Center, modifier = Modifier
                    .clip(shape = RoundedCornerShape(12.dp))

                    .background(colorResource(id = R.color.newcolor).copy(0.1f))
            ) {

                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(vertical = 16.dp, horizontal = 25.dp)
                ) {

                    Text(text = "Restaurant", style = TextStyle(colorResource(id = R.color.baige)), fontSize = 16.sp, fontWeight = FontWeight.Bold)
                }
            }
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

                    Text(text = "Menu", fontSize = 16.sp, style = TextStyle(colorResource(id = R.color.baige)), fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}

@Composable
fun LocationContent() {
    Column(verticalArrangement = Arrangement.spacedBy(20.dp)) {
        Text(text = "Location", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(24.dp)) {
            Box(
                contentAlignment = Alignment.Center, modifier = Modifier
                    .clip(shape = RoundedCornerShape(12.dp))

                    .background(colorResource(id = R.color.newcolor).copy(0.1f))
            ) {

                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(vertical = 16.dp, horizontal = 25.dp)
                ) {

                    Text(text = "1 km", style = TextStyle(colorResource(id = R.color.baige)), fontSize = 16.sp, fontWeight = FontWeight.Bold)
                }
            }
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

                    Text(text = ">10 Km", fontSize = 16.sp, style = TextStyle(colorResource(id = R.color.baige)), fontWeight = FontWeight.Bold)
                }
            }
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

                    Text(text = "<10 Km", fontSize = 16.sp, style = TextStyle(colorResource(id = R.color.baige)), fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}

@Composable
fun FoodContent(modifier: Modifier=Modifier) {
    Column(verticalArrangement = Arrangement.spacedBy(20.dp)) {
        Text(text = "Food", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(24.dp)) {
            Box(
                contentAlignment = Alignment.Center, modifier = Modifier
                    .clip(shape = RoundedCornerShape(12.dp))

                    .background(colorResource(id = R.color.newcolor).copy(0.1f))
            ) {

                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(vertical = 16.dp, horizontal = 25.dp)
                ) {

                    Text(text = "Cake", style = TextStyle(colorResource(id = R.color.baige)), fontSize = 16.sp, fontWeight = FontWeight.Bold)
                }
            }
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

                    Text(text = "Soup", fontSize = 16.sp, style = TextStyle(colorResource(id = R.color.baige)), fontWeight = FontWeight.Bold)
                }
            }
            Box(
                contentAlignment = Alignment.Center, modifier = Modifier
                    .clip(shape = RoundedCornerShape(12.dp))

                    .background(colorResource(id = R.color.newcolor).copy(0.1f))
            ) {

                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(vertical = 16.dp, horizontal = 16.dp)
                ) {

                    Text(text = "Main Course", fontSize = 16.sp, style = TextStyle(colorResource(id = R.color.baige)), fontWeight = FontWeight.Bold)
                }
            }
        }

            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(24.dp)) {
                Box(
                    contentAlignment = Alignment.Center, modifier = Modifier
                        .clip(shape = RoundedCornerShape(12.dp))

                        .background(colorResource(id = R.color.newcolor).copy(0.1f))
                ) {

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(vertical = 16.dp, horizontal = 25.dp)
                    ) {

                        Text(text = "Appetizer", style = TextStyle(colorResource(id = R.color.baige)), fontSize = 16.sp, fontWeight = FontWeight.Bold)
                    }
                }
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

                        Text(text = "Dessert", fontSize = 16.sp, style = TextStyle(colorResource(id = R.color.baige)), fontWeight = FontWeight.Bold)
                    }
                }
            }

    }

}

@Composable
fun BottomButton(modifier: Modifier=Modifier) {
    Column(modifier = Modifier.fillMaxWidth().padding(top = 20.dp),horizontalAlignment = Alignment.CenterHorizontally) {


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
                .size(width = 300.dp, height = 50.dp)
        ) {
            Text(
                text = "Search",
                fontSize = 20.sp,
                style = TextStyle(color = Color.White)
            )

        }
    }
}

@Preview
@Composable
fun PreviewFilterScreen() {
    FoodNinjaDeliveryTheme {
        FilterScreen()
    }
}

@Preview
@Composable
fun PreviewTopBarFilter() {
    FoodNinjaDeliveryTheme {
        TopBarFilter()
    }
}

@Preview
@Composable
fun PreviewListContent() {
    FoodNinjaDeliveryTheme {
        ListContent()
    }
}

@Preview
@Composable
fun PreviewLocationContent() {
    FoodNinjaDeliveryTheme {
        LocationContent()
    }
}

@Preview
@Composable
fun PreviewFoodContent() {
    FoodNinjaDeliveryTheme {
        FoodContent()
    }
}

@Preview
@Composable
fun PreviewBottomButton() {
    FoodNinjaDeliveryTheme {
        BottomButton()
    }
}