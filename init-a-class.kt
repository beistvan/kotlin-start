class Patient() {
    val firstName = "Marcus" 
    val lastName = "Rashford" 
    val iin = 777777
    val age = 26
    val weight = 90
    val height = 180
}

fun main() {
    var patient = Patient() // должно выводить как в примере
    println(patient.firstName)
    println(patient.lastName)
    println(patient.iin)
    println(patient.age)
    println(patient.weight)
    println(patient.height)
}

/*
Marcus
Rashford
777777
26
90
180
*/
