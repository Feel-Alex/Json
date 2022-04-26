package com.example.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.gateway.ApiFactory
import com.example.json.R
import com.example.json.databinding.ActivityMainBinding
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

class MainActivity : AppCompatActivity() {

    private val compositeDisposable  = CompositeDisposable()

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("MTG", "Сработал OnCreate:")
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        ApiFactory.apiServise.getArtist(artist = "Cher")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.e("MTG", "Subscribe:  ${it}")
            },{
                Log.e("MTG", "Subscribe:  ${it}")

            })
    }
}