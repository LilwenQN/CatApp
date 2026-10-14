class Student (val id: String, val name: String, var Course: String, var mark: Double) {
    public override fun toString(): String {
        return """
            name: $name
            course: $Course
            Mark: $mark
        """.trimIndent()
    }
}