@file:JvmName("SaSasSa")

// Javaからみた場合にどういうクラス名にするかを決められる

package test

import java.io.IOException

class Sample {
    @JvmField val id = 0 // propertyをJavaのInstance Fieldsととして見えるようにする

    companion object {
        @JvmField
        var LIST = listOf("")
    }

    @JvmOverloads fun humuhumu(i: Int = 0, s: String = "humuhumu") {
        println("i = $i,s = $s")
    }

    @Throws(IOException::class)
    fun okooko() {
        throw IOException()
    }

    fun nullnullnull(s: String) {
        println(s)
    }

    fun nullnullnullnull(s: String?) {
        s?.let { println(it) }
    }

    fun emptyList(): List<Nothing> = listOf()
}

fun test() {
}

object Obj {
    const val CONST = 1
}

class C {
    companion object {
        const val VERSION = 9

        @JvmField
        var LIST = listOf("")

        @JvmStatic fun cccccccc() {
            println("cccccccc")
        }
    }
}

const val MAX = 239