fun main() {
    //runCat()
    runStudent()
}

fun runCat(){
    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 5)
    binnie.walk(1)
    clyde.walk(1)
    println(binnie)
    println(clyde)
}

fun runStudent(){
    val uni = University()
    var choice = ""
    while (choice != "4") {
        println("""
         1. Add a student
         2. Search for student by ID
         3. Search for students by name
         4. Quit
        """.trimIndent())

        choice = readln()

        if (choice == "1"){
            print("Enter the ID: ")
            val id = readln()
            print("Enter the name: ")
            val name = readln()
            print("Enter the course: ")
            val course = readln()
            print("Enter the mark: ")
            val mark = readln().toInt()
            uni.addStudent(id, name, course, mark)
        }

        else if (choice == "2"){
            print("Enter the ID: ")
            val id = readln()
            println(uni.findStudentById(id)?.toString() ?: "No students with ID $id")
            println()
        }

        else if (choice == "3"){
            print("Enter the name: ")
            val name = readln()
            val students = uni.findStudentsByName(name)
            for (student in students){
                println(student)
                println()
            }
            if (students.size == 0){
                println("No students found with name $name")
                println()
            }
        }

        else if (choice != "4"){
            println("'$choice' not a valid option.")
            println()
        }
    }
}