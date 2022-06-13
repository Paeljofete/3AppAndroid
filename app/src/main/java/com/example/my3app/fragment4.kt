package com.example.my3app


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton

class fragment4 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val x = inflater.inflate(R.layout.fragment_fragment4, container, false)

        val bt_link = x.findViewById<ImageButton>(R.id.button_link)

        bt_link.setOnClickListener {

            Log.i("INFO: ", "Redirección a Google Maps.")

            val url = "https://www.google.es/maps/place/H%C3%A9roes+de+Papel/@37.3527759,-6.1434965,17z/data=!3m1!4b1!4m5!3m4!1s0xd1213efcf4c3573:0xdfec1b0c2ff768f0!8m2!3d37.3528109!4d-6.1412245?hl=es"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        return x
    }
}