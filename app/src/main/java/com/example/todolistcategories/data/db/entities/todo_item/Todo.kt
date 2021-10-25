package com.example.todolistcategories.data.db.entities.todo_item

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "todos")
data class Todo (
    @PrimaryKey(autoGenerate = true) val id: Int? = null,
    @ColumnInfo(name = "todo_task") val todoTask: String
 )