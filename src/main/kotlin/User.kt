// openを付けないと継承できない
open class User(val name: String) {

    var age = 0

    val isAdmin: Boolean
        get() = false

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