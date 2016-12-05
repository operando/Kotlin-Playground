class Nest {

    private val a = "a"

    class Test {
        fun test() = "test"

        fun test2(): String {
            // メソッドの中でクラス定義もできる
            class Test3(val s: String) {
            }
            Test3("test").s

            // メソッドもネストしてローカル関数として定義できる
            fun test3(s: String): String {
                return s + " test3"
            }

            return test3("test2")
        }
    }

    // innerをつけると内部クラス
    inner class Test2 {
        fun test() = a
    }
}