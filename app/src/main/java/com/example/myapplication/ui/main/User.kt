package com.example.myapplication.ui.main

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class User(
        @PrimaryKey
        val id:Int,
        val name:String,
        @Embedded
        val address:Address,
        val contactNumber:Int
)

@Entity(tableName = "address")
data class Address(
        @PrimaryKey
        val addressid:String,
        val streetName1:String,
        val streetName2:String,
        val streetName3:String,
        val city:String,
        val state:String,
        val pincode:String

)