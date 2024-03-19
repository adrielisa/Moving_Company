import Model.Customer
import Model.DeliveryMan

fun main() {
    val customer = Customer(
       names = "Miriam",
        firstLastName = "Cupul",
        secondLastName = "Dzul",
        phoneNumber = 88888888,
        address = "Cancun Crucero"
    )
    printPerson(customer)

    val deliveryMan = DeliveryMan(
        names = "Ignacio",
        firstLastName = "Hernandez",
        secondLastName = "Perez",
        phoneNumber = 999999999,
        RFC = "ABCDEFGH",
        salary =
    )
}