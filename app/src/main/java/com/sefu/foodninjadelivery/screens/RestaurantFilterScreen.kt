package com.sefu.foodninjadelivery.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sefu.foodninjadelivery.R
import com.sefu.foodninjadelivery.ui.theme.FoodNinjaDeliveryTheme

@Composable
fun RestaurantFilterScreen(modifier: Modifier=Modifier) {
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
            TopContent()
            FilteredText()
            Spacer(modifier = Modifier.height(16.dp))
            TopRestaurantContent()


        }
    }
}

@Composable
fun FilteredText(modifier: Modifier=Modifier) {
    Row(modifier = Modifier.fillMaxWidth().padding(vertical = 12.dp), horizontalArrangement = Arrangement.spacedBy(12.dp)) {


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
                    text = ">10 Km X",
                    fontSize = 16.sp,
                    style = TextStyle(colorResource(id = R.color.baige)),
                    fontWeight = FontWeight.Bold
                )
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

                Text(
                    text = "Soup X",
                    fontSize = 16.sp,
                    style = TextStyle(colorResource(id = R.color.baige)),
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewRestaurantFilterScreen() {
    FoodNinjaDeliveryTheme {
        RestaurantFilterScreen()
    }
}

@Preview
@Composable
fun PreviewFilteredText() {
    FoodNinjaDeliveryTheme {
        FilteredText()
    }
}