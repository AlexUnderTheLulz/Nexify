package com.example.nexify

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.nexify.Data.internships
import com.example.nexify.Data.jobs
import com.example.nexify.User_Interface.Screens.Events
import com.example.nexify.User_Interface.Screens.Internships
import com.example.nexify.User_Interface.Screens.Page
import com.example.nexify.User_Interface.Screens.Vacancy

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            val navController = rememberNavController()

            NavHost(
                navController = navController,
                startDestination = "MainPage"
            ){
                composable("MainPage"){
                    Page(navController)
                }

                composable("VacancyScreen"){
                    Vacancy(vacancies = jobs,navController)
                }

                composable("EventsScreen"){
                    Events(vacancies = jobs, navController)
                }

                composable("InternshipsScreen"){
                    Internships(internships = internships, navController)
                }
            }
        }
    }
}

