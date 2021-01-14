package com.sinngjpeg.basico

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import org.parceler.ParcelConstructor


@Parcelize
data class Cliente(var codigo: Int, var nome: String) : Parcelable
