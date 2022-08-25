package com.sefu.foodninjadelivery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sefu.foodninjadelivery.screens.*
import com.sefu.foodninjadelivery.ui.theme.FoodNinjaDeliveryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodNinjaDeliveryTheme {
                // A surface container using the 'background' color from the theme
//                StartScreen()
//                StartScreenTwo()
//                StartScreenThree()
//                MainScreen()
//                LogInScreen()
//            MainScreenTwo()
//                BioContent()
//                PaymentInfo()
//                PhotoContent()
//                PhotoUploadScreen()
//                LocationScreen()
//                SuccessScreen()
//                VerifyScreen()
//                MethodScreen()
//                PasswordContent()
//                NotificationScreen()
//                HomeMainScreen()
//                ExploreRestaurantScreen()
//                FilterScreen()
                MenuScreen()
            }
        }
    }
}

@Composable
fun StartScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Image(
            painter = painterResource(id = R.drawable.pattern), contentDescription = "pattern",
            contentScale = ContentScale.FillBounds, modifier = Modifier
                .size(400.dp)
                .align(alignment = Alignment.TopCenter)
        )
        Box(
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

        }
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "",

            modifier = Modifier
                .align(alignment = Alignment.Center)
                .size(200.dp)
        )
    }
}

@Preview
@Composable
fun PreviewStartScreen() {
    FoodNinjaDeliveryTheme {
        StartScreen()
    }
}