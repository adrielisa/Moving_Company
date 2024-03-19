package Controller

import Utils.Printer

class MenuController {

    private val printer = Printer()
    private val movingRequestController = MovingRequestController()
    private val customersController = CustomersController()
    private val deliveryManController = DeliveryManController()

    fun showMenu() {
        printer.apply {
            printMsg("\n!Howdy, have a nice day! Welcome to the menu" +
            "\nPlease click one option")
            printMsg("\n1: Register a Deliveryman")
            printMsg("\n2: Register a customer")
            printMsg("\n3: Make a moving request")
            printMsg("\n4: Show registered workers")
            printMsg("\n5: Show registered costumers")
            printMsg("\n6: Show registered moving requests" + "\n")

            val selectedOption = readln().toIntOrNull()
            if selectedOption != null {
                valideOptions(selectedOption)
            } else {
                printMsg("Invalid option. Please, select a valid option")
                showMenu()
            }
        }

        private fun valideOptions(selectedOption: Int) {
            when (selectedOption) {
                1 -> {
                    deliveryManController.registerModel()
                    showMenu()
                }
                2 -> {
                    customersController.registerModel()
                    showMenu()
                }
                3 -> {

                }
                4-> {
                    deliveryManController.registerModel()
                    showMenu()
                }
                5 -> {
                    customersController.showAllModels()
                    showMenu()
                }
                6 -> {
                    movingRequestController.showAllModels()
                    showMenu()
                }
                else -> {
                printer.printMsg("Invalid option. Please type a right number")
                }
            }
        }
    private fun selectDeliveryManAndCustomer() {

        if (customersController.thereAreNoRegisteredCustomers()) {
            printer.printMsg("No registered customers found")
            showMenu()
            return
        }
        if (deliveryManController.thereAreNoRegisteredDelivereymen()) {
            printer.printMsg("No registered Deliverymen found")
            showMenu()
            return
        }

        printer.printMsg("Select a customer")
        customersController.showAllModels()

        val indexCustomerSelected = readln().toInt()
        val customer = customersController.getCustomerIndex

    }

    }
}
