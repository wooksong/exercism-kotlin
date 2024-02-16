object Yacht {

    fun solve(category: YachtCategory, vararg dices: Int): Int {
        val counts = arrayListOf<Int>(-1)
        val nFaces: Int = 6
        val nRolls: Int = 5

        (1..nFaces).forEach { counts.add(0) }
        for (v in dices) {
            counts[v]++
        }

        return 0
    }
}
