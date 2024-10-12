package com.example.nexify.Data

data class Vacancy (

    val title: String,

    val bpoint1: String,
    val bpoint2: String,
    val bpoint3: String,

    val salary: Int,
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


fun getFakeVacancies(): List<Vacancy>{
    return listOf<Vacancy>(
        Vacancy("Android Developer", "Senior", "Fulltime", "Remote", 5000), // Google
        Vacancy("Project Manager", "Middle", "Fulltime", "Remote", 5000), //Yandex
        Vacancy("Backend Developer", "Junior", "Fulltime", "Remote", 4000), //VK
        Vacancy("Kotlin Developer", "Middle", "Fulltime", "Remote", 4500) //MTS
    )
}

fun getFakeEventsParties(): List<EventsParties> {
    return listOf<EventsParties>(
        EventsParties("DevSecOps Meetup","21 августа 19:00","Москва", "DevOps", "offline"),
        EventsParties("Jvm Day", "31 августа 10:00", "Москва", "Java, Backend", "offline")
    )
}

fun getFakeInternships(): List<Internships>{
    return listOf<Internships>(
        Internships ("YandexInernships",200,"2"),
        Internships ("VkInernships", 150, "2")
    )
}


val jobs = getFakeVacancies()
val events = getFakeEventsParties()
val internships = getFakeInternships()