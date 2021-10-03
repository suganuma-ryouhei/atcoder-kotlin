import java.time.LocalDateTime

fun main(args: Array<String>) {
    val now = LocalDateTime.now()
    println(now)
    val nowWithHour = now.withHour(21)
    println(nowWithHour)
}
