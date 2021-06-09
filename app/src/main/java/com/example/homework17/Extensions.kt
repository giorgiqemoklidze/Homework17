package com.example.homework17

import android.app.Dialog
import android.content.res.Resources
import android.view.Window
import android.view.WindowManager
import androidx.viewbinding.ViewBinding

fun Dialog.set(color : Int , height :Int,binding : ViewBinding){
    window!!.requestFeature(Window.FEATURE_NO_TITLE)
    window!!.setBackgroundDrawableResource(android.R.color.transparent)
    val atributes = window!!.attributes
    atributes.width = WindowManager.LayoutParams.MATCH_PARENT
    atributes.height = height
    setContentView(binding.root)
}