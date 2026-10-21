abstract class Student (val id: String,
                    val name: String,
                        var course: String,
                        markIn: Int)
{
    public var mark: Int = 0
        set(newMark){
            if (mark in 0..100){
                field = newMark
            }
        }

    init {
        mark = markIn
    }

    abstract fun getGrade() : String

    fun didPass() : Boolean {
        return mark >= 40
    }

    override fun toString(): String {
        return """
            name: $name
            course: $course
            Mark: $mark
            Grade: ${getGrade()}
        """.trimIndent()
    }
}