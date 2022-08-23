package com.sefu.foodninjadelivery.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
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
fun PhotoContent(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.White),
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Box() {
                Column() {
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
                    Spacer(modifier = Modifier.height(16.dp))
                    Column() {
                        Text(
                            text = "Upload Your Photo\nProfile",
                            fontSize = 32.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(text = "This data will be displayed in you account\nprofile for security")
                }
            }
            Column(modifier = Modifier.padding(horizontal = 20.dp, vertical = 4.dp)) {
                Card(
                    elevation = 10.dp, shape = RoundedCornerShape(20.dp), modifier = modifier
                        .fillMaxWidth()
                        .height(120.dp)
                        .background(color = Color.White)
                ) {

                    Column(
                        modifier = Modifier.fillMaxSize() .padding(12.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.gallery),
                            modifier = Modifier.size(60.dp),
                            contentDescription = "camera"
                        )
                        Text(text = "From Gallery", fontWeight = FontWeight.Bold)
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
                Card(

                    elevation = 10.dp, shape = RoundedCornerShape(20.dp), modifier = modifier
                        .fillMaxWidth()
                        .height(120.dp)

                        .background(color = Color.White)
                )
                {
                    Column(
                        modifier = Modifier.fillMaxSize() .padding(12.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.camera),
                            modifier = Modifier.size(60.dp),
                            contentDescription = "camera"
                        )
                        Text(text = "Take Photo", fontWeight = FontWeight.Bold)
                    }

                }

            }
            Spacer(modifier = Modifier.height(200.dp))

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
fun PreviewPhotoContent() {
    FoodNinjaDeliveryTheme {
        PhotoContent()
    }
}