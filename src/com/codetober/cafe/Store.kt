package com.codetober.cafe

import kotlin.system.exitProcess

object Store {
    val name: String = "MoonBucks Cafe"

    // Properties
    private val menu by lazy { Menu(name) }

    // Functions
    fun printWelcomeMessage() = println("Welcome to $name!\n")
    fun printExitMessage() = println("\nThanks for shopping at $name")
    fun placeOrder(customer: Customer, itemNumber: String?) {
        if(itemNumber != null) {
            val menuItem = menu.getItemByNumber(itemNumber)
            println("You ordered: ${menuItem.name} (x1)")
            println("Thanks ${customer.name}! Can I get you anything else?")
        }
    }
    fun printMenu() = println(this.menu.toString())

}