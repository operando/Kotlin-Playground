/**
 * A tuple of five elements.
 *
 * @param F  first element type
 * @param S  second element type
 * @param T  third element type
 * @param FO fourth element type
 * @param FI five element type
 * @property first First value
 * @property second Second value
 * @property third Third value
 * @property fourth Fourth value
 * @property five Five value
 */
data class Quintet<out F, out S, out T, out FO, out FI>(
        val first: F,
        val second: S,
        val third: T,
        val fourth: FO,
        val five: FI) {

    override fun toString(): String {
        return "Quintet(first=$first, second=$second, third=$third, fourth=$fourth, five=$five)"
    }
}