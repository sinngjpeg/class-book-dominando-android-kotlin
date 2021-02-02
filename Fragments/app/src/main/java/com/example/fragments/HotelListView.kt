package com.example.fragments

import com.example.fragments.data.Hotel

interface HotelListView {
    fun showHotels(hotels: List<Hotel>)
    fun showHotelsDetails(hotel: Hotel)
}