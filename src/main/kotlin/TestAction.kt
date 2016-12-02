class TestAction : Action {
    override val prop: Int = 1

    override val name: String
        get() = super.name + " test"

    override fun jump() {
        println("TestAction jump")
    }
}