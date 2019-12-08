package com.example.myapplication.database.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.myapplication.ui.main.Address
import com.example.myapplication.ui.main.User
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.withContext

@Database(entities = [User::class, Address::class], version = 1,exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}