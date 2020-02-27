package com.example.viewbinding.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import com.example.viewbinding.R
import com.example.viewbinding.databinding.TestFragmentBinding

class TestFragment : Fragment() {

    private lateinit var binding: TestFragmentBinding
    private val testArray= arrayListOf<String>("Emam","Ahmed")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = TestFragmentBinding.inflate(layoutInflater)
        binding.listView.layoutManager = LinearLayoutManager(context)
//        binding.listView.adapter = ArrayAdapter(context!!,android.R.layout.simple_list_item_1,testArray)

        return inflater.inflate(binding.root.id, container, false)
    }
}