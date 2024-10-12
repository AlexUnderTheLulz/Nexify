package com.example.nexify.User_Interface.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Text
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
import com.example.nexify.Data.Internships
import com.example.nexify.R
import com.example.nexify.Data.Vacancy
import com.example.nexify.Data.internships
import com.example.nexify.Data.jobs


@Preview(showSystemUi = true)
@Composable
fun MainInternships(){
    Internships(internships, navController = rememberNavController())
}

@Composable

fun Internships(internships: List<Internships>, navController: NavController){

    Column (modifier = Modifier
        .fillMaxSize()
        .padding(8.dp)
        .background(color = Color.White),
        verticalArrangement = Arrangement.SpaceBetween) {

        Column(modifier = Modifier
            .weight(1f)){

            // Отступ сверху
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(25.dp)
            ){
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(6f)
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Center
            ) {

                Image(modifier = Modifier
                    .clip(shape = RoundedCornerShape(15.dp)),

                    painter = painterResource(
                        id = R.drawable.internship
                    ),
                    contentDescription = ""
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(8.dp)
            ) {

                Text(
                    fontSize = 20.sp,
                    text = "Стажировки"
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(2f)
                    .padding(8.dp)
            ) {

                Text(modifier = Modifier,
                    fontSize = 13.sp,
                    text = "Присоединяйтесь к сообществу, поскольку именно сейчас мы помогаем новому поколению получить бесценный опыт работы над реальными проектами."
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
                    .weight(1f)
                    .padding(8.dp)
            ) {

                Text(
                    fontSize = 20.sp,
                    text = "Рекомендации"
                )
            }
            LazyColumn (modifier = Modifier
                .weight(7f)
                .padding(start = 8.dp, end = 8.dp)){
                items(internships) { internship ->
                    InternshipsCard(internship = internship)
                    Spacer(modifier = Modifier
                        .height(8.dp))}
            }
        }

        // Нижняя панель навигации

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
            }
        }
    }
}

@Composable
fun InternshipsCard(internship: Internships){

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

                    Column(modifier = Modifier
                        .height(65.dp)
                        .width(10.dp)){

                    }

                    Column(modifier = Modifier
                        .height(65.dp)
                        .width(200.dp)
                    ){
                        Text(fontSize = 16.sp,
                            text = internship.title)


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
                    Text("\$${internship.salary}")
                    Text(color = colorResource(id = R.color.dart_gray_idk),
                        text = " / Month")
                }



            }
        }
    }
}