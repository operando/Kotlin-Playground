import java.util.concurrent.atomic.DoubleAccumulator

class MyIterator {
    var i = 0
    operator fun hasNext(): Boolean = i++ < 5
    operator fun next(): String = "next"
}

class MyIterable {
    operator fun iterator() = MyIterator()
}

fun sumsum(numbers: List<Long>): Long = if (numbers.isEmpty()) 0 else numbers.first() + sum(numbers.drop(1))

tailrec fun sum(numbers: List<Long>, accumulator: Long = 0): Long = if (numbers.isEmpty()) accumulator else sum(numbers.drop(1), accumulator + numbers.first())

fun sum(numbers: List<Long>): Long {
    tailrec fun go(numbers: List<Long>, accumulator: Long): Long = if (numbers.isEmpty()) accumulator else sum(numbers.drop(1), accumulator + numbers.first())
    return go(numbers, 0)
}

