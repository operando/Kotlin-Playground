class Student(name: String, val id: Long) : Person(name) {

    override fun introduce() {
        println("I am $name2(id=$id).")
    }
}