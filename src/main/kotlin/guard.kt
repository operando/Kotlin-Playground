private inline fun <T> T?.guard(ifNull: () -> T): T = this ?: ifNull()

fun aaa(thing: String?): String? {
    val notNullThing = thing.guard { null }
    return notNullThing
    // notNullThing.length
    // val a = thing.guard2 { return }
}

fun aaaaaaaaa(): String = "hogehoge"

fun aaaaaaaaa2(): Int = 1