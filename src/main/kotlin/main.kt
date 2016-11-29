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
}

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

fun getStringLength(str: String = ""): Int {
    return str.length
}