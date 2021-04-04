package com.devx.todolist.data.converters

import androidx.room.TypeConverter
import com.devx.todolist.data.models.Priority

class Converter {

    @TypeConverter
    fun fromPriority(priority: Priority) : String
    {
        return priority.name
    }
    @TypeConverter
    fun toPriority(priority: String): Priority
    {
        return  Priority.valueOf(priority)
    }
}