package com.sefu.foodninjadelivery.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
fun ChatScreen(modifier: Modifier = Modifier) {
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
    }
}

@Composable
fun ChatContent(modifier: Modifier = Modifier) {

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
                    .padding(horizontal = 8.dp, vertical = 24.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.annawp),
                    modifier = Modifier.size(60.dp),
                    contentDescription = "Ann"
                )
                Box(
                    modifier = Modifier.size(width = 180.dp, height = 80.dp),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {


                        Text(
                            text = "Dqaniel Russel",
                            fontSize = 16.sp,

                            )
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(2.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Box(
                                modifier = Modifier
                                    .clip(shape = RoundedCornerShape(12.dp))
                                    .size(10.dp)
                                    .background(colorResource(id = R.color.dark_green))
                            ) {

                            }
                            Text(
                                text = "Online",
                                fontSize = 16.sp,
                                style = TextStyle(color = Color.LightGray)
                            )

                        }
                    }
                }
                Box(
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(244.dp))
                        .size(50.dp)
                        .background(colorResource(id = R.color.dark_green).copy(0.1f)),
                    contentAlignment = Alignment.Center
                ) {
                    Box(modifier = Modifier.size(50.dp), contentAlignment = Alignment.TopCenter) {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(Icons.Rounded.Call, contentDescription ="", modifier = Modifier.size(30.dp), tint = colorResource(id = R.color.dark_green) )
                        }
                    }
                }
            }
        }

    }
}


@Preview
@Composable
fun PreviewChatScreen() {
    FoodNinjaDeliveryTheme {
        ChatScreen()
    }
}

@Preview
@Composable
fun PreviewChatContent() {
    FoodNinjaDeliveryTheme {
        ChatContent()
    }
}