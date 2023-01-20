package com.example.mercado.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mercado.R
import com.example.mercado.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {

    //region String
    private val TAG = "MenuFragment"
    //endregion

    //region Binding
    private lateinit var binding: FragmentMenuBinding
    //endregion

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMenuBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

}