abstract class Momo<out T> {
    abstract fun momo(): T

    // outなので引数には使えない
//    abstract fun momo(mo: T): T
}