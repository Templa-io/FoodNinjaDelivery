package com.sefu.foodninjadelivery.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Lock
import androidx.compose.material.icons.rounded.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
fun MainScreenTwo(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.background))
    ) {
        TopLogo()
        SignInContent()
        BottomContent()
    }
}

@Composable
fun TopLogo(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()

    ) {
        Image(
            painter = painterResource(id = R.drawable.pattern), contentDescription = "pattern",
            contentScale = ContentScale.FillBounds, modifier = Modifier
                .size(width = 400.dp, height = 300.dp)
                .align(alignment = Alignment.TopCenter)
        )
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(width = 400.dp, height = 300.dp)
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
                        .size(200.dp)
                )


                Text(text = "Sign Up For free", fontSize = 24.sp, fontWeight = FontWeight.Bold)

            }
        }
    }
}

@Composable
fun SignInContent(modifier: Modifier = Modifier) {
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
                    Icon(
                        Icons.Rounded.Person,
                        tint = colorResource(id = R.color.light_green),
                        contentDescription = "Person"
                    )
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
                                text = "Your Name", style = TextStyle(color = Color.LightGray)
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
                    Icon(
                        Icons.Rounded.Email,
                        tint = colorResource(id = R.color.light_green),
                        contentDescription = "email"
                    )
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
                    Icon(
                        Icons.Rounded.Lock,
                        tint = colorResource(id = R.color.light_green),
                        contentDescription = "lock"
                    )
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
                        }, trailingIcon = {
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(
                                    painterResource(id = R.drawable.visibility),
                                    contentDescription = "",
                                    modifier = Modifier.size(20.dp)
                                )
                            }
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun BottomContent(modifier: Modifier = Modifier) {
    Box(modifier = Modifier.size(width = 400.dp, height = 300.dp)) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            Box() {
                Column(modifier = Modifier.padding(20.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        val checkedState = remember { mutableStateOf(true) }
                        Checkbox(
                            modifier = Modifier.clip(CircleShape),
                            checked = checkedState.value, colors = CheckboxDefaults.colors(
                                colorResource(id = R.color.dark_green))
                            ,
                            onCheckedChange = { checkedState.value = it })

                        Text(text = "Keep Me Signed In", style = TextStyle(color = Color.Gray))
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        val checkedState = remember { mutableStateOf(true) }

                            Checkbox(modifier = Modifier.clip(shape = CircleShape),
                                checked = checkedState.value, colors = CheckboxDefaults.colors(
                                    colorResource(id = R.color.dark_green)),
                                onCheckedChange = { checkedState.value = it })



                        Text(
                            text = "Email Me About Special Pricing",
                            style = TextStyle(color = Color.Gray)
                        )
                    }


                }
            }

            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
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
                            text = "Create Account",
                            fontSize = 20.sp,
                            style = TextStyle(color = Color.White)
                        )

                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        text = "already have an account?",
                        fontSize = 16.sp,
                        style = TextStyle(colorResource(id = R.color.dark_green))
                    )
                }

            }


        }

    }
}


@Preview
@Composable
fun PreviewMainScreenTwo() {
    FoodNinjaDeliveryTheme {
        MainScreenTwo()
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSignInContent() {
    FoodNinjaDeliveryTheme {
        SignInContent()
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTopLogo() {
    FoodNinjaDeliveryTheme {
        TopLogo()
    }
}

@Preview
@Composable
fun PreviewBottomContent() {
    FoodNinjaDeliveryTheme {
        BottomContent()
    }
}