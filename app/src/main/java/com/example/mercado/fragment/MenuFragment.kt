package com.example.mercado.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mercado.adapter.MenuAdapter
import com.example.mercado.databinding.FragmentMenuBinding
import com.example.mercado.model.menu.MenuModel

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

        showMenu()
    }

    private fun showMenu(){
        try{
            val adapter = MenuAdapter(MenuModel().getListMenu())
            binding.rvMenu.adapter = adapter
            binding.rvMenu.layoutManager = GridLayoutManager(requireContext(), 2)
        }catch (ex: Exception){
            Log.e(TAG, "Erro na função showMenu: "+ex.message, ex)
        }
    }

}