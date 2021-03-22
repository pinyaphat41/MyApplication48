package com.example.myapplication48

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val nm = 0
        val vr1 = ""
        zero.setOnClickListener {
            if (show.text.toString()== "0"){
                show.setText("0")
            }else{
                var nm0 = show.text.toString().plus(0)
                show.setText(nm0)
            }
        }
        one.setOnClickListener {
            if (show.text.toString()== "0"){
                show.setText("1")
            }else{
                var nm1 = show.text.toString().plus(1)
                show.setText(nm1)
            }
        }
        two.setOnClickListener {
            if (show.text.toString()== "0"){
                show.setText("2")
            }else{
                var nm2 = show.text.toString().plus(2)
                show.setText(nm2)
            }
        }
        three.setOnClickListener {
            if (show.text.toString()== "0"){
                show.setText("3")
            }else{
                var nm3 = show.text.toString().plus(3)
                show.setText(nm3)
            }
        }
        four.setOnClickListener {
            if (show.text.toString()== "0"){
                show.setText("4")
            }else{
                var nm4 = show.text.toString().plus(4)
                show.setText(nm4)
            }
        }
        five.setOnClickListener {
            if (show.text.toString()== "0"){
                show.setText("5")
            }else{
                var nm5 = show.text.toString().plus(5)
                show.setText(nm5)
            }
        }
        six.setOnClickListener {
            if (show.text.toString()== "0"){
                show.setText("6")
            }else{
                var nm6 = show.text.toString().plus(6)
                show.setText(nm6)
            }
        }
        seven.setOnClickListener {
            if (show.text.toString()== "0"){
                show.setText("7")
            }else{
                var nm7 = show.text.toString().plus(7)
                show.setText(nm7)
            }
        }
        eight.setOnClickListener {
            if (show.text.toString()== "0"){
                show.setText("8")
            }else{
                var nm8 = show.text.toString().plus(8)
                show.setText(nm8)
            }
        }
        nine.setOnClickListener {
            if (show.text.toString()== "0"){
                show.setText("9")
            }else{
                var nm9 = show.text.toString().plus(9)
                show.setText(nm9)
            }
        }
        clear.setOnClickListener {
                show.setText("0")
            }
        delete.setOnClickListener {
            if(vr1.length < 2){
                vr1 = "0"
                show.setText(vr1)
            }
            else if(vr1.isNotEmpty()) {
                vr1 = vr1.dropLast(1)
                show.text = vr1
            }


    }
}