enum class ProtocolState {
    // WAITINGはProtoclStateを継承してsignal()をオーバーライドした無名クラスのインスタンス
    WAITING {
        override fun signal() = TALKING
    },

    TALKING {
        override fun signal() = WAITING
    };

    abstract fun signal(): ProtocolState
}