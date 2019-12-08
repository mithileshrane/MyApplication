package com.example.myapplication.database.dao

import androidx.room.*
import com.example.myapplication.ui.main.User

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(user: User)

    @Delete
    fun delete(user:User)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun update(user:User)

    @Query("SELECT * FROM user")
    fun getAll():List<User>
}