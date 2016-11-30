class Rational(val n: Int, val d: Int) {
    init {
        require(d != 0, { "d must not be null" })
    }

    private val g by lazy { gcd(Math.abs(n), Math.abs(d)) }

    val nu: Int by lazy { n / g }
    val de by lazy { d / g }

    operator fun plus(than: Rational): Rational {
        return Rational(nu * than.de + than.nu * de, de + than.de)
    }

    operator fun plus(n: Int): Rational {
        return Rational(nu + n * de, de)
    }

    override fun toString(): String = "$nu/$de"
    tailrec private fun gcd(a: Int, b: Int): Int =
            if (b == 0) a
            else gcd(b, a % b)
}

// extension function
operator fun Int.plus(r: Rational): Rational = r + this