package com.example.nexify

import android.hardware.biometrics.BiometricManager.Strings

data class Vacancy (
    val id: Int,
    val title: String,

    val bpoint1: String,
    val bpoint2: String,
    val bpoint3: String,

    val salary: Int,
    val howLongAgo: String
)

val Google = Vacancy(
    1,
    "Android Developer",

    "Senior",
    "Fulltime",
    "Remote",

    5000,
    "12 Минут назад"
)

val Yandex = Vacancy(
    2,
    "Project Manager",

    "Middle",
    "Fulltime",
    "Remote",

    5000,
    "12 минут назад"
)

val VK = Vacancy(
    3,
    "Backend Developer",

    "Junior",
    "Fulltime",
    "Remote",

    4000,
    "12 минут назад"
)

val MTS = Vacancy(
    4,
    "Kotlin Developer",

    "Middle",
    "Fulltime",
    "Remote",

    4500,
    "30 минут назад"
)

val jobs = listOf(Google, Yandex, VK, MTS)