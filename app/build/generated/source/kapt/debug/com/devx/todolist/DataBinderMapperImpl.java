package com.devx.todolist;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.devx.todolist.databinding.FragmentListBindingImpl;
import com.devx.todolist.databinding.FragmentUpdateBindingImpl;
import com.devx.todolist.databinding.RowLayoutBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTLIST = 1;

  private static final int LAYOUT_FRAGMENTUPDATE = 2;

  private static final int LAYOUT_ROWLAYOUT = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.devx.todolist.R.layout.fragment_list, LAYOUT_FRAGMENTLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.devx.todolist.R.layout.fragment_update, LAYOUT_FRAGMENTUPDATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.devx.todolist.R.layout.row_layout, LAYOUT_ROWLAYOUT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTLIST: {
          if ("layout/fragment_list_0".equals(tag)) {
            return new FragmentListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTUPDATE: {
          if ("layout/fragment_update_0".equals(tag)) {
            return new FragmentUpdateBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_update is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWLAYOUT: {
          if ("layout/row_layout_0".equals(tag)) {
            return new RowLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_layout is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "args");
      sKeys.put(2, "mSharedViewModel");
      sKeys.put(3, "toDoData");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/fragment_list_0", com.devx.todolist.R.layout.fragment_list);
      sKeys.put("layout/fragment_update_0", com.devx.todolist.R.layout.fragment_update);
      sKeys.put("layout/row_layout_0", com.devx.todolist.R.layout.row_layout);
    }
  }
}
