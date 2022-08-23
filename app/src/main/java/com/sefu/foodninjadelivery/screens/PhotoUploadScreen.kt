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
fun PhotoUploadScreen(modifier: Modifier = Modifier) {
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
            verticalArrangement = Arrangement.spacedBy(30.dp)
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
                    Box() {
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
            Image(painter = painterResource(id = R.drawable.photo), contentDescription = "photo", modifier = Modifier.size(250.dp))
            Spacer(modifier = Modifier.height(100.dp))
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
fun PreviewPhotoUploadScreen() {
    FoodNinjaDeliveryTheme {
        PhotoUploadScreen()
    }
}