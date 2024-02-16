object Raindrops {

    fun convert(n: Int): String {
        var rSounds = ""

        when {
            n % (3 * 5 * 7) == 0 -> rSounds += "PlingPlangPlong"
            n % (3 * 5) == 0 -> rSounds += "PlingPlang"
            n % (3 * 7) == 0 -> rSounds += "PlingPlong"
            n % (5 * 7) == 0 -> rSounds += "PlangPlong"
            n % 3 == 0 -> rSounds += "Pling"
            n % 5 == 0 -> rSounds += "Plang"
            n % 7 == 0 -> rSounds += "Plong"
            else -> rSounds = n.toString()
        }

        return rSounds
    }
}
