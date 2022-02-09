package com.bw.lyukc.Game

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bw.lyukc.PrivacyActivity
import com.bw.lyukc.R
import kotlinx.android.synthetic.main.start_game_activ.*
import kotlinx.android.synthetic.main.start_game_activ.btn_red as btn_red1

class StartGameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_game_activ)
        window.addFlags(1024)
        btn_black.setOnClickListener {
            val krea = Intent(this,PrivacyActivity::class.java)
            startActivity(krea)
        }
        btn_red1.setOnClickListener {
            OpenGame()
        }
        btn_green.setOnClickListener {
            finishAffinity()
        }
    }
    private fun OpenGame() {
        val intent = Intent(this, GameActivity::class.java)
        startActivity(intent)
    }
}

