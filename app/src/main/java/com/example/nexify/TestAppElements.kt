package com.example.nexify

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Preview(showSystemUi = true)
@Composable
fun TestScreen(){
    Test(navController = rememberNavController())
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Test(navController: NavController){
    Column (modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween)
    {
        TopAppBar(title = { Text(text = "Вернуться", fontSize = 17.sp) },

            navigationIcon = { IconButton(onClick = {navController.navigate("MainPage")}) {
                Image(painter = painterResource(id = R.drawable.back_asset), contentDescription = "")
            } },

            actions = {
                IconButton(onClick = { }) {
                    Image(painter = painterResource(id = R.drawable.search2_asset), contentDescription = "")
                }

                IconButton(onClick = { }) {
                    Image(painter = painterResource(id = R.drawable.filter_asset), contentDescription = "")
                }
            }
        )

            BottomAppBar(
                containerColor = Color.White
                ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Column (modifier = Modifier
                        .clickable { navController.navigate("MainPage") },
                        horizontalAlignment = Alignment.CenterHorizontally
                        ) {

                        Image(modifier = Modifier
                            .size(25.dp),
                            painter = painterResource(id = R.drawable.home),
                            contentDescription = ""
                        )

                        Text(text = "Главная")
                    }

                    Column (horizontalAlignment = Alignment.CenterHorizontally){

                        Image(modifier = Modifier
                            .size(25.dp),
                            painter = painterResource(id = R.drawable.ticket),
                            contentDescription = ""
                        )

                        Text(text = "Лента")
                    }

                    Column (horizontalAlignment = Alignment.CenterHorizontally){

                        Image(modifier = Modifier
                            .size(25.dp),
                            painter = painterResource(id = R.drawable.menu),
                            contentDescription = ""
                        )

                        Text(text = "Меню")
                    }


                }
            }
    }
}