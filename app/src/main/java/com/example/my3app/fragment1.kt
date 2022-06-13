package com.example.my3app


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class fragment1 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_fragment1, container, false)

        val button = v.findViewById<Button>(R.id.buttonHeroes)
        val button2 = v.findViewById<Button>(R.id.buttonFecha)
        val button3 = v.findViewById<Button>(R.id.buttonMaps)

        button.setOnClickListener {

            Toast.makeText(activity, "Editorial Héroes de Papel", Toast.LENGTH_LONG).show()

            val fragmento = fragment2()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()

            transaction.replace(R.id.fragmentContainerView2, fragmento)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        button2.setOnClickListener {
            Toast.makeText(activity, "Calendario", Toast.LENGTH_LONG).show()

            val fragmento = fragment3()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()

            transaction.replace(R.id.fragmentContainerView2, fragmento)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        button3.setOnClickListener {

            Toast.makeText(activity, "Haz clic en la imagen", Toast.LENGTH_LONG).show()

            val fragmento = fragment4()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()

            transaction.replace(R.id.fragmentContainerView2, fragmento)
            transaction.addToBackStack(null)
            transaction.commit()
        }
        return v
    }

}