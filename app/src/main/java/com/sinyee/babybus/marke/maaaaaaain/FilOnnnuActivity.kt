package com.sinyee.babybus.marke.maaaaaaain


import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.orhanobut.hawk.Hawk
import com.sinyee.babybus.marke.R
import com.sinyee.babybus.marke.appplica.Cossssik.maineator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.sinyee.babybus.marke.appplica.Cossssik.appsCheckfrr6frfr
import com.sinyee.babybus.marke.appplica.Cossssik.countrator
import com.sinyee.babybus.marke.appplica.Cossssik.georator
import com.sinyee.babybus.marke.gggggggggggam.GaaaammmmmActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class FilOnnnuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fil_onnnu)
        checkCountry()
    }

    private fun intALonehyhyy() {
        val ddede = Intent(this@FilOnnnuActivity, GaaaammmmmActivity::class.java)
        rfofofkrfofrkrfk()
        startActivity(ddede)
        finish()
    }

    private fun rfofofkrfofrkrfk() {
        Hawk.put(georator, null)
        gtutghgt()
    }

    private fun gfgtgtt() {
        val kyohokhykhyhyk = AdvertisingIdClient(applicationContext)
        kyohokhykhyhyk.start()
        val vfnvfjnvfnfvnfvnj = kyohokhykhyhyk.info.id
        Log.d("lolo", "AdvertisingIdClient $vfnvfjnvfnfvnfvnj")
        Hawk.put(maineator, vfnvfjnvfnfvnfvnj)
    }

    private fun intAfbftgttgtgttt() {
        Log.d("lolo", "go to SortTvoActivity")
        val hyhyyhyhy = Intent(this@FilOnnnuActivity, FiiilTviiiiActivity::class.java)
        startActivity(hyhyyhyhy)
        finish()
    }

    private fun gtutghgt() {
        Hawk.put(countrator, null)
        Hawk.put(appsCheckfrr6frfr, null)
    }

    private fun ftgthy(): String? {
        val restCheckftgt: String? = Hawk.get(appsCheckfrr6frfr)
        return restCheckftgt
    }

    private fun checkCountry() {

        val check = ftgthy()
        Log.d("lolo", "check $check")

        if (check == "0") {
            rfhufhrfrfhrfhhrf()

        } else {
            GlobalScope.launch(Dispatchers.Default) {
                gfgtgtt()
            }
            intAfbftgttgtgttt()
        }
    }

    private fun rfhufhrfrfhrfhhrf() {
        intALonehyhyy()
    }

}