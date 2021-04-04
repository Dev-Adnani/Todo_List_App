package com.devx.todolist.databinding;
import com.devx.todolist.R;
import com.devx.todolist.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowLayoutBindingImpl extends RowLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private RowLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[4]
            , (androidx.cardview.widget.CardView) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (android.widget.TextView) bindings[3]
            );
        this.descriptionTxt.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.prioritiesIndicator.setTag(null);
        this.rowBg.setTag(null);
        this.titleTxt.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.toDoData == variableId) {
            setToDoData((com.devx.todolist.data.models.ToDoData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setToDoData(@Nullable com.devx.todolist.data.models.ToDoData ToDoData) {
        this.mToDoData = ToDoData;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.toDoData);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String toDoDataTitle = null;
        com.devx.todolist.data.models.Priority toDoDataPriority = null;
        java.lang.String toDoDataDescription = null;
        com.devx.todolist.data.models.ToDoData toDoData = mToDoData;

        if ((dirtyFlags & 0x3L) != 0) {



                if (toDoData != null) {
                    // read toDoData.title
                    toDoDataTitle = toDoData.getTitle();
                    // read toDoData.priority
                    toDoDataPriority = toDoData.getPriority();
                    // read toDoData.description
                    toDoDataDescription = toDoData.getDescription();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.descriptionTxt, toDoDataDescription);
            com.devx.todolist.fragments.bindingadapter.BindingAdapters.parsePriorityColor(this.prioritiesIndicator, toDoDataPriority);
            com.devx.todolist.fragments.bindingadapter.BindingAdapters.sendDataToUpdateFragment(this.rowBg, toDoData);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleTxt, toDoDataTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): toDoData
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}