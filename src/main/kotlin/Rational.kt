class Rational(val n: Int, val d: Int) {
    init {
        require(d != 0, { "d must not be null" })
    }

    private val g = gcd(Math.abs(n), Math.abs(d))

    val nu: Int = n / g
    val de = d / g

    fun plus(than: Rational): Rational {
        return Rational(nu * than.de + than.nu * de, de + than.de)
    }

    override fun toString(): String = "$nu/$de"
    tailrec private fun gcd(a: Int, b: Int): Int =
            if (b == 0) a
            else gcd(b, a % b)
}