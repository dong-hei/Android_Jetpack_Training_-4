package com.dk.twowaydatabindingwithbindingadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.dk.twowaydatabindingwithbindingadapter.databinding.ActivityMainBinding

/**
 * 양방향 데이터 결합(Two - Way Binding)
 * BindingAdapter -> View의 속성을 내 맘대로 수정한다.
 *
 * 1. 기존 양방향 데이터 결합 (BindingAdapter 사용전)
 * 2. 양방향 데이터 결합 (BindingAdapter 사용해)
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var vm : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        vm = ViewModelProvider(this)[MainViewModel::class.java]

        binding.vm = vm
        binding.lifecycleOwner = this

//        setContentView(R.layout.activity_main)
        //1. 기존의 양방향 데이터 결합
//        var age = 0
//
//        val ageArea = findViewById<TextView>(R.id.ageArea)
//        val imgArea = findViewById<ImageView>(R.id.imgView)
//        val plus = findViewById<Button>(R.id.plus)
//
//        plus.setOnClickListener {
//            age++
//            ageArea.text = age.toString()
//
//            if(age > 46){
//                imgArea.setImageResource(R.drawable.ageover)
//            }
//        }
//
////        2.
    }
}