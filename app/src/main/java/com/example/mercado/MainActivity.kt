package com.example.mercado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.mercado.enumerated.MainEnum
import com.example.mercado.fragment.MenuFragment

class MainActivity : AppCompatActivity() {

    //region String
    private val TAG = "MainActivity"
    //endregion

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()

        if(savedInstanceState == null)
            supportFragmentManager.beginTransaction().add(R.id.frame_container, MenuFragment(), "menu").commit()

    }

    private fun changeFragment(enum: MainEnum){
        try{
            when(enum){
                MainEnum.MENU -> {
                    supportFragmentManager.beginTransaction().replace(R.id.frame_container, MenuFragment(), "menu").commit()
                }
            }
        }catch (ex: Exception){
            Log.e(TAG, "Erro na função changeFragment: "+ex.message, ex)
        }
    }

}