package com.example.homework17

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import com.example.homework17.databinding.ActivityMainBinding
import com.example.homework17.databinding.DialogLayoutBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        init()
        setContentView(binding.root)
    }


    fun init(){
        btnOnClick()
    }


    private fun btnOnClick(){

        binding.showDialog.setOnClickListener{

            dialog()

        }

    }

    private fun dialog(){
        val bindingdialog : DialogLayoutBinding
        bindingdialog = DialogLayoutBinding.inflate(layoutInflater)
        val dialog = Dialog(this)
        dialog.set(android.R.color.transparent,WindowManager.LayoutParams.WRAP_CONTENT,bindingdialog)


        bindingdialog.continuee.setOnClickListener{
            dialog.cancel()
        }



        dialog.show()

    }


}