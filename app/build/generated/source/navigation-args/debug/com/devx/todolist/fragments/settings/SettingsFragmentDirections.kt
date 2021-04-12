package com.devx.todolist.fragments.settings

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.devx.todolist.R

public class SettingsFragmentDirections private constructor() {
  public companion object {
    public fun actionSettingsFragmentToListFragment2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_settingsFragment_to_listFragment2)
  }
}
