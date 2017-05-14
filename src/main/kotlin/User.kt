// openを付けないと継承できない
typealias Height<T> = (T) -> Int

open class User(open val name: String) {

    val height: Height<Int> = { it * 100 }
    val height2: Height<String> = { it.toInt() * 100 }

    var age = 0

    var gender: Int = 0
        set(value) {
            field = value
        }

    val isAdmin: Boolean
        get() = false

    // 型定義を省略できる
    val isAdmin2 get() = age > 1000 // type : Boolean

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