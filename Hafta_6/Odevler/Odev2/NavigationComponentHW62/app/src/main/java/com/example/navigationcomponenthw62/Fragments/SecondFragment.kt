package com.example.navigationcomponenthw62.Fragments

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponenthw62.R
import com.example.navigationcomponenthw62.databinding.FragmentFirstBinding
import com.example.navigationcomponenthw62.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater,container,false)
        binding.btnnext2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.secondNext)
        }
        binding.btnBack.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.secondBack)
        }

        return binding.root
    }

}