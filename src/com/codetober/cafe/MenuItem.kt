package com.codetober.cafe

abstract class MenuItem(name: String, price: Double = 0.99, description: String){
    val name: String = name

    val description: String = description
    val price: Double = price


    init {
        require(name.isNotEmpty()){"Cannot Create MenuItem without a valid name!"}
        require(description.isNotEmpty()){"Cannot Create MenuItem without a valid description!"}
        require(price >= 0.0){"Cannot create MenuItem with a negative price!"}
    }


}