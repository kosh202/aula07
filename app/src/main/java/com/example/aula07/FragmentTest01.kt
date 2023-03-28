package com.example.aula07

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aula07.databinding.FragmentTest01Binding


class FragmentTest01 : Fragment() {
    lateinit var binding: FragmentTest01Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // retorna pro android a pontuacao visual do que aparece na tela
        // Inflate the layout for this fragment

        //binding automatico

        binding = FragmentTest01Binding.inflate(inflater)

        binding.button.setOnClickListener {
            alert("Ola", "ola do Fragmento 01", requireContext())
        }


        return binding.root




        return inflater.inflate(R.layout.fragment_test01, container, false)
    }


}