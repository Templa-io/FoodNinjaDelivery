package com.sefu.foodninjadelivery.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sefu.foodninjadelivery.R
import com.sefu.foodninjadelivery.ui.theme.FoodNinjaDeliveryTheme

@Composable
fun FoodFilterScreen(modifier: Modifier=Modifier) {

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
               TopContent()
                MenuContent()
                Spacer(modifier = Modifier.height(24.dp))
                BottomBar()
            }
        }
    }


@Preview
@Composable
fun PreviewFoodFilterScreen() {
    FoodNinjaDeliveryTheme() {
        FoodFilterScreen()
    }
}