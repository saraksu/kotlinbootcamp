package com.example.navigationcomponenthw62.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponenthw62.R
import com.example.navigationcomponenthw62.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

    private lateinit var binding: FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(inflater,container,false)
        binding.btnBack2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.thirdBack)
        }
        return binding.root
    }

}