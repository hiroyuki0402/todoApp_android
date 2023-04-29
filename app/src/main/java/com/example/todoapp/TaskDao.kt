package com.example.todoapp

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface TaskDao {
    @Insert
    fun insert(task: Task)

    @Query("SELECT * FROM Task")
    fun load(task: List<Task>)

    @Update
    fun update(task: Task)

    @Delete
    fun delete(task: Task)
}