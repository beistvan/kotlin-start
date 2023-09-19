class Patient (
    var firstName : String, 
    var lastName  : String, 
    var iin : String, 
    var age : Int, 
    var weight : Int, 
    var height : Int, 
) 
fun main() {
    var patient = Patient("Marcus", "Rashford", "777777", 26, 90, 180) 
    
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
