package com.devx.todolist.fragments.update

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.devx.todolist.R
import com.devx.todolist.data.models.ToDoData
import com.devx.todolist.data.viewmodel.SharedViewModel
import com.devx.todolist.data.viewmodel.ToDoViewModel
import com.devx.todolist.databinding.FragmentUpdateBinding
import com.devx.todolist.utils.hideKeyboard
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.fragment_update.*


class UpdateFragment : Fragment() {

    private val args by navArgs<UpdateFragmentArgs>()
    private val mSharedViewModel: SharedViewModel by viewModels()
    private val mToDoViewModel: ToDoViewModel by viewModels()

    private var _binding: FragmentUpdateBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentUpdateBinding.inflate(inflater, container, false)
        binding.args = args


        binding.currentPrioritiesSpinner.onItemSelectedListener = mSharedViewModel.listener


        setHasOptionsMenu(true)
        hideKeyboard(requireActivity())


        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity?.onBackPressedDispatcher?.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                updateItem()

            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.update_frag_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_save -> updateItem()
            R.id.menu_delete -> confirmItemRemoval()
            R.id.menu_copy_updatefrag -> copyToClipBoard()
        }

        return super.onOptionsItemSelected(item)
    }

    private fun copyToClipBoard() {
        val title = current_title_et.text.toString()
        val description = current_description_et.text.toString()
        val getPriority = current_priorities_spinner.selectedItem.toString()

        val validation = mSharedViewModel.verifyDataFromUser(title, description)
        if (validation) {
            val sendIntent = Intent()
            sendIntent.action = Intent.ACTION_SEND
            sendIntent.putExtra(
                Intent.EXTRA_TEXT,
                "Title : $title \nPriority : $getPriority \nDescription : $description"
            )
            sendIntent.type = "text/plain"
            startActivity(sendIntent)
        } else {
            Toasty.error(
                requireContext(),
                "Please Fill All The Fields Before Copying Data",
                Toast.LENGTH_SHORT,
                true
            ).show()

        }
    }


    private fun updateItem() {
        val title = current_title_et.text.toString()
        val description = current_description_et.text.toString()
        val getPriority = current_priorities_spinner.selectedItem.toString()

        val validation = mSharedViewModel.verifyDataFromUser(title, description)
        if (validation) {
            val updatedItem = ToDoData(
                args.currentItem.id,
                title,
                mSharedViewModel.parsePriority(getPriority),
                description
            )
            mToDoViewModel.updateData(updatedItem)
            Toasty.success(
                requireContext(),
                "Successfully Updated '$title' !!",
                Toast.LENGTH_SHORT,
                true
            )
                .show()

            findNavController().navigate(R.id.action_updateFragment_to_listFragment)
        } else {
            Toasty.error(requireContext(), "Please Fill All The Fields", Toast.LENGTH_SHORT, true)
                .show()
        }
    }

    private fun confirmItemRemoval() {
        val builder = AlertDialog.Builder(requireContext())
        builder.setPositiveButton("Yes") { _, _ ->
            mToDoViewModel.deleteItem(args.currentItem)
            Toasty.success(
                requireContext(),
                "Successfully Removed: ${args.currentItem.title}",
                Toast.LENGTH_SHORT,
                true
            ).show()

            findNavController().navigate(R.id.action_updateFragment_to_listFragment)
        }
        builder.setNegativeButton("No") { _, _ -> }
        builder.setTitle("Delete '${args.currentItem.title}'?")
        builder.setMessage("Are you sure you want to remove '${args.currentItem.title}'?")
        builder.create().show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}