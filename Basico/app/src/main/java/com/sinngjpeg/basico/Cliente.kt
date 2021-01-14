package com.sinngjpeg.basico

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Cliente(var codigo: Int, var nome: String) : Parcelable
