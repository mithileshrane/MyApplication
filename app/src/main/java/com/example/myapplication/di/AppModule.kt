package com.example.myapplication.di

import android.content.Context
import androidx.room.Room
import com.example.myapplication.App
import com.example.myapplication.database.dao.AppDatabase
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
    @Provides
    fun provideContext(application: App): Context {
        return application.applicationContext
    }

    @Provides
    fun provideGson(): Gson {
        return Gson()
    }

    @Singleton
    @Provides
    fun appDatabase(context: Context): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, "UserDatabase.db")
                .build()
    }
}