// openを付けないと継承できない

open class User(open val name: String) {

    var age = 0

    var gender: Int = 0
        set(value) {
            field = value
        }

    val isAdmin: Boolean
        get() = false

    val language by Language()

    init {
        println("init $name")
    }

    fun len(): Int {
        return name.length
    }

    // openをつけないとoverrideできない
    open fun up(): String {
        return name.toUpperCase()
    }

    constructor(firstName: String, lastName: String) : this("$firstName $lastName") {
        println("firstName = $firstName, lastName = $lastName")
    }
}