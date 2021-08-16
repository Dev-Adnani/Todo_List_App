package com.devx.todolist.data.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\nH\'J\u0019\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\nH\'J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\nH\'J\u0019\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/devx/todolist/data/dao/ToDoDao;", "", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteItem", "toDoData", "Lcom/devx/todolist/data/models/ToDoData;", "(Lcom/devx/todolist/data/models/ToDoData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllData", "Landroidx/lifecycle/LiveData;", "", "insertData", "searchDatabase", "searchQuery", "", "sortByHighPriority", "sortByLowPriority", "updateData", "app_debug"})
public abstract interface ToDoDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM todo_table ORDER BY id ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.devx.todolist.data.models.ToDoData>> getAllData();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.lang.Object insertData(@org.jetbrains.annotations.NotNull()
    com.devx.todolist.data.models.ToDoData toDoData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object updateData(@org.jetbrains.annotations.NotNull()
    com.devx.todolist.data.models.ToDoData toDoData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteItem(@org.jetbrains.annotations.NotNull()
    com.devx.todolist.data.models.ToDoData toDoData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM todo_table")
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM todo_table WHERE title LIKE :searchQuery")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.devx.todolist.data.models.ToDoData>> searchDatabase(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM todo_table ORDER BY CASE WHEN priority LIKE \'H%\' THEN 1 WHEN priority LIKE \'M%\' THEN 2 WHEN priority LIKE \'L%\' THEN 3 END")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.devx.todolist.data.models.ToDoData>> sortByHighPriority();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM todo_table ORDER BY CASE WHEN priority LIKE \'L%\' THEN 1 WHEN priority LIKE \'M%\' THEN 2 WHEN priority LIKE \'H%\' THEN 3 END")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.devx.todolist.data.models.ToDoData>> sortByLowPriority();
}