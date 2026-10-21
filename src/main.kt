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
    while (choice != "5") {
        println("""
         1. Add an undergrad student
         2. Add a masters student
         3. Search for student by ID
         4. Search for students by name
         5. Quit
        """.trimIndent())

        choice = readln()

        when (choice) {
            "1" -> {
                print("Enter the ID: ")
                val id = readln()
                print("Enter the name: ")
                val name = readln()
                print("Enter the course: ")
                val course = readln()
                print("Enter the mark: ")
                val mark = readln().toInt()
                if (!uni.addStudent(id, name, course, mark)){
                    println("Student with id '$id' already exists\n")
                }
                else println("Successfully added $name\n")
            }
            "2" -> {
                print("Enter the ID: ")
                val id = readln()
                print("Enter the name: ")
                val name = readln()
                print("Enter the course: ")
                val course = readln()
                print("Enter the mark: ")
                val mark = readln().toInt()
                if (!uni.addStudent(id, name, course, mark, true)){
                    println("Student with id '$id' already exists\n")
                }
                else println("Successfully added $name\n")
            }
            "3" -> {
                print("Enter the ID: ")
                val id = readln()
                println(uni.findStudentById(id)?.toString() ?: "No students with ID $id")
                println()
            }
            "4" -> {
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
            "5" -> {}
            else -> {
                println("'$choice' not a valid option.")
                println()
            }
        }
    }
}