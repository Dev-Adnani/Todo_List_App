package com.devx.todolist.fragments.add

import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.devx.todolist.R
import com.devx.todolist.data.models.ToDoData
import com.devx.todolist.data.viewmodel.SharedViewModel
import com.devx.todolist.data.viewmodel.ToDoViewModel
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.fragment_add.*
import kotlinx.android.synthetic.main.fragment_add.view.*


class AddFragment : Fragment() {

    private val mTodoViewModel: ToDoViewModel by viewModels()
    private val mSharedViewModel: SharedViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_add, container, false)


        //Menu
        setHasOptionsMenu(true)
        view.priorities_spinner.onItemSelectedListener = mSharedViewModel.listener

        return view

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity?.onBackPressedDispatcher?.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                Toasty.warning(requireContext(), "Please Save Your Data", Toast.LENGTH_SHORT, true)
                    .show()

            }
        })
    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.add_frag_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {


        when (item.itemId) {
            R.id.menu_add -> insertDataToDb()
            R.id.menu_copy_addFrag -> copyToClipBoard()
        }

        return super.onOptionsItemSelected(item)
    }

    private fun copyToClipBoard() {
        val mTitle = title_et.text.toString()
        val mPriority = priorities_spinner.selectedItem.toString()
        val mDescription = description_et.text.toString()

        val validation = mSharedViewModel.verifyDataFromUser(mTitle, mDescription)
        if (validation) {
            val sendIntent = Intent()
            sendIntent.action = Intent.ACTION_SEND
            sendIntent.putExtra(
                Intent.EXTRA_TEXT,
                "Title : $mTitle \nPriority : $mPriority \nDescription : $mDescription"
            )
            sendIntent.type = "text/plain"
            startActivity(sendIntent)
            Toasty.success(
                requireContext(),
                "Successfully Copied To Clipboard!!!",
                Toast.LENGTH_SHORT,
                true
            ).show()
        } else {
            Toasty.error(
                requireContext(),
                "Please Fill All The Fields Before Copying Data",
                Toast.LENGTH_SHORT,
                true
            ).show()
        }
    }

    private fun insertDataToDb() {
        val mTitle = title_et.text.toString()
        val mPriority = priorities_spinner.selectedItem.toString()
        val mDescription = description_et.text.toString()

        val validation = mSharedViewModel.verifyDataFromUser(mTitle, mDescription)
        if (validation) {
            val newData = ToDoData(
                0,
                mTitle,
                mSharedViewModel.parsePriority(mPriority),
                mDescription
            )
            mTodoViewModel.insertData(newData)
            Toasty.success(
                requireContext(),
                "Successfully Added ${newData.title}!",
                Toast.LENGTH_SHORT,
                true
            ).show()
            findNavController().navigate(R.id.action_addFragment_to_listFragment)

        } else {
            Toasty.error(requireContext(), "Please Fill All The Fields", Toast.LENGTH_SHORT, true)
                .show()

        }


    }

}