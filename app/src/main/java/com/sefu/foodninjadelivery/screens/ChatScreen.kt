package com.sefu.foodninjadelivery.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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