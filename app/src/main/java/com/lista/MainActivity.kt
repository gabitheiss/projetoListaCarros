package com.lista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lista.adapter.AdapterRecyclerView
import com.lista.model.Car

class MainActivity : AppCompatActivity() {

    // toda vez que iniciar uma variavel e depois jogar um valor para ela, é usado lateinit
    private lateinit var carRecyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val listOfCars = listOf<Car>(
            Car("Chevrolet", "Celta" , 2012),
            Car("Chevrolet", "S10" , 2020),
            Car("Fiat", "Palio" , 2018),
            Car("Fiat", "Strada" , 2010),
            Car("VM", "Gol" , 2010),
            Car("VM", "Amarok" , 2010),

        )

        carRecyclerView = findViewById(R.id.carsRecyclerView)
        carRecyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        carRecyclerView.adapter = AdapterRecyclerView(listOfCars)




    }
}