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
 * 第三页
 */
class ThirdFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_third, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        view.findViewById<Button>(R.id.firstButton).apply {
//            setOnClickListener {
//                it.findNavController().navigate(R.id.action_thirdFragment_to_firstFragment)
//            }
//        }


        view.findViewById<Button>(R.id.firstButton).setOnClickListener {
            this.findNavController().navigate(R.id.action_thirdFragment_to_firstFragment)
        }
    }
}