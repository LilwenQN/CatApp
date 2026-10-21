class UndergradStudent (id: String, name: String, course: String, markIn: Int)
    : Student(id, name , course, markIn)
{
    override fun getGrade() : String {
        return when (mark) {
            in 0..39 -> "Fail"
            in 40..49 -> "Third"
            in 50..59 -> "2/2"
            in 60..69 -> "2/1"
            else -> "First"
        }
    }

}