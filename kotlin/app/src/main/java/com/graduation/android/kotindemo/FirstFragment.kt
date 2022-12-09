package com.graduation.android.kotindemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController

/**
 * 第一页fragment
 */
class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        view.findViewById<Button>(R.id.firstButton).apply {
//            setOnClickListener {
//                it.findNavController().navigate(R.id.action_firstFragment_to_secondFragment2)
//            }
//        }

        view.findViewById<Button>(R.id.firstButton).setOnClickListener {
            this.findNavController().navigate(R.id.action_firstFragment_to_secondFragment2)
        }
    }
}