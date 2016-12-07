const val RESULT_OK = -1
// const var RESULT_OK = -1 error

// const val a = ("a" to 1)

class TestActivity {

    // static
    companion object {
        const val RESULT_OK = -1

        val a = "test"

        fun createIntent() {
            println("createIntent")
        }
    }
}