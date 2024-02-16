object ResistorColorDuo {

    fun value(vararg colors: Color): Int {
        if (colors.size < 2) throw IllegalArgumentException("at least two colors are required")

        return colors[0].ordinal * 10 + colors[1].ordinal
    }
}
