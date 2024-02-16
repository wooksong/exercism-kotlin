object Transpose {
    fun transpose(input: List<String>): List<String> {
        var longest = input.maxByOrNull { it -> it.length }
        if (longest == null) return listOf<String>()

        var transposed = MutableList<String>(longest.length) { "" }

        for (idx in 0 until longest.length) {
            for (eachLine in input) {
                var c: Char = eachLine.getOrElse(idx) { '_' }

                transposed[idx] += c.toString()
            }
        }

        for (idx in 0 until transposed.size) {
            transposed[idx] = (transposed[idx].trimEnd('_').replace('_', ' '))
        }

        return transposed
    }
}
