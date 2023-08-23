package com.example.navigationcomponenthw61.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.findFragment
import androidx.navigation.Navigation
import com.example.navigationcomponenthw61.R
import com.example.navigationcomponenthw61.databinding.FragmentOneBinding
import com.google.android.material.button.MaterialButton

class FragmentOne : Fragment() {
    private lateinit var tasarim: FragmentOneBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        tasarim = FragmentOneBinding.inflate(inflater, container, false)

        tasarim.btnclickid.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.gecis)

        }
        return tasarim.root
    }

}