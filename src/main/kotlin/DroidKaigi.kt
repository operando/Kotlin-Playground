import java.time.LocalDate
import java.time.LocalDateTime
import kotlin.reflect.KProperty

class DroidKaigi(val now: LocalDateTime) {
    var status: String by Shimekiri(now)
}

class Shimekiri(val now: LocalDateTime) {

    val kaisai = LocalDate.of(2016, 3, 9).atTime(0, 0)
    var status: String = "やばい"

    operator fun setValue(droidKaigi: DroidKaigi, property: KProperty<*>, s: String) {

    }

    operator fun getValue(droidKaigi: DroidKaigi, property: KProperty<*>): String {
        return status
    }
}