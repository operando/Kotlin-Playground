abstract class Greeter(val target: String) {

    abstract var code: String

    abstract val age: Int

    abstract fun sayHello()
}

class EnglishGreeter(target: String, override val age: Int) : Greeter(target) {
    override var code: String = ""
        get() = "en"
        set(value) {
            field = value
        }

    override fun sayHello() {
        println("Hello $target!")
    }
}

class JapaneseGreeter(target: String, override val age: Int) : Greeter(target) {
    override var code: String = ""
        get() = "ja"
        set(value) {
            field = value
        }

    override fun sayHello() {
        println("こんにちは、$target!")
    }
}