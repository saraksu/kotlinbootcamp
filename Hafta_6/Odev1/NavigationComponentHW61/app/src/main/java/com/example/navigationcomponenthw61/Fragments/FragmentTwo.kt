package com.example.navigationcomponenthw61.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationcomponenthw61.R
import com.example.navigationcomponenthw61.databinding.FragmentTwoBinding

class FragmentTwo : Fragment() {

    private lateinit var tasarim: FragmentTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        tasarim = FragmentTwoBinding.inflate(inflater,container,false)

        return tasarim.root
    }

}