class Person {

    var name: String = ""
        set(value) {
            println("set $value")
            // field = バッキングフィールドを表す暗黙の変数
            field = value
        }
    var age: Int = 0
    val nameLength: Int
        get() = name.length

    // 初期化のタイミングを遅らせる
    // varでしか使えない + non nullでしか使えない + primitiveには使えない + custom getter/setterは持てない
    // https://kotlinlang.org/docs/reference/properties.html#late-initialized-properties
    // DIとかに使える
    // 初期化する前にアクセスするとUninitializedPropertyAccessExceptionが起きる
    lateinit var humuhumu: String
}