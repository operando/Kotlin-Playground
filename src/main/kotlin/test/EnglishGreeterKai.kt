package test

class EnglishGreeterKai : GreeterKai {
    override val language = "English"

    override fun sayHello(target: String) {
        println("Hello $target!")
    }
}