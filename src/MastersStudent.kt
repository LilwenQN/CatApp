class MastersStudent (id: String, name: String, course: String, markIn: Int)
    : Student(id, name , course, markIn)
{
    override fun getGrade() : String {
        return when (mark) {
            in 0..39 -> "Fail"
            in 40..59 -> "Pass"
            in 60..69 -> "Merit"
            else -> "Distinction"
        }
    }
}