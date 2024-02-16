object Pangram {

    fun isPangram(input: String): Boolean {
        if (input.length < 26) return false

        var lowercaseStr: String = input.lowercase()

        for (c in 'a'..'z') {
            if (!lowercaseStr.contains(c)) {
                return false
            }
        }

        return true
    }
}
