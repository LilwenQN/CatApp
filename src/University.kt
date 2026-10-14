class University {
    private var modules = mutableListOf<Module>()
    private var students = mutableListOf<Student>()

    public fun findStudentsByName(name_: String) : MutableList<Student> {
        val matches: MutableList<Student> = mutableListOf()
        val name = name_.lowercase()
        for (student in students) {
            if (student.name.lowercase() == name) {
                matches.add(student)
            }
        }
        return matches
    }

    public fun findStudentById(id: String) : Student? {
        for (student in students) {
            if (student.id == id) {
                return student
            }
        }
        return null
    }

    public fun addStudent(student: Student) {
        students.add(student)
    }

    public fun addStudent(id: String, name: String, course: String, mark: Int) {
        students.add(Student(id, name, course, mark))
    }
}