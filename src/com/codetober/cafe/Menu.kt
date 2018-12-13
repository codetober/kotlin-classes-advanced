package com.codetober.cafe

data class Menu(val name: String){
    private val items: List<MenuItem> = listOf(ZeroGravityMocha(), DarkSideFrap())


    fun getItemByNumber(itemNumber: String): MenuItem {
        var item: MenuItem
        try {
            item = items[Integer.parseInt(itemNumber)-1]
        } catch (ex: Exception){
            println("Erm. You ordered the DarkSide, Right? Eh-He..")
            item = DarkSideFrap()
        }
        return item
    }

    override fun toString(): String {
        var menuString = "$name Menu\n-------------------\n"
        items.forEachIndexed { index, menuItem ->
            menuString = menuString.plus("${index+1}.) $${menuItem.price}... ${menuItem.name}... ${menuItem.description} \n")
        }
        menuString = menuString.plus("\nJust tell me the item number you'd like to order! Or say 'exit' to stop ordering.")
        return menuString
    }
}