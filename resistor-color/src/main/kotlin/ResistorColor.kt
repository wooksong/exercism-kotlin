object ResistorColor {
    val colorCodeArray =
        arrayOf<String>(
            "black",
            "brown",
            "red",
            "orange",
            "yellow",
            "green",
            "blue",
            "violet",
            "grey",
            "white"
        )

    fun colorCode(input: String): Int {
        return colorCodeArray.indexOf(input)
    }

    fun colors(): List<String> {
        return colorCodeArray.toList()
    }
}
