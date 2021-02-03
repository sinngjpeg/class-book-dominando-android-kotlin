package com.example.fragments.data

import com.example.fragments.data.Hotel

interface HotelListView {
    fun showHotels(hotels: List<Hotel>)
    fun showHotelsDetails(hotel: Hotel)
}