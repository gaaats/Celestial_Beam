package com.sinyee.babybus.marke.brooooorrr


import android.webkit.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.appsflyer.AppsFlyerLib
import com.google.android.material.snackbar.Snackbar
import com.onesignal.OneSignal
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.*
import android.provider.MediaStore
import android.util.Log
import com.orhanobut.hawk.Hawk
import com.sinyee.babybus.marke.R
import com.sinyee.babybus.marke.appplica.Cossssik.C1gttggtgttrtttt
import com.sinyee.babybus.marke.appplica.Cossssik.deeeplator
import com.sinyee.babybus.marke.appplica.Cossssik.maineator
import com.sinyee.babybus.marke.appplica.Cossssik.linkatorr
import com.sinyee.babybus.marke.databinding.ActivityBrozzzersBinding
import org.json.JSONException
import org.json.JSONObject
import java.io.File
import java.io.IOException

class BrozzzersActivity : AppCompatActivity() {
    private val oniks = 1

    val packfrfrrfr = "com.sinyee.babybus.marke"


    var bggbggb: ValueCallback<Array<Uri>>? = null
    lateinit var jgidhgjdk: WebView

    var urlfififif = ""
    fun saveUrl(lurlurlurlurlur: String?) {
        if (!lurlurlurlurlur!!.contains("t.me")) {

            if (urlfififif == "") {
                urlfififif = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    lurlurlurlurlur
                ).toString()

                val spspspspsppspspsp = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val ededededededed = spspspspsppspspsp.edit()
                ededededededed.putString("SAVED_URL", lurlurlurlurlur)
                ededededededed.apply()
            }
        }
    }


    private fun gbhnhnhnhnnhnh() {
        val hyjujujuuj = jgidhgjdk.settings
        hyjujujuuj.javaScriptEnabled = true

        hyjujujuuj.useWideViewPort = true

        hyjujujuuj.loadWithOverviewMode = true
        hyjujujuuj.allowFileAccess = true
        hyjujujuuj.domStorageEnabled = true
        hyjujujuuj.userAgentString = hyjujujuuj.userAgentString.replace("; wv", "")

        hyjujujuuj.javaScriptCanOpenWindowsAutomatically = true
        hyjujujuuj.setSupportMultipleWindows(false)

        hyjujujuuj.displayZoomControls = false
        hyjujujuuj.builtInZoomControls = true
        hyjujujuuj.setSupportZoom(true)

        hyjujujuuj.pluginState = WebSettings.PluginState.ON
        hyjujujuuj.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        hyjujujuuj.setAppCacheEnabled(true)

        hyjujujuuj.allowContentAccess = true
    }

    lateinit var activityBrozzzersBinding: ActivityBrozzzersBinding
    var kgjfhhyhyhyyhyhhydkxf: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityBrozzzersBinding = ActivityBrozzzersBinding.inflate(layoutInflater)
        setContentView(activityBrozzzersBinding.root)

        jgidhgjdk = activityBrozzzersBinding.gtgtggttgtggtgt
        gtjigtjtgjigtijgtij()


        val bgbnhnhhnhhhh = CookieManager.getInstance()
        bgbnhnhhnhhhh.setAcceptCookie(true)
        bgbnhnhhnhhhh.setAcceptThirdPartyCookies(jgidhgjdk, true)
        gbhnhnhnhnnhnh()
        val gtgtgtgtggt: Activity = this
        jgidhgjdk.webViewClient = object : WebViewClient() {

            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (tjigjgtjgtjjgttgjtgj(url)) {

                        val juujujujujjuffddd = Intent(Intent.ACTION_VIEW)
                        juujujujujjuffddd.data = Uri.parse(url)
                        startActivity(juujujujujjuffddd)
                    } else {
                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                view.loadUrl(url)
            }


            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)
                saveUrl(url)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(gtgtgtgtggt, description, Toast.LENGTH_SHORT).show()
            }


        }
        jgidhgjdk.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView, filePathCallback: ValueCallback<Array<Uri>>,
                fileChooserParams: FileChooserParams
            ): Boolean {
                bggbggb?.onReceiveValue(null)
                bggbggb = filePathCallback
                var bgbgbgbggbffrffrrf: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (bgbgbgbggbffrffrrf!!.resolveActivity(packageManager) != null) {
                    var bhnhnhnhhn: File? = null
                    try {
                        bhnhnhnhhn = jujujiii()
                        bgbgbgbggbffrffrrf.putExtra("PhotoPath", kgjfhhyhyhyyhyhhydkxf)
                    } catch (ex: IOException) {
                    }

                    if (bhnhnhnhhn != null) {
                        kgjfhhyhyhyyhyhhydkxf = "file:" + bhnhnhnhhn.absolutePath
                        bgbgbgbggbffrffrrf.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(bhnhnhnhhn)
                        )
                    } else {
                        bgbgbgbggbffrffrrf = null
                    }
                }
                val ujjujuki6k5ikiik = Intent(Intent.ACTION_GET_CONTENT)
                ujjujuki6k5ikiik.addCategory(Intent.CATEGORY_OPENABLE)
                ujjujuki6k5ikiik.type = "image/*"
                val vfnvjnfhhedhhhed: Array<Intent?> =
                    bgbgbgbggbffrffrrf?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val cdnjcdcbcdbbcdbdc = Intent(Intent.ACTION_CHOOSER)
                cdnjcdcbcdbbcdbdc.putExtra(Intent.EXTRA_INTENT, ujjujuki6k5ikiik)
                cdnjcdcbcdbbcdbdc.putExtra(Intent.EXTRA_TITLE, getString(R.string.take_imagefgtgt))
                cdnjcdcbcdbbcdbdc.putExtra(Intent.EXTRA_INITIAL_INTENTS, vfnvjnfhhedhhhed)
                startActivityForResult(
                    cdnjcdcbcdbbcdbdc, oniks
                )
                return true
            }

            @Throws(IOException::class)
            private fun jujujiii(): File {
                var jujikikiki = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!jujikikiki.exists()) {
                    jujikikiki.mkdirs()
                }

                jujikikiki =
                    File(jujikikiki.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return jujikikiki
            }

        }

        jgidhgjdk.loadUrl(ururururururururffr())
    }

    private fun gtjigtjtgjigtijgtij() {
        tjigjtjgjtjgjjtjgjtjgjtij()
    }

    private fun tjigjtjgjtjgjjtjgjtjgjtij() {
        Snackbar.make(
            activityBrozzzersBinding.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()
    }

    override fun onBackPressed() {
        if (jgidhgjdk.canGoBack()) {
            if (jkikiiik) {
                jgidhgjdk.stopLoading()
                jgidhgjdk.loadUrl(urlfififif)
            }
            this.jkikiiik = true
            jgidhgjdk.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                jkikiiik = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

    private fun fnvnfjnvfnfvnf(string: String) {
        OneSignal.setExternalUserId(
            string,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val gtgtgtgtgtgt = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $gtgtgtgtgtgt"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val ppppppooopy =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $ppppppooopy"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val rkrfrfkrkrfkfkrf = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $rkrfrfkrkrfkfkrf"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }



    private fun ururururururururffr(): String {
        val hykkhhykhykkohykhy = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)

        val cpOnefgtgt:String? = Hawk.get(C1gttggtgttrtttt, "null")
        val gtgthyhyhyhy = "sub_id_1="
        val jukikikiikik = "ad_id="
        val nhjmjmjmjmjm = "sub_id_4="
        val bgbggbbg = "sub_id_5="
        val yjujuuj5uj5uj2 = "sub_id_6="
        val bgbgbg: String? = Hawk.get(maineator, "null")
        val gtjigjttijtjti: String? = Hawk.get(deeeplator, "null")

        val bcdgdccdbdccd = AppsFlyerLib.getInstance().getAppsFlyerUID(this)

        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        val bbgbg = "deviceID="
        val namingggggggttgttttt = "naming"
        val deeeeeeepa = "deeporg"
        val ughtuhgtuguthtg = Build.VERSION.RELEASE

        val bgnjnbgjbgn = Hawk.get(linkatorr, "null")
        var gttgjitgjtjgtjgtjjtg = ""
        if (cpOnefgtgt != "null"){
            gttgjitgjtjgtjgtjjtg = "$bgnjnbgjbgn$gtgthyhyhyhy$cpOnefgtgt&$bbgbg$bcdgdccdbdccd&$jukikikiikik$bgbgbg&$nhjmjmjmjmjm$packfrfrrfr&$bgbggbbg$ughtuhgtuguthtg&$yjujuuj5uj5uj2$namingggggggttgttttt"
            fnvnfjnvfnfvnf(bcdgdccdbdccd.toString())
        } else {
            gttgjitgjtjgtjgtjjtg = "$bgnjnbgjbgn$gtgthyhyhyhy$gtjigjttijtjti&$bbgbg$bcdgdccdbdccd&$jukikikiikik$bgbgbg&$nhjmjmjmjmjm$packfrfrrfr&$bgbggbbg$ughtuhgtuguthtg&$yjujuuj5uj5uj2$deeeeeeepa"
            fnvnfjnvfnfvnf(bcdgdccdbdccd.toString())
        }
        Log.d("lolo", "link is $gttgjitgjtjgtjgtjjtg")
        return hykkhhykhykkohykhy.getString("SAVED_URL", gttgjitgjtjgtjgtjjtg).toString()
    }
    private var jkikiiik = false

    private fun tjigjgtjgtjjgttgjtgj(uri: String): Boolean {
        val gtplgltpgtl = packageManager
        try {
            gtplgltpgtl.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (e: PackageManager.NameNotFoundException) {
        }
        return false
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode != oniks || bggbggb == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var vbfvfbvfvfhvfhbfv: Array<Uri>? = null
        if (resultCode == AppCompatActivity.RESULT_OK) {
            if (data == null || data.data == null) {
                vbfvfbvfvfhvfhbfv = arrayOf(Uri.parse(kgjfhhyhyhyyhyhhydkxf))
            } else {
                val vfvddsser = data.dataString
                if (vfvddsser != null) {
                    vbfvfbvfvfhvfhbfv = arrayOf(Uri.parse(vfvddsser))
                }
            }
        }
        bggbggb?.onReceiveValue(vbfvfbvfvfhvfhbfv)
        bggbggb = null
    }
}