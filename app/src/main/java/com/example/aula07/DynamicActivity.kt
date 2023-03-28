package com.example.aula07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aula07.databinding.ActivityDynamicBinding

class DynamicActivity : AppCompatActivity() {
    lateinit var binding: ActivityDynamicBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDynamicBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonFrag1.setOnClickListener {//troca de fragmentos
            val fragment = FragmentTest01()
            supportFragmentManager.beginTransaction().replace(R.id.fragConteiner, fragment).commit()
        }

        binding.buttonFrag2.setOnClickListener {
            val fragment = FragmentTest02()
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragConteiner, fragment)
                .commit()
        }
    }
}