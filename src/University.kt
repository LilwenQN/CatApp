class University {
    private var modules = mutableListOf<Module>()
    private var students = mutableMapOf<String, Student>()

    public fun findStudentsByName(name_: String) : MutableList<Student> {
        val matches: MutableList<Student> = mutableListOf()
        val name = name_.lowercase()

        students.forEach { student ->
            if (student.value.name.lowercase() == name) {
                matches.add(student.value)
            }
        }
        return matches
    }

    public fun findStudentById(id: String) : Student? {
        return students[id]
    }

    public fun addStudent(student: Student) : Boolean{
        if (students[student.id] != null){
            return false
        }
        students[student.id] = student
        return true

    }

    public fun addStudent(id: String, name: String, course: String, mark: Int, isMasters: Boolean = false) : Boolean {
        if (isMasters) {
            return addStudent(MastersStudent(id, name, course, mark))
        }
        return addStudent(UndergradStudent(id, name, course, mark))
    }
}