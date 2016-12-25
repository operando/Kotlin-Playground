package test

class EnglishGreeterKai : GreeterKai {
    override fun sayHello() {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override val language = "English"

    override fun sayHello(target: String) {
        println("Hello $target!")
    }
}