package test

interface GreeterKai {
    // プロパティも持てる(プロパティ自体が値を持つものは宣言できない = varは無理.val)
    // 固定値 or 他のプロパティなら返せる
    val hum: String
        get() = "hum"

    // デフォルト実装を持てる
    fun hum() {
        println(language)
    }

    val language: String
    // sayHello()で呼び出すとデフォルト引数の方じゃなくて、引数なしで定義したメソッドが呼ばれるF
    fun sayHello()

    // デフォルト引数は指定できるのね
    fun sayHello(target: String = "匿名")
}

class JapaneseGreeterKai : GreeterKai {

    override val language: String
        get() = "ja"

    override fun sayHello() {
        sayHello("匿名")
    }

    override fun sayHello(target: String) {
        println("こんにちは、$target!")
    }
}

class GreeterWithRecording(private val greeterKai: GreeterKai) : GreeterKai by greeterKai {
    private val _target: MutableSet<String> = mutableSetOf()

    val targets: Set<String>
        get() = _target

    override fun sayHello(target: String) {
        _target += target
        greeterKai.sayHello(target)
    }
}