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
    fun sayHello(target: String)
}