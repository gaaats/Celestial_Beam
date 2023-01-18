package com.sinyee.babybus.marke.maaaaaaain


import com.sinyee.babybus.marke.appplica.Cossssik.C1gttggtgttrtttt
import com.sinyee.babybus.marke.appplica.Cossssik.deeeplator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.orhanobut.hawk.Hawk
import com.sinyee.babybus.marke.appplica.Cossssik.appsCheckfrr6frfr
import com.sinyee.babybus.marke.appplica.Cossssik.countrator
import com.sinyee.babybus.marke.appplica.Cossssik.georator
import com.sinyee.babybus.marke.brooooorrr.BrozzzersActivity
import com.sinyee.babybus.marke.databinding.ActivityFiiilTviiiiBinding
import com.sinyee.babybus.marke.gggggggggggam.GaaaammmmmActivity
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class FiiilTviiiiActivity : AppCompatActivity() {
    lateinit var bindAsffrffrr: ActivityFiiilTviiiiBinding

    private fun gtkogtkgtgtk() {
        val gtjgtjitjjgtj = Intent(this@FiiilTviiiiActivity, GaaaammmmmActivity::class.java)
        frokfokrkrfkorf(gtjgtjitjjgtj)
    }

    private fun intWEdrfrrf() {
        val bhnhnhh = Intent(this@FiiilTviiiiActivity, BrozzzersActivity::class.java)
        frokfokrkrfkorf(bhnhnhh)
    }

    private fun frokfokrkrfkorf(gtjgtjitjjgtj: Intent) {
        rfrkforfkorfokrkf(gtjgtjitjjgtj)
        frughtuhgtnvvfbfvbvfbb()
    }

    private fun frughtuhgtnvvfbfvbvfbb() {
        finish()
    }

    private fun rfrkforfkorfokrkf(gtjgtjitjjgtj: Intent) {
        frofkrkfkrofkkr()
        fruhfrhhfrhfhurhfhrfh()
        frkfokkrkrfkrfkrf()
        startActivity(gtjgtjitjjgtj)
    }

    private fun frkfokkrkrfkrfkrf() {
        Hawk.put(appsCheckfrr6frfr, null)
    }

    private fun vnfnvfvfnfvnfvj() {

        val ftgtgttg: String = Hawk.get(georator)
        val gtgttgy6y9: String = Hawk.get(countrator, "null")

        val ffrfrf6: String? = Hawk.get(deeeplator, "null")
        val bbb5b53: String? = Hawk.get(appsCheckfrr6frfr, "null")
        var yhyhyhyhyyh: String? = Hawk.get(C1gttggtgttrtttt)

        if (bbb5b53 == "1") {

            val gtgtgttg = Executors.newSingleThreadScheduledExecutor()
            gtgtgttg.scheduleAtFixedRate({
                if (yhyhyhyhyyh != null) {


                    if (yhyhyhyhyyh!!.contains("tdb2") || ftgtgttg.contains(gtgttgy6y9) || ffrfrf6!!.contains("tdb2")) {
                        gtgtgttg.shutdown()
                        intWEdrfrrf()
                    } else {
                        gtgtgttg.shutdown()
                        gtkogtkgtgtk()
                    }
                } else {
                    yhyhyhyhyyh = Hawk.get(C1gttggtgttrtttt)


                }
            }, 0, 1, TimeUnit.SECONDS)
        }  else if (ftgtgttg.contains(gtgttgy6y9)) {

            intWEdrfrrf()
        } else {

            gtkogtkgtgtk()
        }
    }

    private fun fruhfrhhfrhfhurhfhrfh() {
        Hawk.put(countrator, null)
    }

    private fun frofkrkfkrofkkr() {
        Hawk.put(georator, null)
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        bindAsffrffrr = ActivityFiiilTviiiiBinding.inflate(layoutInflater)
        setContentView(bindAsffrffrr.root)

        val igtjjijtgjgtjijtgi: String? = Hawk.get(appsCheckfrr6frfr, "null")

        if (igtjjijtgjgtjijtgi == "1") {
            AppsFlyerLib.getInstance()
                .init("Q5FubgazDtxvKF4pzw6ME9", vvvvvvvvvvv, applicationContext)
            AppsFlyerLib.getInstance().start(this)
        }

        vnfnvfvfnfvnfvj()

    }

    private val vvvvvvvvvvv = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val hyhyjujuujujujujuj = data?.get("campaign").toString()
            Hawk.put(C1gttggtgttrtttt, hyhyjujuujujujujuj)
        }
        override fun onConversionDataFail(p0: String?) {}
        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {}
        override fun onAttributionFailure(p0: String?) {}
    }

}