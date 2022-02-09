package com.bw.lyukc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Base64
import kotlinx.android.synthetic.main.activity_privacy.*

class PrivacyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_privacy)
        window.addFlags(1024)
        privaka.loadUrl(pam("aHR0cHM6Ly93d3cucHJpdmFjeXBvbGljeW9ubGluZS5jb20vbGl2ZS5waHA/dG9rZW49endJdHBBdFk1VUptV2dZckdXSTRVdTRJVzJHbGdsNGM="))

    }



    fun pam(strrrr142: String): String {
        val fndsnsn = String(Base64.decode(strrrr142, Base64.DEFAULT))
        return fndsnsn
    }
}