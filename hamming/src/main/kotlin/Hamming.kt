object Hamming {
    fun compute(leftStrand: String, rightStrand: String): Int {
        var ret: Int = 0

        if (leftStrand.length != rightStrand.length)
            throw IllegalArgumentException("left and right strands must be of equal length")

        for (i in leftStrand.indices) {
            if (leftStrand[i] != rightStrand[i]) ret++
        }

        return ret
    }
}
