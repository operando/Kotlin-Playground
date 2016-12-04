fun main(args: Array<String>) {
    println("kotlin")

    val list = listOf(1, 2, 3, 90, 999)
    list.forEach(::println)

    list.map(Int::toString).map(String::length).forEach(::println)

    for (item in list) {
        println(item)
    }

    for (i in list.indices) {
        println(list.get(i))
    }

    for ((index, value) in list.withIndex()) {
        println("$index $value")
    }

    val map = mapOf(Pair("a", 1), Pair("b", 2))
    for ((key, value) in map) {
        println("$key $value")
    }

    for (i in 1..10) {
        print("$i ")
    }
    println()

    for (i in 1..10 step 3) {
        print("$i ")
    }
    println()

    val a = 1
    val b = 2

    val c = if (a > b) {
        println(a)
        a
    } else {
        println(b)
        b
    }
    println(c)

    val d = if (true) "true" else "false"
    println(d)

    val aaaa = 10
    var e =
            if (aaaa == 10) "10"
            else if (aaaa > 2) "2"
            else "0"
    println(e)

    when (10) {
        hogehoge() -> println("hogehoge")
        a -> println("a")
        a -> println("a")
        b -> println("b")
        else -> println("else")
    }

    when (1) {
        in list -> println("list")
        0, 1 -> println("0 or 1")
        in 2..10 -> println("range 2..10")
    }

    // 値が返せる
    val aa = when (1) {
        1 -> 1 * 3
        else -> 0
    }
    println(aa)

    // ifみたいに書ける
    when {
        "s".isEmpty() -> println("empty")
        else -> println("else")
    }

    e = when {
        (aaaa == 10) -> "10"
        (aaaa > 2) -> "2"
        else -> "0"
    }
    println(e)

    println(getStringLength())
    println(getStringLength("test"))

    val s = getNullable()

    println(s?.length)

    var l = asList("a", "b")
    println(l)
    val ar = arrayOf("c", "d")
    l = asList("a", "b", *ar)// 既に配列として持ってるものを渡す場合、* で展開する
    println(l)

    val u = User("test")
    println(u.name)
    println(u.age)

    val u2 = User("test", "hoge")
    println(u.name)

    val r = Rational(1, 2)
    println(r)
    //    val r2 = Rational(1, 0)
//    println(r)
    val r2 = Rational(4, 2)
    println(r2)
    println(r.plus(r2))
    println(r + r2)
    println(r + 2)
    println(2 + r)

//    val ll: Int = 10L // 暗黙型変換はできない
    val ii: Int = (10 * 10.2).toInt() // 明示的に変換する必要がある
    println(ii)
    println(2 * 10.5)

    println("test"[0]) // extensionでStringにoperator fun getとか定義してるからできるのかなー

    val aaa = "hoge"
    println("""
test $aaa
test $aaa
    """)
    println("""
        |test $aaa
        |test $aaa
    """.trimMargin())
    println("""
        *test $aaa
        *test $aaa
    """.trimMargin("*"))

    println("""
test $aaa
test $aaa
    """.javaClass)


    val list1 = listOf("a", "b")
    println(list1[0])

    val ml: MutableList<String> = mutableListOf("a", "b")
    ml[0] = "c" // ml.set(0, "c")
    println(ml[0])
    ml += "d" // plusAssign
    println(ml)
    ml -= "d" // minusAssign
    println(ml)

    val map2 = mutableMapOf("a" to 1, "b" to 2) // value to value でPairの生成
    println(map2)
    println(map2["a"])
    map2 += "c" to 3
    println(map2)

    // TripleからQuartetを作る拡張関数がなければの出力例
    println(("b" to 2 to 2 to 1)) // (((b, 2), 2), 1)
    println(("b" to 2 to 2 to 1).javaClass) // class kotlin.Pair

    // infix fun <A, B, C> Pair<A, B>.to(that: C): Triple<A, B, C> = Triple(this.first, this.second, that)
    println(("b" to 2 to 2))
    println(("b" to 2 to 2).javaClass)

    // infix fun <A, B, C, D> Triple<A, B, C>.to(that: D): Quartet<A, B, C, D> = Quartet(this.first, this.second, this.third, that)
    println(("b" to 2 to 2 to 10L))
    println(("b" to 2 to 2 to 10L).javaClass)

    // infix fun <A, B, C, D, E> Quartet<A, B, C, D>.to(that: E): Quintet<A, B, C, D, E> = Quintet(this.first, this.second, this.third, this.fourth, that)
    println(("b" to 2 to 2 to 10L to "D"))
    println(("b" to 2 to 2 to 10L to "D").javaClass)

    // range
    println(5 in 1..10)
    val range: IntRange = 1..10
    val cRange = 'a'..'z'
    val lRange = 10L..100L
    println(5 in range)
    println(5 !in range)

    println((1..5).toList())
    println((5 downTo 1).toList()) // [5, 4, 3, 2, 1]
    println((1..5 step 2).toList())
    println((100 downTo 0 step 25).toList()) // [100, 75, 50, 25, 0]

    testFun()
    testFun("test")
    testFun("test", intV = 9)
    testFun(value = false)

    TestAction().jump()
    TestAction().run()
    TestAction().run() {
        println("run run")
    }

    println(test.Event().value)
    // test.Event().value = 2

}

infix fun <A, B, C> Pair<A, B>.to(that: C): Triple<A, B, C> = Triple(this.first, this.second, that)

infix fun <A, B, C, D> Triple<A, B, C>.to(that: D): Quartet<A, B, C, D> = Quartet(this.first, this.second, this.third, that)

// vararg 可変長引数
fun <T> asList(vararg t: T): List<T> {
    val r = t.toList()
    return r
}

fun hogehoge(): Int {
    return 2
}

fun getNullable(): String? {
    return null
}

fun testFun(test: String = "", value: Boolean = true, intV: Int = 1) {
    println(test)
    println(value)
    println(intV)
}

// Default valueがあれば、型指定しなくてもいいかなーと思ったけどダメだった
//fun test(test: String = "") {
//
//}

fun getStringLength(str: String = ""): Int {
    return str.length
}