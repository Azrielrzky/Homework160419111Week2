package com.ubaya.homework160419111week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var random1 = (0 until 100).random()
        var random2 = (0 until 100).random()

        //var angka1 = 18
        //var angka2 = 12

        textAngka1.text = random1.toString()
        textAngka2.text = random2.toString()
        buttonSubmit.setOnClickListener {
            var hasilAsli = random1 + random2
            //var hasilAsli = angka1 + angka2
            val hasil = hasil.text.toString()
            var hasilAkhir = Integer.parseInt(hasil)
            var point = 0

            if (hasilAkhir != hasilAsli){
                val action = MainFragmentDirections.actionMainFragment2ToResultFragment2(hasilAkhir)
                Navigation.findNavController(it).navigate(action)
                point++
            }
            else{
                point++
            }
        }
    }
}