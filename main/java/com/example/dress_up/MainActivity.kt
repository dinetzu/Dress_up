package com.example.dress_up

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dress_up.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var boneca: Int = 0;
        var cabelo: Int = 0;
        var blusa: Int = 0;
        var calca: Int = 0;
        var sapato: Int = 0;

        binding.buttonBoneca.setOnClickListener {
            boneca++
            if (boneca > 4){
                boneca = 0
                binding.imageBoneca.setImageResource(R.drawable.boneca1)
            }
            when(boneca){
                0 -> binding.imageBoneca.setImageResource(R.drawable.boneca1)
                1 -> binding.imageBoneca.setImageResource(R.drawable.boneca2)
                2 -> binding.imageBoneca.setImageResource(R.drawable.boneca3)
                3 -> binding.imageBoneca.setImageResource(R.drawable.boneca4)
                4 -> binding.imageBoneca.setImageResource(R.drawable.boneca5)
            }
        }

        binding.buttonCabelo.setOnClickListener {
            cabelo++
            if (cabelo > 4){
                cabelo = 0
                binding.imageCabelo.setImageResource(R.drawable.cabelo1)
            }
            when(cabelo){
                0 -> binding.imageCabelo.setImageResource(R.drawable.cabelo1)
                1 -> binding.imageCabelo.setImageResource(R.drawable.cabelo2)
                2 -> binding.imageCabelo.setImageResource(R.drawable.cabelo3)
                3 -> binding.imageCabelo.setImageResource(R.drawable.cabelo4)
                4 -> binding.imageCabelo.setImageResource(R.drawable.cabelo5)
            }
        }

        binding.buttonBlusa.setOnClickListener {
            blusa++
            if (blusa > 4){
                blusa = 0
                binding.imageBlusa.setImageResource(R.drawable.blusa1)
            }
            when(blusa){
                0 -> binding.imageBlusa.setImageResource(R.drawable.blusa1)
                1 -> binding.imageBlusa.setImageResource(R.drawable.blusa2)
                2 -> binding.imageBlusa.setImageResource(R.drawable.blusa3)
                3 -> binding.imageBlusa.setImageResource(R.drawable.blusa4)
                4 -> binding.imageBlusa.setImageResource(R.drawable.blusa5)
            }

        }

        binding.buttonCalca.setOnClickListener {
            calca++
            if (calca > 4){
                calca = 0
                binding.imageCalca.setImageResource(R.drawable.calca1)
            }
            when(calca){
                0 -> binding.imageCalca.setImageResource(R.drawable.calca1)
                1 -> binding.imageCalca.setImageResource(R.drawable.calca2)
                2 -> binding.imageCalca.setImageResource(R.drawable.calca3)
                3 -> binding.imageCalca.setImageResource(R.drawable.calca4)
                4 -> binding.imageCalca.setImageResource(R.drawable.calca5)
            }

        }

        binding.buttonSapato.setOnClickListener {
            sapato++
            if (sapato > 4){
                sapato = 0
                binding.imageSapato.setImageResource(R.drawable.sapato1)
            }
            when(sapato){
                0 -> binding.imageSapato.setImageResource(R.drawable.sapato1)
                1 -> binding.imageSapato.setImageResource(R.drawable.sapato2)
                2 -> binding.imageSapato.setImageResource(R.drawable.sapato3)
                3 -> binding.imageSapato.setImageResource(R.drawable.sapato4)
                4 -> binding.imageSapato.setImageResource(R.drawable.sapato5)
            }

        }
    }
}