package com.devx.todolist.fragments.update

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.devx.todolist.R

public class UpdateFragmentDirections private constructor() {
  public companion object {
    public fun actionUpdateFragmentToListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_updateFragment_to_listFragment)
  }
}
