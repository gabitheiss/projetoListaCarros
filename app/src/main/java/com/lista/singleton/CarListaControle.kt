package com.lista.singleton

import com.lista.model.Car

object CarListaControle {
    val listaCarros: MutableList<Car> = mutableListOf (
        Car("Chevrolet", "Celta" , 2012),
        Car("Chevrolet", "S10" , 2020),
        Car("Fiat", "Palio" , 2018),
        Car("Fiat", "Strada" , 2010),
        Car("VM", "Gol" , 2010),
        Car("VM", "Amarok" , 2010),
        )

}