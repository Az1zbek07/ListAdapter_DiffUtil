package com.example.listadapterdiffutil

import java.io.Serializable

data class SportsData(
    val name: String,
    val time: String,
    val image: Int,
    val info: String
): Serializable
