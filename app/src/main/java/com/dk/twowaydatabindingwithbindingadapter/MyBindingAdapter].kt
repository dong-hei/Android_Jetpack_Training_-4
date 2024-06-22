package com.dk.twowaydatabindingwithbindingadapter

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("myAge")
fun myAgeSetting(view : TextView, age : Int){
    if(age > 46){
        view.text = age.toString() + " : 해당 나이는 중위연령 초과입니다."
    } else {
        view.text = age.toString()
    }
}

@BindingAdapter("myImg")
fun myImgSetting(view : ImageView, age : Int){
    if(age > 46){
       view.setImageResource(R.drawable.ageover)
    } else {
        view.setImageResource(R.drawable.isnotover)
    }
}