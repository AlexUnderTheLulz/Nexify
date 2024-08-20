package com.example.nexify

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


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

        Column() {

            // Пустая строка для небольшого пропуска места
            // *Вероятно для этого есть более элегантное решение, но пока так

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(25.dp)
            ) {

            }

            // Персональная информация и приветствие

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row() {
                    Image(
                        modifier = Modifier
                            .size(60.dp)
                            .clip(shape = RoundedCornerShape(30.dp)),
                        painter = painterResource(id = R.drawable.avatar),
                        contentDescription = ""
                    )

                    Column(
                        modifier = Modifier
                            .padding(8.dp),
                    ) {
                        Text(
                            modifier = Modifier,
                            fontSize = 15.sp,
                            text = "Хорошего дня!"
                        )

                        Text(
                            modifier = Modifier,
                            fontSize = 20.sp,
                            text = "Дэн Смит"
                        )
                    }
                }

                Box(modifier = Modifier
                    .size(40.dp)
                    .border(1.dp, color = Color.LightGray, shape = RoundedCornerShape(20.dp))
                ){
                    Image(modifier = Modifier
                        .align(Alignment.Center)
                        .size(30.dp),
                        painter = painterResource(id = R.drawable.notification_asset), contentDescription = "")
                }

            }

            // Пустая строка для небольшого пропуска места

            Row(modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)){
                
            }

            // Поисковая строка

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .padding(8.dp)
                    .border((1.dp), color = Color.Black, RoundedCornerShape(20.dp)),
                verticalAlignment = Alignment.CenterVertically
            ) {


                Image(
                    modifier = Modifier
                        .padding(start = 17.dp)
                        .size(20.dp),
                    painter = painterResource(id = R.drawable.search_asset),
                    contentDescription = ""
                )

                Text(
                    modifier = Modifier,
                    fontSize = 14.sp,
                    color = Color.LightGray,
                    text = "Search..."
                )
            }


            Row(modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)){
                Column(modifier = Modifier
                    .fillMaxHeight()
                    .padding(8.dp)
                    .weight(1f)
                    .border((1.dp), color = Color.Black, RoundedCornerShape(35.dp)),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){

                    Text(
                        modifier = Modifier
                        .padding(top = 20.dp),
                        fontSize = 20.sp,
                        text = "Обсуждение"
                    )
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 15.dp, bottom = 20.dp, end = 15.dp),
                        horizontalArrangement = Arrangement.SpaceBetween){

                        // кружочек

                        Column(modifier = Modifier
                            .size(30.dp)
                            .clip(shape = RoundedCornerShape(15.dp))
                            .background(color = Color.LightGray),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                            ){
                            Image(modifier = Modifier
                                .size(20.dp),
                                painter = painterResource(id = R.drawable.dialog),
                                contentDescription = ""
                            )
                        }

                        Image(
                            modifier = Modifier
                            .size(30.dp),
                            painter = painterResource(id = R.drawable.arrow_asset),
                            contentDescription = ""
                        )
                    }
                }


                Column(modifier = Modifier
                    .fillMaxHeight()
                    .padding(8.dp)
                    .clip(shape = RoundedCornerShape(35.dp))
                    .background(color = colorResource(id = R.color.very_dark_gray))
                    .weight(1f),
                    verticalArrangement = Arrangement.SpaceBetween
                ){
                    Column(modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 15.dp, top = 20.dp, end = 15.dp)){


                        Text(
                            fontSize = 20.sp,
                            color = Color.White,
                            text = "Лента")
                        Text(
                            fontSize = 20.sp,
                            color = Color.White,
                            text = "событий")
                    }

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 15.dp, bottom = 20.dp, end = 15.dp),
                        horizontalArrangement = Arrangement.SpaceBetween) {

                        // кружочек

                        Column(
                            modifier = Modifier
                                .size(30.dp)
                                .clip(shape = RoundedCornerShape(15.dp))
                                .background(color = Color.LightGray),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(modifier = Modifier
                                .size(20.dp),
                                painter = painterResource(id = R.drawable.talk_man),
                                contentDescription = "")
                        }
                        Image(
                            modifier = Modifier
                                .size(30.dp),
                            painter = painterResource(id = R.drawable.arrow_asset),
                            colorFilter = ColorFilter.tint(color = Color.White),
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
                    .clickable { navController.navigate("VacancyScreen")}
            ) {
                Column(modifier = Modifier
                    .fillMaxHeight(),
                    verticalArrangement = Arrangement.Center) {
                    Image(
                        modifier = Modifier
                            .padding(15.dp)
                            .size(35.dp),
                        painter = painterResource(id = R.drawable.vacancy),
                        contentDescription = ""
                    )
                }
                Row (modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically){

                    Text(
                        fontSize = 14.sp,
                        text = "Вакансии")

                    Image(modifier = Modifier
                        .size(30.dp),
                        painter = painterResource(id = R.drawable.navigate_next_asset),
                        contentDescription = "")
                }

            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .padding(8.dp)
                    .border((1.dp), color = Color.Black, RoundedCornerShape(20.dp)),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier
                    .fillMaxHeight(),
                    verticalArrangement = Arrangement.Center) {
                    Image(
                        modifier = Modifier
                            .padding(15.dp)
                            .size(35.dp),
                        painter = painterResource(id = R.drawable.boat_asset),
                        contentDescription = ""
                    )
                }
                Column(modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 10.dp, bottom = 10.dp),
                    verticalArrangement = Arrangement.SpaceBetween)
                {
                    Row (modifier = Modifier
                        .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically){

                        Text(
                            fontSize = 14.sp,
                            text = "Стажировки")

                        Image(modifier = Modifier
                            .size(30.dp),
                            painter = painterResource(id = R.drawable.navigate_next_asset),
                            contentDescription = ""
                        )
                    }
                    Row (modifier = Modifier
                        .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically){

                        Text(
                            fontSize = 14.sp,
                            text = "видимость 5 сек")

                        Image(modifier = Modifier
                            .size(30.dp),
                            painter = painterResource(id = R.drawable.more_asset),
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
            ) {
                Column(modifier = Modifier
                    .fillMaxHeight(),
                    verticalArrangement = Arrangement.Center) {
                    Image(
                        modifier = Modifier
                            .padding(15.dp)
                            .size(35.dp),
                        painter = painterResource(id = R.drawable.events_asset),
                        contentDescription = ""
                    )
                }
                Row (modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically){

                    Text(
                        fontSize = 14.sp,
                        text = "Мероприятия")

                    Image(modifier = Modifier
                        .size(30.dp),
                        painter = painterResource(id = R.drawable.navigate_next_asset),
                        contentDescription = "")
                }
            }
        }

        // "Нижний" отдел экрана -- раздел с вакансиями и мероприятиями

        Column() {


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
                        contentDescription = ""
                    )

                    Text(text = "Главная")
                }
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
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {

            }
        }
    }
}