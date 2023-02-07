package com.example.rv_f_test

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.commit
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class StartFragment : Fragment() {

    lateinit var varoradapter : VarorAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        varoradapter= VarorAdapter {
            requireActivity().supportFragmentManager.commit {
                add(R.id.fragmentContainerView,DetailFragment())
                addToBackStack(null)
            }

        }
        //view Färdigt

        val varorRecview = view.findViewById<RecyclerView>(R.id.varorRV)

        varorRecview.adapter = varoradapter
      varorRecview.layoutManager = LinearLayoutManager(requireContext())


    }

}