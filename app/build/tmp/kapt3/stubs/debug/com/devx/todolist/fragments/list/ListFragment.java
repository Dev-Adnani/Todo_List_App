package com.devx.todolist.fragments.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u001e\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010\'\u001a\u00020\u001aH\u0016J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\u0012\u0010,\u001a\u00020)2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0012\u0010/\u001a\u00020)2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0018\u00100\u001a\u00020\u001a2\u0006\u00101\u001a\u00020!2\u0006\u00102\u001a\u000203H\u0002J\u0010\u00104\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020.H\u0002J\b\u00105\u001a\u00020\u001aH\u0002J\u0010\u00106\u001a\u00020\u001a2\u0006\u00107\u001a\u000208H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0016\u0010\u0017\u00a8\u00069"}, d2 = {"Lcom/devx/todolist/fragments/list/ListFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "()V", "_binding", "Lcom/devx/todolist/databinding/FragmentListBinding;", "adapter", "Lcom/devx/todolist/fragments/list/adapter/ListAdapter;", "getAdapter", "()Lcom/devx/todolist/fragments/list/adapter/ListAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "binding", "getBinding", "()Lcom/devx/todolist/databinding/FragmentListBinding;", "mSharedViewModel", "Lcom/devx/todolist/data/viewmodel/SharedViewModel;", "getMSharedViewModel", "()Lcom/devx/todolist/data/viewmodel/SharedViewModel;", "mSharedViewModel$delegate", "mTodoViewModel", "Lcom/devx/todolist/data/viewmodel/ToDoViewModel;", "getMTodoViewModel", "()Lcom/devx/todolist/data/viewmodel/ToDoViewModel;", "mTodoViewModel$delegate", "confirmRemoval", "", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onQueryTextChange", "query", "", "onQueryTextSubmit", "restoreDeleteData", "view", "deletedItem", "Lcom/devx/todolist/data/models/ToDoData;", "searchThroughDB", "setUpRecyclerView", "swipeToDelete", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "app_debug"})
public final class ListFragment extends androidx.fragment.app.Fragment implements androidx.appcompat.widget.SearchView.OnQueryTextListener {
    private final kotlin.Lazy adapter$delegate = null;
    private final kotlin.Lazy mTodoViewModel$delegate = null;
    private final kotlin.Lazy mSharedViewModel$delegate = null;
    private com.devx.todolist.databinding.FragmentListBinding _binding;
    private java.util.HashMap _$_findViewCache;
    
    public ListFragment() {
        super();
    }
    
    private final com.devx.todolist.fragments.list.adapter.ListAdapter getAdapter() {
        return null;
    }
    
    private final com.devx.todolist.data.viewmodel.ToDoViewModel getMTodoViewModel() {
        return null;
    }
    
    private final com.devx.todolist.data.viewmodel.SharedViewModel getMSharedViewModel() {
        return null;
    }
    
    private final com.devx.todolist.databinding.FragmentListBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setUpRecyclerView() {
    }
    
    private final void swipeToDelete(androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    private final void restoreDeleteData(android.view.View view, com.devx.todolist.data.models.ToDoData deletedItem) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void confirmRemoval() {
    }
    
    @java.lang.Override()
    public boolean onQueryTextSubmit(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onQueryTextChange(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
        return false;
    }
    
    private final void searchThroughDB(java.lang.String query) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}