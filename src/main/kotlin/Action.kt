interface Action {

    // propertyを持てる.interface側では値を設定できない
    val prop: Int

    val name: String
        get() = "action name"

    fun jump()

    // デフォルト実装を持てる
    fun run() {
        println("run")
        println(prop)
        println(name)
    }
}