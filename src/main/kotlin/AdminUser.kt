class AdminUser(name: String) : User(name) {

    override val name: String
        get() = name.toUpperCase()

    override fun up(): String {
        return super.up()
    }
}