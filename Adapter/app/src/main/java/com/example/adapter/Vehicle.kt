package com.example.adapter

import java.util.*

data class Vehicle(
    var model: String,
    var year: Int,
    var manufacturer: Int, //o = VW; 1 = GM; 2 = Fiat; 3 = Ford
    var gasoline: Boolean,
    var ethanol: Boolean
)
