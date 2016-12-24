class Student(name: String, val id: Long) : Person(name) {

    override var age: Int = 0
        get() = field
        set(value) {
            field = value * 2
        }

    override fun introduce() {
        println("I am $name2(id=$id).")
    }
}