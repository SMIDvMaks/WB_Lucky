package com.bw.lyukc

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.annotation.StringRes

class Progress constructor(coqa: Context?, @StringRes private val tiajq: Int, bolaq: Boolean = false)
{   var vyqjss: View? = null
    var biand: AlertDialog.Builder
    var lfekaq: Dialog
    init {
        vyqjss = LayoutInflater.from(coqa).inflate(R.layout.progress, null)
        vyqjss?.findViewById<TextView>(R.id.text)?.setText(tiajq)
        biand = AlertDialog.Builder(coqa)
        biand.setView(vyqjss)
        lfekaq = biand.create()
        lfekaq.setCancelable(bolaq)
    }
    fun ckolel() {
       lfekaq.show()
    }
    fun sakqdii() {
        if (lfekaq.isShowing) {
            lfekaq.dismiss()
        }
    }

}