package com.example.nexify.User_Interface

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nexify.R


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


@Preview
@Composable
fun EventCard(){

    Row (modifier = Modifier
        .fillMaxWidth()
        .height(130.dp)
        .padding(8.dp)
        .clip(shape = RoundedCornerShape(15.dp))
        .background(color = colorResource(id = R.color.light_gray))) {

        Column(){
            Row(modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically){

                Row(modifier = Modifier
                    .height(65.dp)){

                    // кружочек
                    Column(modifier = Modifier
                        .size(45.dp)
                        .clip(shape = RoundedCornerShape(25.dp))
                        .background(color = colorResource(id = R.color.one_more_light_gray)),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally){

                        // вставить сюда картинку - лого компании

                    }

                    // отступ (возможно это можно сделать более красиво, но пока так)
                    Column(modifier = Modifier
                        .height(65.dp)
                        .width(10.dp)){

                    }

                    Column(modifier = Modifier
                        .height(65.dp)
                        .width(200.dp)
                    ){
                        Text(fontSize = 16.sp,
                            text = "Event Event Event")


                    }
                }
                Image(modifier = Modifier
                    .size(20.dp),
                    painter = painterResource(id = R.drawable.heart),
                    contentDescription = "")
            }
            Row (modifier = Modifier
                .fillMaxWidth()
                .height(0.6.dp)
                .padding(start = 8.dp, end = 8.dp)
                .background(color = colorResource(id = R.color.dart_gray_idk))){

            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .weight(1f),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically){
                Row(modifier = Modifier,
                ){
                    Row (modifier = Modifier
                        .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween){

                        Text(color = colorResource(id = R.color.dart_gray_idk),
                            text = "")


                        // маленький кружочек :3
                        Column (modifier = Modifier
                            .size(3.dp)
                            .clip(shape = RoundedCornerShape(5.dp))
                            .background(color = colorResource(id = R.color.very_dark_gray))
                        ){
                        }

                        Text(color = colorResource(id = R.color.dart_gray_idk),
                            text = "")

                        // ещё один маленький кружочек
                        Column (modifier = Modifier
                            .size(3.dp)
                            .clip(shape = RoundedCornerShape(5.dp))
                            .background(color = colorResource(id = R.color.very_dark_gray))
                        ){
                        }

                        Text(color = colorResource(id = R.color.dart_gray_idk),
                            text = "")
                    }
                }



            }
        }
    }
}