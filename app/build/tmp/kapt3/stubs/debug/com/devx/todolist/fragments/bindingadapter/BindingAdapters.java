package com.devx.todolist.fragments.bindingadapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/devx/todolist/fragments/bindingadapter/BindingAdapters;", "", "()V", "Companion", "app_debug"})
public final class BindingAdapters {
    @org.jetbrains.annotations.NotNull()
    public static final com.devx.todolist.fragments.bindingadapter.BindingAdapters.Companion Companion = null;
    
    public BindingAdapters() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"android:navigateToAddFragment"})
    public static final void navigateToAddFragment(@org.jetbrains.annotations.NotNull()
    com.google.android.material.floatingactionbutton.FloatingActionButton view, boolean navigate) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"android:emptyDatabase"})
    public static final void emptyDB(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> emptyDB) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"android:parsePriorityToInt"})
    public static final void parsePriorityToInt(@org.jetbrains.annotations.NotNull()
    android.widget.Spinner view, @org.jetbrains.annotations.NotNull()
    com.devx.todolist.data.models.Priority priority) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"android:parsePriorityColor"})
    public static final void parsePriorityColor(@org.jetbrains.annotations.NotNull()
    androidx.cardview.widget.CardView cardView, @org.jetbrains.annotations.NotNull()
    com.devx.todolist.data.models.Priority priority) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"android:sendDataToUpdateFragment"})
    public static final void sendDataToUpdateFragment(@org.jetbrains.annotations.NotNull()
    androidx.constraintlayout.widget.ConstraintLayout view, @org.jetbrains.annotations.NotNull()
    com.devx.todolist.data.models.ToDoData currentItem) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007\u00a8\u0006\u0017"}, d2 = {"Lcom/devx/todolist/fragments/bindingadapter/BindingAdapters$Companion;", "", "()V", "emptyDB", "", "view", "Landroid/view/View;", "Landroidx/lifecycle/MutableLiveData;", "", "navigateToAddFragment", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "navigate", "parsePriorityColor", "cardView", "Landroidx/cardview/widget/CardView;", "priority", "Lcom/devx/todolist/data/models/Priority;", "parsePriorityToInt", "Landroid/widget/Spinner;", "sendDataToUpdateFragment", "Landroidx/constraintlayout/widget/ConstraintLayout;", "currentItem", "Lcom/devx/todolist/data/models/ToDoData;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        @androidx.databinding.BindingAdapter(value = {"android:navigateToAddFragment"})
        public final void navigateToAddFragment(@org.jetbrains.annotations.NotNull()
        com.google.android.material.floatingactionbutton.FloatingActionButton view, boolean navigate) {
        }
        
        @kotlin.jvm.JvmStatic()
        @androidx.databinding.BindingAdapter(value = {"android:emptyDatabase"})
        public final void emptyDB(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> emptyDB) {
        }
        
        @kotlin.jvm.JvmStatic()
        @androidx.databinding.BindingAdapter(value = {"android:parsePriorityToInt"})
        public final void parsePriorityToInt(@org.jetbrains.annotations.NotNull()
        android.widget.Spinner view, @org.jetbrains.annotations.NotNull()
        com.devx.todolist.data.models.Priority priority) {
        }
        
        @kotlin.jvm.JvmStatic()
        @androidx.databinding.BindingAdapter(value = {"android:parsePriorityColor"})
        public final void parsePriorityColor(@org.jetbrains.annotations.NotNull()
        androidx.cardview.widget.CardView cardView, @org.jetbrains.annotations.NotNull()
        com.devx.todolist.data.models.Priority priority) {
        }
        
        @kotlin.jvm.JvmStatic()
        @androidx.databinding.BindingAdapter(value = {"android:sendDataToUpdateFragment"})
        public final void sendDataToUpdateFragment(@org.jetbrains.annotations.NotNull()
        androidx.constraintlayout.widget.ConstraintLayout view, @org.jetbrains.annotations.NotNull()
        com.devx.todolist.data.models.ToDoData currentItem) {
        }
    }
}