object ScrabbleScore {
    val scoreMap =
        mapOf<Char, Int>(
            Pair('A', 1),
            Pair('E', 1),
            Pair('I', 1),
            Pair('O', 1),
            Pair('U', 1),
            Pair('L', 1),
            Pair('N', 1),
            Pair('R', 1),
            Pair('S', 1),
            Pair('T', 1),
            Pair('D', 2),
            Pair('G', 2),
            Pair('B', 3),
            Pair('C', 3),
            Pair('M', 3),
            Pair('P', 3),
            Pair('F', 4),
            Pair('H', 4),
            Pair('V', 4),
            Pair('W', 4),
            Pair('Y', 4),
            Pair('K', 5),
            Pair('J', 8),
            Pair('X', 8),
            Pair('Q', 10),
            Pair('Z', 10),
        )

    fun scoreLetter(c: Char): Int {
        return scoreMap.getValue(c)
    }

    fun scoreWord(word: String): Int {
        var score: Int = 0

        for (i in word.indices) {
            score += scoreLetter(word[i].uppercase().first())
        }

        return score
    }
}
