import kotlin.math.pow

object ArmstrongNumber {

    fun check(input: Int): Boolean {
        var ndigits: Int = 1
        var num: Int = input
        var sum: Int = 0

        while ((num / 10) > 0) {
            num /= 10
            ndigits++
        }

        num = input

        for (p in ndigits downTo 1) {
            var digit: Int = num % 10

            num /= 10

            sum += digit.toDouble().pow(ndigits).toInt()
        }

        return (sum == input)
    }
}
