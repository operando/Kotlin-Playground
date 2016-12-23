class RationalKai(val n: Int, val d: Int) {
    // secondary　constructor
    constructor(n: Int) : this(n, 1)

    init {
        require(d != 0)
    }
}