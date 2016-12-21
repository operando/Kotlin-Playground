class BucketImpl(override val capacity: Int) : BucketKai {

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