package test

// 何もつかないとpublic
class Event {

    // 値の参照はできるが、setterはこのファイル内からしかできない
    var value = 0
        private set

    internal val name = "test"

    private fun test() {
        value = 10
    }
}