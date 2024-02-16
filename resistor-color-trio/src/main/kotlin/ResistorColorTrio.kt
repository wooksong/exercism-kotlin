object ResistorColorTrio {

    fun text(vararg input: Color): String {
        var resistorVal: Int = 0

        if (input.size < 3) throw IllegalArgumentException("at least three colors are required")

        resistorVal = input[0].ordinal * 10 + input[1].ordinal
        for (i in 0 until input[2].ordinal) {
            resistorVal *= 10
        }

        var unit: Int = 0
        while ((resistorVal / 1000) > 0) {
            resistorVal /= 1000
            unit++
        }

        return resistorVal.toString() + " " + Unit.values()[unit].toString().lowercase()
    }
}
