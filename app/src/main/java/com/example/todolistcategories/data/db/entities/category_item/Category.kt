package com.example.todolistcategories.data.db.entities.category_item

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "categories")
data class Category (
    @PrimaryKey(autoGenerate = true) val id: Int? = null,
    @ColumnInfo(name = "category_name") val categoryName: String
 )