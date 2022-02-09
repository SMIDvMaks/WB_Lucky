package com.bw.lyukc

import android.util.Base64
import com.onesignal.OneSignal
import kotlinx.coroutines.DelicateCoroutinesApi
import java.lang.NullPointerException

var key: String? = null
var sub6: String? = null
var sub7: String? = null
var sub2: String? = null
var sub3: String? = null
var sub4: String? = null
var sub5: String? = null

lateinit var ItisArrayqepr: Array<String>


@DelicateCoroutinesApi
class Pars {
    var popQEW = "Y29tLmJ3Lmx5dWtjCg=="

    fun AloneSearhLine(lineAlonesearh: String, emulatidAdvert: String, apiksqwf: String): String {
        ItisArrayqepr = lineAlonesearh.split("::").toTypedArray()

        try {
            key = ItisArrayqepr[0]
        } catch (e: NullPointerException) {
        }
        try {
            sub6 = ItisArrayqepr[1]
        } catch (e: NullPointerException) {
        }
        try {
            sub7 = ItisArrayqepr[2]
        } catch (e: NullPointerException) {
        }
        try {
            sub2 = ItisArrayqepr[3]
        } catch (e: NullPointerException) {
        }
        try {
            sub3 = ItisArrayqepr[4]
        } catch (e: NullPointerException) {
        }
        try {
            sub4 = ItisArrayqepr[5]
        } catch (e: NullPointerException) {
        }
        try {
            sub5 = ItisArrayqepr[6]
        } catch (e: NullPointerException) {
        }
        OneSignal.sendTag(FbAppsIntro("c3ViX2FwcA=="), sub6)
        val AppsParametrcheking =
            (key + FbAppsIntro("P2J1bmRsZT0=") + FbAppsIntro(popQEW)
                    + FbAppsIntro("JmFkX2lkPQ==") + emulatidAdvert + FbAppsIntro("JmFwcHNfaWQ9")
                    + apiksqwf +
                    FbAppsIntro("JmRldl9rZXk9") + diedevke +
                    FbAppsIntro("JnN1YjY9") + sub6 +
                    FbAppsIntro("JnN1Yjc9") + sub7 +
                    FbAppsIntro("JnN1YjI9") + sub2 +
                    FbAppsIntro("JnN1YjM9") + sub3 +
                    FbAppsIntro("JnN1YjQ9") + sub4 +
                    FbAppsIntro("JnN1YjU9") + sub5)

        return AppsParametrcheking
    }

    fun FbAppsIntro(str123: String): String {
        val s = String(Base64.decode(str123, Base64.DEFAULT))
        return s
    }


}