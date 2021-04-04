package com.devx.todolist.fragments.update

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.devx.todolist.`data`.models.ToDoData
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class UpdateFragmentArgs(
  public val currentItem: ToDoData
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(ToDoData::class.java)) {
      result.putParcelable("currentItem", this.currentItem as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(ToDoData::class.java)) {
      result.putSerializable("currentItem", this.currentItem as Serializable)
    } else {
      throw UnsupportedOperationException(ToDoData::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): UpdateFragmentArgs {
      bundle.setClassLoader(UpdateFragmentArgs::class.java.classLoader)
      val __currentItem : ToDoData?
      if (bundle.containsKey("currentItem")) {
        if (Parcelable::class.java.isAssignableFrom(ToDoData::class.java) ||
            Serializable::class.java.isAssignableFrom(ToDoData::class.java)) {
          __currentItem = bundle.get("currentItem") as ToDoData?
        } else {
          throw UnsupportedOperationException(ToDoData::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__currentItem == null) {
          throw IllegalArgumentException("Argument \"currentItem\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"currentItem\" is missing and does not have an android:defaultValue")
      }
      return UpdateFragmentArgs(__currentItem)
    }
  }
}
