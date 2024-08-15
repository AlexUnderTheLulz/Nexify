package com.example.nexify

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Preview
@Composable
fun MainVacancy(){
    Vacancy(jobs, navController = rememberNavController())
}

@Composable

fun Vacancy(vacancies: List<Vacancy>, navController: NavController){

    Column (modifier = Modifier
        .fillMaxSize()
        .padding(8.dp)
        .background(color = Color.White),
        verticalArrangement = Arrangement.SpaceBetween) {

    Column(){

        // Отступ сверху
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(25.dp)
        ) {

        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .height(50.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.back_asset),
                    contentDescription = ""
                )

                Text(text = "Вернуться")
            }

            Row() {
                Box(modifier = Modifier) {
                    Image(
                        painter = painterResource(id = R.drawable.search2_asset),
                        contentDescription = ""
                    )
                }
                Box(modifier = Modifier) {
                    Image(
                        painter = painterResource(id = R.drawable.filter_asset),
                        contentDescription = ""
                    )
                }
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(225.dp)
                .padding(8.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                modifier = Modifier
                    .size(400.dp),
                painter = painterResource(
                    id = R.drawable.img
                ),
                contentDescription = ""
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
                .padding(8.dp)
        ) {

            Text(
                fontSize = 20.sp,
                text = "Вакансии"
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .padding(8.dp)
        ) {

            Text(
                fontSize = 13.sp,
                text = "Присоединяйтесь к сообществу, поскольку в течение 33 дней мы готовимся расслабиться и почувствовать радость вместе с разумом и сеансом счастья по всему миру."
            )
        }

        Row (modifier = Modifier
            .fillMaxWidth()
            .height(0.7.dp)
            .padding(start = 8.dp, end = 8.dp)
            .background(color = colorResource(id = R.color.dart_gray_idk))){

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
                .padding(8.dp)
        ) {

            Text(
                fontSize = 20.sp,
                text = "Рекомендации"
            )
        }
    }

        // сделать высоту динамической, чтобы не перекрывало нижнюю часть

        LazyColumn (modifier = Modifier
            .height(275.dp)
            .padding(start = 8.dp, end = 8.dp)){
            items(vacancies) { vacancy ->
                VacancyCard(vacancy = vacancy)
                Spacer(modifier = Modifier
                .height(8.dp))}
        }


        // Нижняя панель навигации

        Column() {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column (modifier = Modifier
                    .clickable { navController.navigate("MainPage") },

                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painter = painterResource(id = R.drawable.home_asset),
                        contentDescription = "")
                    Text(text = "Главная")
                }
                Column (horizontalAlignment = Alignment.CenterHorizontally){
                    Image(painter = painterResource(id = R.drawable.ticket_asset),
                        contentDescription = "")
                    Text(text = "Лента")
                }
                Column (horizontalAlignment = Alignment.CenterHorizontally){
                    Image(painter = painterResource(id = R.drawable.menu_asset), contentDescription = "")
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


//  разобраться с этим!!

@Composable
fun VacancyCard(vacancy: Vacancy){

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
                            text = vacancy.title)

                        Row (modifier = Modifier
                            .fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween){

                            Text(color = colorResource(id = R.color.dart_gray_idk),
                                text = vacancy.bpoint1)


                            // маленький кружочек :3
                            Column (modifier = Modifier
                                .size(3.dp)
                                .clip(shape = RoundedCornerShape(5.dp))
                                .background(color = colorResource(id = R.color.very_dark_gray))
                            ){
                            }

                            Text(color = colorResource(id = R.color.dart_gray_idk),
                                text = vacancy.bpoint2)

                            // ещё один маленький кружочек
                            Column (modifier = Modifier
                                .size(3.dp)
                                .clip(shape = RoundedCornerShape(5.dp))
                                .background(color = colorResource(id = R.color.very_dark_gray))
                            ){
                            }

                            Text(color = colorResource(id = R.color.dart_gray_idk),
                                text = vacancy.bpoint3)
                        }
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
                .height(65.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically){
                Row(modifier = Modifier,
                ){
                    Text("\$${vacancy.salary}")
                    Text(color = colorResource(id = R.color.dart_gray_idk),
                        text = " / Month")
                }

                Text(vacancy.howLongAgo)

            }
        }
    }
}