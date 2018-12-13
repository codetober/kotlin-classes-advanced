import com.codetober.cafe.Customer
import com.codetober.cafe.Store

/**
 * @author CodeTober
 *
 * Kotlin Classes Tutorial
 * Data Classes, Abstract Classes, Objects
 */


fun main(args: Array<String>) {

    val carat = Customer(name = "Carat")

    Store.printWelcomeMessage()
    Store.printMenu()

    // Loop for user input
    while(true) {
        var input = readLine()
        if(input.equals("exit")){
            break
        } else {
            Store.placeOrder(carat, input ?: "1")
        }
    }

    Store.printExitMessage()
}