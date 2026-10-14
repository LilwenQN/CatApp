class Student (val id: String, val name: String, var course: String, var mark: Int) {
    public fun getGrade() : String {
        return when (mark) {
            in 0..39 -> "Fail"
            in 40..49 -> "Third"
            in 50..59 -> "2/2"
            in 60..69 -> "2/1"
            else -> "First"
        }
    }

    public fun didPass() : Boolean {
        return mark >= 40
    }

    public override fun toString(): String {
        return """
            name: $name
            course: $course
            Mark: $mark
        """.trimIndent()
    }
}