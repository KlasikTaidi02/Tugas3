package com.example.tugas3

import android.os.Parcel
import android.os.Parcelable

data class Detail(val nama: String, val email: String, val jurusan: String, val semester: String, val url:String ) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!
    )


    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nama)
        parcel.writeString(email)
        parcel.writeString(jurusan)
        parcel.writeString(semester)
        parcel.writeString(url)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Detail> {
        override fun createFromParcel(parcel: Parcel): Detail {
            return Detail(parcel)
        }

        override fun newArray(size: Int): Array<Detail?> {
            return arrayOfNulls(size)
        }
    }
}


