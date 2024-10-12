package com.example.nexify.User_Interface.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nexify.R


@Preview
@Composable
fun MainPage(){
    Page(navController = rememberNavController())
}


@Composable
fun Page(navController: NavController){


    Column(modifier  = Modifier
        .fillMaxSize()
        .padding(8.dp)
        .clip(RoundedCornerShape(8.dp))
        .background(color = Color.White),
        verticalArrangement = Arrangement.SpaceBetween) {

        // "Верхний" отдел экрана -- раздел для приветствия, уведомлений и поисковой строки

        Column(modifier = Modifier
            .weight(1f),
            verticalArrangement = Arrangement.SpaceBetween) {

            // Пустая строка для небольшого пропуска места
            // *Вероятно для этого есть более элегантное решение, но пока так

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(25.dp)
            ) {

            }

            /*
            Row(){
                Column (modifier = Modifier
                    .weight(1f)){
                    Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .padding(8.dp)
                        .border((1.dp), color = Color.Black, RoundedCornerShape(20.dp))
                        .clickable { navController.navigate("VacancyScreen") }
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxHeight(),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            modifier = Modifier
                                .padding(15.dp)
                                .size(35.dp),
                            painter = painterResource(id = R.drawable.vacancy),
                            contentDescription = ""
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Text(
                            fontSize = 14.sp,
                            text = "Вакансии"
                        )

                        Image(
                            modifier = Modifier
                                .size(30.dp),
                            painter = painterResource(id = R.drawable.navigate_next_asset),
                            contentDescription = ""
                        )
                    }
                }
                }
                Column (modifier = Modifier
                    .weight(1f)){
                    Row(modifier = Modifier
                        .weight(1f)){

                    }
                    Row(modifier = Modifier
                        .weight(1f)){

                    }
                }
            }
            */


            Row()
            {

                Row(
                    modifier = Modifier
                        .weight(1f)
                        .height(200.dp)
                        .padding(8.dp)
                        .border((1.dp), color = Color.Black, RoundedCornerShape(20.dp))
                        .clickable { navController.navigate("VacancyScreen") }
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxHeight(),
                        verticalArrangement = Arrangement.Top
                    ) {
                        Image(
                            modifier = Modifier
                                .padding(15.dp)
                                .size(35.dp),
                            painter = painterResource(id = R.drawable.vacancy),
                            contentDescription = ""
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Text(
                            fontSize = 14.sp,
                            text = "Вакансии"
                        )

                        Image(
                            modifier = Modifier
                                .size(30.dp),
                            painter = painterResource(id = R.drawable.navigate_next_asset),
                            contentDescription = ""
                        )
                    }
                }


                Column (modifier = Modifier
                    .weight(1f)){


                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .padding(8.dp)
                            .border((1.dp), color = Color.Black, RoundedCornerShape(20.dp))
                            .clickable { navController.navigate("InternshipsScreen") },
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxHeight(),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Image(
                                modifier = Modifier
                                    .padding(15.dp)
                                    .size(35.dp),
                                painter = painterResource(id = R.drawable.boat_asset),
                                contentDescription = ""
                            )
                        }
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(top = 10.dp, bottom = 10.dp),
                            verticalArrangement = Arrangement.SpaceBetween
                        )
                        {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {

                                Text(
                                    fontSize = 14.sp,
                                    text = "Стажировки"
                                )

                                Image(
                                    modifier = Modifier
                                        .size(30.dp),
                                    painter = painterResource(id = R.drawable.navigate_next_asset),
                                    contentDescription = ""
                                )
                            }
                        }
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .padding(8.dp)
                            .border((1.dp), color = Color.Black, RoundedCornerShape(20.dp))
                            .clickable { navController.navigate("EventsScreen") }
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxHeight(),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Image(
                                modifier = Modifier
                                    .padding(15.dp)
                                    .size(35.dp),
                                painter = painterResource(id = R.drawable.events_asset),
                                contentDescription = ""
                            )
                        }

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 10.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            Text(
                                fontSize = 14.sp,
                                text = "Ивенты"
                            )

                            Image(
                                modifier = Modifier
                                    .size(30.dp),
                                painter = painterResource(id = R.drawable.navigate_next_asset),
                                contentDescription = ""
                            )
                        }
                    }
                }
            }
        }


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
                Column(
                    modifier = Modifier
                        .clickable { navController.navigate("MainPage") },
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        modifier = Modifier
                            .size(25.dp),
                        painter = painterResource(id = R.drawable.home),
                        colorFilter = ColorFilter.tint(color = colorResource(id = R.color.light_purple)),
                        contentDescription = ""
                    )

                    Text(
                        color = colorResource(id = R.color.light_purple),
                        text = "Главная"
                    )
                }
                /*
                Column(horizontalAlignment = Alignment.CenterHorizontally) {

                    Image(
                        modifier = Modifier
                            .size(25.dp),
                        painter = painterResource(id = R.drawable.ticket),
                        contentDescription = ""
                    )

                    Text(text = "Лента")
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {

                    Image(
                        modifier = Modifier
                            .size(25.dp),
                        painter = painterResource(id = R.drawable.menu),
                        contentDescription = ""
                    )

                    Text(text = "Меню")
                }
                */
                 
            }
        }
    }
}