package com.sefu.foodninjadelivery.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sefu.foodninjadelivery.R
import com.sefu.foodninjadelivery.ui.theme.FoodNinjaDeliveryTheme

@Composable
fun MainScreen(modifier: Modifier=Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
LogInScreen()
        LogInContent()
    }
}
@Composable
fun LogInScreen(modifier: Modifier=Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()

    ) {
        Image(
            painter = painterResource(id = R.drawable.pattern), contentDescription = "pattern",
            contentScale = ContentScale.FillBounds, modifier = Modifier
                .size(400.dp)
                .align(alignment = Alignment.TopCenter)
        )
        Box(contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(width = 400.dp, height = 400.dp)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.White.copy(0.1F),
                            Color.White
                        )
                    )
                )
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "",

                modifier = Modifier
                    .size(250.dp)
            )
            Text(text = "LogIn To Your Account", fontSize = 24.sp, fontWeight = FontWeight.Bold, modifier = Modifier.align(alignment = Alignment.BottomCenter))
        }

    }
}

@Composable
fun LogInContent() {
    Column() {


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
                    text = "Email", style = TextStyle(color = Color.Gray)
                )
            })
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
                    text = "Password", style = TextStyle(color = Color.Gray), fontWeight = FontWeight.Bold
                )
            })
    }
}




@Preview
@Composable
fun PreviewMainScreen() {
    FoodNinjaDeliveryTheme {
        MainScreen()
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLogInScreen() {
    FoodNinjaDeliveryTheme {
        LogInScreen()
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLogInContent() {
    FoodNinjaDeliveryTheme {
        LogInContent()
    }
}

