package com.lista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    // toda vez que iniciar uma variavel e depois jogar um valor para ela, é usado lateinit
    private lateinit var carRecyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        carRecyclerView = findViewById(R.id.carsRecyclerView)




    }
}