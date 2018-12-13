package com.codetober.cafe

import java.lang.IllegalStateException

class Customer(name: String){
    val name = name

    // Initialize the customer's currency count depending on their name
    private var currency: Double = when(name){
        "Carat" -> 100.0
        "Turbo" -> 150.0
        else -> 50.0
    };


    fun purchase(price: Double){
        var temp = this.currency
        if((temp - price) < 0) {
            throw IllegalStateException("Cannot purchase item, not enough currency!")
        } else {
            this.currency -= price
        }
    }

}