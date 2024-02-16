class Squares(var num: Int) {
    var sum_of_squares: Int = 0
    var square_of_sum: Int = 0

    fun sumOfSquares(): Int {
        for (i in 1.rangeTo(num)) {
            sum_of_squares += (i * i)
        }

        return sum_of_squares
    }

    fun squareOfSum(): Int {
        var sum: Int = 0

        for (i in 1.rangeTo(num)) {
            sum += i
        }

        square_of_sum = (sum * sum)
        return square_of_sum
    }

    fun difference(): Int {
        return squareOfSum() - sumOfSquares()
    }
}
