object Acronym {
    fun generate(phrase: String): String {
        var ret: String = ""
        var words = phrase.split(" ", "-", "_")

        for (word in words) {
            if (word.isNullOrBlank()) {
                continue
            }

            var letter: Char = word[0]

            if (letter.isLetter()) {
                ret += letter.uppercase()
            }
        }

        return ret
    }
}
