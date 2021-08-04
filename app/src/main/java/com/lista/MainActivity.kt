package com.lista

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.lista.adapter.AdapterRecyclerView
import com.lista.model.Car
import com.lista.singleton.CarListaControle

class MainActivity : AppCompatActivity() {

    // toda vez que iniciar uma variavel e depois jogar um valor para ela, é usado lateinit
    private lateinit var carRecyclerView: RecyclerView
    //criar variavel para o adapter
    private lateinit var adapter: AdapterRecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.ButtonTelaSeguinte).setOnClickListener{
            val segundaTela = Intent (this, MainActivity2::class.java)
            startActivity(segundaTela)
        }


        //atribuir valor à variavel adapter
        adapter = AdapterRecyclerView(CarListaControle.listaCarros)



        carRecyclerView = findViewById(R.id.carsRecyclerView)
        carRecyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        carRecyclerView.adapter = adapter



    }
       override fun onResume(){
       adapter.refresh(CarListaControle.listaCarros)
       super.onResume()
        }
    }