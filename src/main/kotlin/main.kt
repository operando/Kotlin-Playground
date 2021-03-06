import test.*
import java.time.LocalDateTime
import java.util.*
import test.HumHum as Hum

fun main(args: Array<String>) {
    println("kotlin")

    val list = listOf(1, 2, 3, 90, 999)
    list.forEach(::println)

    list.map(Int::toString).map(String::length).forEach(::println)

    for (item in list) {
        println(item)
    }

    for (i in list.indices) {
        println(list[i])
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

    println(Event().value)
    // test.Event().value = 2

    println(Nest.Test().test())
    println(Nest.Test().test2())
    println(Nest().Test2().test())

    println(Status.CLOSE)

    println(Color.RED.rgb)
    println(Color.RED.name)
    println(Color.RED.ordinal)

    val new = TaskStatus.New(0)
    val run = TaskStatus.Running(0, "test")
    val close = TaskStatus.Close(0, true)
    val none = TaskStatus.None

    println(states(new))
    println(states(run))
    println(states(close))
    println(states(none))

    println()

    val (a1, b1, c1, d1) = ("a" to "b" to "c" to "d")
    println(a1)
    println(b1)
    println(c1)
    println(d1)

    for ((a2, b2, c2, d2) in listOf(("a" to "b" to "c" to "d"), ("aa" to "bb" to "cc" to "dd"))) {
        println(a2)
        println(b2)
        println(c2)
        println(d2)
    }

    for ((key, value) in mapOf("key1" to "value1", "key2" to "value2")) {
        println(key)
        println(value)
    }

    val (ss, i) = hoge()
    println(ss)
    println(i)

    DataProviderManager.test()

    TestActivity.createIntent()
    println(TestActivity.a)
    println(TestActivity.RESULT_OK)
    println(RESULT_OK)
    TestActivity.test()

    println(listOf(1, 2, 3).last)
    println(listOf(1, 2, 3).first)

    val i1 = 1
    val i2 = 5
    println(i1 max i2)

    fun fun1() = fun() {
        println("huhu")
    }
    huhu(fun1())
    huhu(fun() {
        println("huhu")
    })
    huhu {
        println("huhu")
    }

    println(huhu2(fun(): String {
        return "hogehoge"
    }))
    println(huhu2 {
        "test"
    })

    println(huhu3(1, fun(a: Int): String {
        return a.toString()
    }))

    println(huhu3(1) { koko ->
        koko.toString()
    })

    hello {
        world()
        world()
    }

    val bbbb = BaseImpl(10)
    val dd = Derived(bbbb)
    dd.println() // 10
    println(dd.hoho("test"))
    dd.mmmmmm()

    val u3 = User("test")
    println(u3.name)
    println(u3.age)
    println(u3.language.code)

    println(DroidKaigi(LocalDateTime.now()).status)
    DroidKaigi(LocalDateTime.now()).status = ""

    val iii = 0
//    val sss = iii as String
//    val sss = iii as String?
//    val sss = null as String?
    val sss: String? = iii as? String
    println(sss)

    momomomo(Mooo())
    println(hunhunhun(Hunga()))

    val ints: Array<Int> = arrayOf(1, 2, 3)
    val nums: Array<*> = ints
    val jjjjj: Any? = nums.get(0)
    println(jjjjj)

    val calendar = Calendar.getInstance()
    val cccc = calendar.clear()
    println(cccc.toString())
    if (calendar.firstDayOfWeek == Calendar.SUNDAY) {  // getFirstDayOfWeek()を呼ぶ
        calendar.firstDayOfWeek = Calendar.MONDAY        // setFirstDayOfWeek()を呼ぶ
    }

    JavaJava().`is`()

    var hunhunhunhun: String = "abc"
//    hunhunhunhun = null // compilation error
    println(hunhunhunhun.length)

    var hunhunhunhun2: String? = "abc"
    hunhunhunhun2 = null // OK
//    println(hunhunhunhun2.length) // compilation error
    println(if (hunhunhunhun2 != null) hunhunhunhun2.length else -1)
//    println(hunhunhunhun2!!.length)

//    println(hunhunhunhun2?.length ?: throw Exception("hunhunhunhun2 is null."))
    val len: Int? = hunhunhunhun2?.length
    println(len)

    val len2: Int? = hunhunhunhun2?.length?.toInt()
    println(len2)

    val listWithNulls: List<String?> = listOf("A", null)
    for (item in listWithNulls) {
        item?.let { println(it) } // prints A and ignores null
    }

    val nullableList: List<Int?> = listOf(1, 2, null, 4)
    val intList: List<Int> = nullableList.filterNotNull()
    println(intList)

    run()

    Main.main(null)

    for (item in MyIterable()) {
        println(item)
    }

    println(sum((1L..10000).toList()))

    val result = (1..20).toList()
            .filter { it % 2 == 0 }
            .map { Int::toString }
            .take(5)
    println(result)

    val strstr = with(StringBuilder()) {
        append("test")
        append("hunhun")
        toString()
    }
    println(strstr)

    println(::mumu)
    // 関数オブジェクト
    val mumu = ::mumu
    // 関数オブジェクトの型
    // (引数の型) -> 戻り値の型
    val mumu2: (Int) -> Int = ::mumu
    println(mumu(2))

    println(firstK("aaaKaaa"))
    println(firstUpperCase("aaaAaaa"))

    println(firstK2("aaaKaaa"))
    println(firstUpperCase2("aaaAaaa"))

    // lambda式
    // 関数オブジェクトを直接生成する
    val jijijiji: (Int) -> Int = { i: Int ->
        i * i
    }
    println(jijijiji(2))

    val jijijiji2 = { i: Int ->
        i * i
    }
    println(jijijiji2(2))

    // 引数が1つの場合、itを使える
    val jijijiji3: (Int) -> Int = {
        it * it
    }
    println(jijijiji3(2))

    val counter = getCounter()
    println(counter())
    println(counter())
    println(counter())
    println(counter())

    var sum = 0
    (1..10).forEach {
        sum += it
    }
    println(sum)

    log { "debug log" }
    log(false) { "debug log" }

//    crash { throw Exception() }

    containsDigit("aaaaa")
    containsDigit("aaa1aa")

    containsDigit2("aaaaa")
    containsDigit2("aa1aaa")

    val bucket1 = createBucket(7)
    val bucket2 = createBucket(4)

    bucket1.fill()
    bucket1.pourTo(bucket2)
    println(bucket1.getQuantity())
    println(bucket2.getQuantity())

    val bucketKai1 = createBucketKai(7)
    val bucketKai2 = createBucketKai(4)

    bucketKai1.fill()
    bucketKai1.pourTo(bucketKai2)
    println(bucketKai1.quantity)
    println(bucketKai2.quantity)

    val bucketImpl1 = BucketImpl(7)
    val bucketImpl2 = BucketImpl(4)

    bucketImpl1.fill()
    bucketImpl1.pourTo(bucketImpl2)
    println(bucketImpl1.quantity)
    println(bucketImpl2.quantity)

    val p = Person("kotlin")
//    println(p.humuhumu) // kotlin.UninitializedPropertyAccessException: lateinit property humuhumu has not been initialized
    p.humuhumu = "humuhumu"
    println(p.humuhumu)

    val rk = RationalKai(5)
    println(rk.n / rk.d)

    println("Kotlin Kotlin Kotlin!!".countWords())
    println("Kotlin Kotlin Kotlin!!".countWords)

    val stu = Student("kotlin", 1L)
    stu.introduce()
    stu.age = 10
    println(stu.age)

    val p2: Person = Student("kotlin", 1L)
    p2.introduce()

    val en = EnglishGreeter("kotlin", 10)
    val ja = JapaneseGreeter("kotlin", 21)

    en.sayHello()
    ja.sayHello()

    // import test.HumHum as Hum
    val hum = Hum()

    val gr = GreeterWithRecording(JapaneseGreeterKai())
    gr.sayHello("test")
    gr.sayHello()
    gr.sayHello("kotlin")
    println(gr.targets)

    // 型推論できる場合は、ダイヤモンド演算子不要
    Container("test")
    Container(10)

    show(Container5("test"))
    show(Container5(10))

    val c5: Container5<Number> = Container5(10)
    val c52: Container5<*> = Container5(10)
    c52.value.toString() // Any?型になる
    Container5(10).copyTo(c5)
    show(c5)

    val c6: Container6<Number> = Container6(10)
    show6(c6)

    println("".instanceOf<String>())
    println("".instanceOf<Int>())

    val iiii = 127
    val iiii2 = iiii
    println(iiii === iiii2)
    println(iiii !== iiii2)
    println(listOf("test") === listOf("test"))

    // a?.equals(b) ?: (b === null)
    val sssss: String? = null
    val sssss2: String? = null
    println(sssss == sssss2)

    val sssss3: String? = "test"
    println(sssss == sssss3)

    val sssss4: String? = "test"
    println(sssss4 == sssss3)

    println(mapOf(1 to "test", 2 to "mugemuge")
            .mapValues {
                val (k, v) = it
                "$k -> $v"
            })

    // 1.1から
    println(mapOf(1 to "test", 2 to "mugemuge").mapValues { (k, v) -> "$k -> $v" })

    // 1.1から
    // Underscores for unused parameters
    // 使用しない変数名を_で定義する
    mapOf(1 to "test", 2 to "mugemuge")
            .forEach { _, v -> println(v) }

    // works in destructuring declarations
    val (_, v) = returnPair()
    println(v)


    // Local delegated properties
    // 以下は定義しても変数にアクセスされるまで遅延する
//    val gamugamu by lazy {
//        println("gamugamu")
//        100
//    }
//
//    if (true) {
//        println("true")
//        println("p $gamugamu")
//    } else {
//        println("no")
//    }

    listOf(1, 3, 4)
            .forEach(::println)

    println(User("test").height(100))
    println(User("test").height2("100"))

//    val list__ : List<Int> = (0..5).toList()
    val list__: List<Int> = (0..6).toList()
    // val result__: List<List<Int>> = list__.chunked(3)
    // val result___: List<List<Int>> = list__.chunked(3) { it.average() }
    // println(result__)
    // println(result___)
}

fun returnPair(): Pair<Int, String> {
    return 1 to "test"
}

// inline + reified
inline fun <reified T> Any.instanceOf(): Boolean = this is T

fun show(container5: Container5<out Any>) {
    println(container5.toString())
    println(container5.hashCode())
    println(container5.value)
}

fun show6(container6: Container6<Any>) {
    println(container6.toString())
    println(container6.hashCode())
    println(container6.value)
}

interface Homu {
    val homu1: Int
    var homu: Int
    fun homu()
}

interface Humu : Homu {
    // interface内のプロパティは値を持てない(バッキングフィールドを持てない)
    // 他のinterfaceが持つプロパティをoverrideしても、返せるのは固定値 or 他のプロパティ
    override val homu1: Int
        get() = 0

    fun humu()
}

fun String.countWords(): Int = split("""\s+""".toRegex()).size

// 拡張プロパティ
// バッキングフィールドは持てない
val String.countWords: Int
    get() = split("""\s+""".toRegex()).size

interface Bucket {
    fun fill()
    fun drainAway()
    fun pourTo(that: Bucket)

    fun getCapacity(): Int
    fun getQuantity(): Int
    fun setQuantity(quantity: Int)
}

interface BucketKai {
    fun fill()
    fun drainAway()
    fun pourTo(that: BucketKai)

    // interfaceはプロパティを持てる
    // プロパティはオブジェクトの内部にあるものではなく、境界にあるもの
    // 変数のように見えるが、実際のデータの持ち方は規定しない
    // 実装するオブジェクトの実装次第になる
    val capacity: Int
    var quantity: Int
}

fun createBucket(capacity: Int): Bucket = object : Bucket {

    //
//        val capacity: Int = 5
    var _quantity = 0

    override fun fill() {
        setQuantity(getCapacity())
    }

    override fun drainAway() {
        setQuantity(0)
    }

    override fun pourTo(that: Bucket) {
        val thatVacuity = that.getCapacity() - that.getQuantity()
        if (getQuantity() <= thatVacuity) {
            that.setQuantity(that.getQuantity() + getQuantity())
            drainAway()
        } else {
            that.fill()
            setQuantity(getQuantity() - thatVacuity)
        }
    }

    override fun getCapacity(): Int {
        return capacity
    }

    override fun getQuantity(): Int {
        return _quantity
    }

    override fun setQuantity(quantity: Int) {
        _quantity = quantity
    }
}

fun createBucketKai(_capacity: Int): BucketKai = object : BucketKai {

    // プロパティにもoverrideがつく
    override val capacity = _capacity

    // プロパティは必ず初期化しないといけない
    override var quantity = 0

    override fun fill() {
        quantity = capacity
    }

    override fun drainAway() {
        quantity = 0
    }

    override fun pourTo(that: BucketKai) {
        val thatVacuity = that.capacity - that.quantity
        if (quantity <= thatVacuity) {
            that.quantity = quantity
            drainAway()
        } else {
            that.fill()
            quantity -= thatVacuity
        }
    }
}


// インライン関数
// 引数の関数オブジェクトがコンパイル時にインライン展開される
inline fun log(debug: Boolean = true, message: () -> String) {
    // 単にStringの引数を受け取るのではなく、()-> Stringを受け取る理由は、関数の実行タイミングを遅らせるため
    // 引数 debugがfalseの時、メッセージを出力する必要がない = メッセージを生成する必要がない = 関数が実行されなければメッセージは生成しない
    // メッセージの生成が高コストな時とかに有効
    if (debug) {
        println(message())
    }
}

inline fun stringForEach(str: String, f: (Char) -> Unit) {
    for (c in str) f(c)
}

fun containsDigit(str: String): Boolean {
    stringForEach(str) {
        if (it.isDigit()) {
            println("containsDigit true")
            return true
        }
    }
    println("containsDigit false")
    return false
}

fun containsDigit2(str: String): Boolean {
    var result = false
    stringForEach(str) {
        if (it.isDigit()) {
            result = true
            return@stringForEach
        }
    }
    println("containsDigit $result")
    return result
}

fun containsDigit3(str: String): Boolean {
    var result = false
    stringForEach(str) here@ {
        if (it.isDigit()) {
            result = true
            return@here
        }
    }
    println("containsDigit $result")
    return result
}

inline fun crash(noinline crash: () -> Unit) {
    crash()
}

inline fun getCounter(crossinline next: () -> Int): () -> Int {
    var count = 0

    return {
        // crossinlineにしろよ！ってエラーが出る
        count = next()
        count
    }
}

fun getCounter(): () -> Int {
    var count = 0

    return {
        count++
    }
}

fun firstK(str: String): Int {
    tailrec fun go(str: String, index: Int): Int =
            when {
                str.isEmpty() -> -1
                str.first() == 'K' -> index
                else -> go(str.drop(1), index + 1)
            }
    return go(str, 0)
}

fun firstUpperCase(str: String): Int {
    tailrec fun go(str: String, index: Int): Int =
            when {
                str.isEmpty() -> -1
                str.first().isUpperCase() -> index
                else -> go(str.drop(1), index + 1)
            }
    return go(str, 0)
}

// firstKとfirstUpperCaseの条件部分を関数オブジェクト化
fun first(str: String, predicate: (Char) -> Boolean): Int {
    tailrec fun go(str: String, index: Int): Int =
            when {
                str.isEmpty() -> -1
                predicate(str.first()) -> index
                else -> go(str.drop(1), index + 1)
            }
    return go(str, 0)
}

fun firstK2(str: String): Int {
    fun isK(c: Char): Boolean = c == 'K'
    return first(str, ::isK)
    // 以下のように直で書いてもよい
//    return first(str, fun(c: Char): Boolean = c == 'K')
    // lambda式
//    return first(str, { it == 'K' })
}

fun firstUpperCase2(str: String): Int {
    fun isUpperCase(c: Char): Boolean = c.isUpperCase()
    return first(str, ::isUpperCase)
    // 以下のように直で書いてもよい
//    return first(str, fun(c: Char): Boolean = c.isUpperCase())
    // 以下のように型を省略しても書ける
//    return first(str, fun(c) = c.isUpperCase())
    // 以下のようにも書ける
//    return first(str, Char::isUpperCase)
}

fun mumu(i: Int): Int {
    return i * 2
}

fun momomomo(momo: Momo<String>) {
    val mooooooo: CharSequence = momo.momo()
    println(mooooooo)
}

fun hunhunhun(hunhunhun: HunHun<Int>): String {
    return hunhunhun.hunhun(10)
}

class Mooo : Momo<String>() {
    override fun momo(): String {
        return "mooo"
    }
}

class Hunga : HunHun<Int>() {
    override fun hunhun(hunhun: Int): String {
        return hunhun.toString()
    }
}

interface Base {
    fun println()
    fun hoho(a: String): String
}

class BaseImpl(val x: Int) : Base {
    override fun hoho(a: String): String {
        return a.toUpperCase()
    }

    override fun println() {
        println(x)
    }
}

// by を使ってBaseインターフェースの全てのpublicメソッドをbに委譲するよう指定
// DerivedはBaseを継承はしていないけど、委譲してるので呼び出しは継承と同じ感じで呼び出せる
// 所持しているオブジェクトに単に委譲するだけのメソッドを作る必要がなくなる
class Derived(b: Base) : Base by b {
    val a = "aaaaa"

    fun mmmmmm() {
        println(hoho(a))
    }
}


class Hello {
    fun world() {
        println("Hello,world")
    }
}

fun hello(init: Hello.() -> Unit): Hello {
    val h = Hello()
    h.init()
    return h
}

fun huhu(huhu: () -> Unit) {
    huhu()
}

fun huhu2(huhu: () -> String): String {
    return huhu()
}

fun huhu3(i: Int, huhu: (Int) -> String): String {
    return huhu(i)
}

fun hoge(): Pair<String, Int> {
    return ("a" to 1)
}

fun states(taskStatus: TaskStatus): String = when (taskStatus) {
    is TaskStatus.New -> "new"
    is TaskStatus.Running -> "run"
    is TaskStatus.Close -> "close"
    TaskStatus.None -> "none"
}

infix fun <A, B, C> Pair<A, B>.to(that: C): Triple<A, B, C> = Triple(this.first, this.second, that)

infix fun <A, B, C, D> Triple<A, B, C>.to(that: D): Quartet<A, B, C, D> = Quartet(this.first, this.second, this.third, that)

val <T> List<T>.last: T
    get() = this[size - 1]

val <T> List<T>.first: T
    get() = this[0]

fun TestActivity.Companion.test() {
    println("TestActivity.Companion.test")
}

infix fun Int.max(that: Int) = Math.max(this, that)

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