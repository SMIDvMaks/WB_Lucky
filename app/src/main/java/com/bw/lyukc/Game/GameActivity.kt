package com.bw.lyukc.Game

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.ViewCompat.animate
import com.bw.lyukc.R
import kotlinx.android.synthetic.main.activity_game.*



class GameActivity : AppCompatActivity() {

    var stop = 0
    var handler = Handler()
    var res1 = 0
    var res2 = 0
    var res3 = 0
    var res4 = 0
    var res5 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        window.addFlags(1024)

        btn_start.setOnClickListener {


            handler.post(object : Runnable {

                override fun run() {
                    stop++
                    if (stop != 60) {
                        handler.postDelayed(this::run, 30)
                        for (i in 1..5) {
                            var rand = (1..5).random()
                             res1 = resources.getIdentifier(
                                "ic_slot_$rand",
                                "drawable", "com.bw.lyukc"
                            )
                            g1.setImageResource(res1)
                        }

                    } else stop = 0 }
            })



            handler.post(object : Runnable {
                override fun run() {
                    stop++
                    if (stop != 60) {
                        handler.postDelayed(this::run, 30)
                        for (i in 1..5) {
                            var rand = (1..5).random()
                             res2 = resources.getIdentifier(
                                "ic_slot_$rand",
                                "drawable", "com.bw.lyukc"
                            )
                            g2.setImageResource(res2)
                        }

                    } else stop = 0 }

            })




            handler.post(object : Runnable {
                override fun run() {
                    stop++
                    if (stop != 60) {
                        handler.postDelayed(this::run, 30)
                        for (i in 1..5) {
                            var rand = (1..5).random()
                             res3 = resources.getIdentifier(
                                "ic_slot_$rand",
                                "drawable", "com.bw.lyukc"
                            )
                            g3.setImageResource(res3)
                        }

                    } else stop = 0 }

            })



            handler.post(object : Runnable {
                override fun run() {
                    stop++
                    if (stop != 60) {
                        handler.postDelayed(this::run, 30)
                        for (i in 1..5) {
                            var rand = (1..5).random()
                             res4 = resources.getIdentifier(
                                "ic_slot_$rand",
                                "drawable", "com.bw.lyukc"
                            )
                            g4.setImageResource(res4)
                        }

                    } else stop = 0 }

            })


            handler.post(object : Runnable {
                override fun run() {
                    stop++
                    if (stop != 60) {
                        handler.postDelayed(this::run, 30)
                        for (i in 1..5) {
                            var rand = (1..5).random()
                             res5 = resources.getIdentifier(
                                "ic_slot_$rand",
                                "drawable", "com.bw.lyukc"
                            )
                            g5.setImageResource(res5)
                        }

                    } else stop = 0 }


            })



            Handler(Looper.getMainLooper()).postDelayed({
            if (res1 == res2 && res1==res3&&res1==res4&&res1==res5){
               var idWIN:ImageView =  findViewById(R.id.idWIN)
                idWIN.visibility = ImageView.VISIBLE.times(2000)
                idWIN.animate().alpha(1f).duration = 5000
                Toast.makeText(this,"YOU WIN",Toast.LENGTH_SHORT).show()
                Handler(Looper.getMainLooper()).postDelayed({
                    idWIN.visibility = ImageView.INVISIBLE
                }, 3000)

            }else{
                rylet.visibility =TextView.VISIBLE
                rylet.animate().alpha(1f).duration = 1000
                Toast.makeText(this,"YOU LOST",Toast.LENGTH_SHORT).show()
                Handler(Looper.getMainLooper()).postDelayed({
                    rylet.visibility = TextView.INVISIBLE
                }, 3000)
            }
            },4500)


        }






    }




}