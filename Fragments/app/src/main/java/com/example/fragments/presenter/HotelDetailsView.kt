package com.example.fragments.presenter

import com.example.fragments.data.Hotel

interface HotelDetailsView {
    fun showHotelDetails(hotel: Hotel)
    fun errorHotelNotFound()
}