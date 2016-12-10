import kotlin.reflect.KProperty

class Language {

    val code = 1

    operator fun getValue(thisRef: Any?, property: KProperty<*>): Language {
        return Language()
    }
}