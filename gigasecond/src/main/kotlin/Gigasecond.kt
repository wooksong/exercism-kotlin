import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond {
    val gsec: Long = 1000000000
    var date: LocalDateTime

    constructor(now_date: LocalDate) {
        date = now_date.atStartOfDay().plusSeconds(gsec)
    }

    constructor(now_date_time: LocalDateTime) {
        date = now_date_time.plusSeconds(gsec)
    }
}
