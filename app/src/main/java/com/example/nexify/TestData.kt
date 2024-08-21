package com.example.nexify

data class Vacancy (

    val title: String,

    val bpoint1: String,
    val bpoint2: String,
    val bpoint3: String,

    val salary: Int,
    val howLongAgo: String
)

data class EventsParties (

    val title: String,

    val datetime: String,
    val location: String,
    val tag: String,
    val format: String
)

data class Internships (

    val title: String,

    val salary: Int,
    val howLongAgo: String
)

// тестовые данные о вакансиях

val Google = Vacancy(
    "Android Developer",

    "Senior",
    "Fulltime",
    "Remote",

    5000,
    "12 Минут назад"
)

val Yandex = Vacancy(
    "Project Manager",

    "Middle",
    "Fulltime",
    "Remote",

    5000,
    "12 минут назад"
)

val VK = Vacancy(
    "Backend Developer",

    "Junior",
    "Fulltime",
    "Remote",

    4000,
    "12 минут назад"
)

val MTS = Vacancy(
    "Kotlin Developer",

    "Middle",
    "Fulltime",
    "Remote",

    4500,
    "30 минут назад"
)

// тестовые данные о мероприятиях

val DevSecOpsMeetup = EventsParties (
    "DevSecOps Meetup",

    "21 августа 19:00",
    "Москва",
    "DevOps",
    "offline"
)

// тестовые данные о стажировках

val jobs = listOf(Google, Yandex, VK, MTS)

val events = listOf(DevSecOpsMeetup)

val internships = listOf("")