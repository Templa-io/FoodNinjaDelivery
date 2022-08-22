package com.sefu.foodninjadelivery.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
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
fun MainScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.background))
    ) {
        LogInScreen()
        LogInContent()
        LoginOptions()
    }
}

@Composable
fun LogInScreen(modifier: Modifier = Modifier) {
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
        Box(
            contentAlignment = Alignment.Center,
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
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround
            ) {


                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "",

                    modifier = Modifier
                        .size(250.dp)
                )


                Text(text = "LogIn To Your Account", fontSize = 24.sp, fontWeight = FontWeight.Bold)

            }
        }
    }
}

@Composable
fun LogInContent(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box {
            Column(modifier = Modifier.padding(horizontal = 20.dp, vertical = 4.dp)) {
                Box(
                    modifier = modifier
                        .clip(shape = RoundedCornerShape(12.dp))
                        .fillMaxWidth()
                        .height(50.dp)
                        .background(color = Color.White)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {

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
                                    text = "Email", style = TextStyle(color = Color.LightGray)
                                )
                            })
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
                Box(
                    modifier = modifier
                        .clip(shape = RoundedCornerShape(12.dp))
                        .fillMaxWidth()
                        .height(50.dp)
                        .background(color = Color.White)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {

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
                                    text = "Password",
                                    style = TextStyle(color = Color.LightGray),
                                    fontWeight = FontWeight.Bold
                                )
                            })
                    }
                }
            }
        }

    }
}

@Composable
fun LoginOptions(modifier: Modifier = Modifier) {
    Box(Modifier.size(width = 400.dp, height = 300.dp)) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Text(text = "or Continue With", fontWeight = FontWeight.Bold)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    contentAlignment = Alignment.Center, modifier = Modifier
                        .clip(shape = RoundedCornerShape(16.dp))
                        .background(color = Color.White)
                        .size(width = 150.dp, height = 50.dp)
                ) {
                    Row(horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(id = R.drawable.fb),
                            modifier = Modifier.size(30.dp),
                            contentDescription = "fb"
                        )
                        Spacer(modifier = Modifier.width(16.dp))
                        Text(text = "Facebook", fontWeight = FontWeight.Bold)
                    }

                }
                Box(
                    contentAlignment = Alignment.Center, modifier = Modifier
                        .clip(shape = RoundedCornerShape(16.dp))
                        .background(color = Color.White)
                        .size(width = 150.dp, height = 50.dp)
                ) {
                    Row(horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically,) {
                        Image(
                            painter = painterResource(id = R.drawable.gmail),
                            contentDescription = "gmail",
                            modifier = Modifier.size(30.dp)
                        )
                        Spacer(modifier = Modifier.width(16.dp))
                        Text(text = "Google", fontWeight = FontWeight.Bold)
                    }

                }
            }
            Text(text = "forgot your password?", fontSize = 16.sp, style = TextStyle(color = Color.Green))
            Box(
                contentAlignment = Alignment.Center, modifier = Modifier
                    .clip(shape = RoundedCornerShape(16.dp))
                    .background(color = Color.Green)
                    .size(width = 150.dp, height = 50.dp)
            ) {
                Text(text = "Login", fontSize = 20.sp, style = TextStyle(color = Color.White))
            }
        }
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

@Preview(showBackground = true)
@Composable
fun PreviewLoginOptions() {
    FoodNinjaDeliveryTheme {
        LoginOptions()
    }
}

