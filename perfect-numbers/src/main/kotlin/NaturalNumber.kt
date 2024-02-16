enum class Classification {
    DEFICIENT,
    PERFECT,
    ABUNDANT
}

fun classify(naturalNumber: Int): Classification {
    var sum: Int = 0

    if (naturalNumber <= 0) throw RuntimeException("A non-natural number is given.")

    for (i in 1 until naturalNumber) {
        if (naturalNumber % i == 0) {
            sum += i
        }
    }

    when {
        sum == naturalNumber -> return Classification.PERFECT
        sum > naturalNumber -> return Classification.ABUNDANT
        else -> return Classification.DEFICIENT
    }
}
