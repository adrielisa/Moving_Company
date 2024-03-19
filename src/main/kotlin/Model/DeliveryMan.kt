package Model
class DeliveryMan (
    val drivingLicense: String,
    val workerID: String,
    val salary: Int,
    names: String,
    firstLastName: String,
    secondLastName: String,
    RFC: String,
    phoneNumber: Number,
    email: String,
) : Person(names, firstLastName, secondLastName, RFC, phoneNumber, email) {

}