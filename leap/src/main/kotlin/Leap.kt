data class Year(val year: Int) {
    val mYear: Int = year
    val isLeap: Boolean =
        if ((mYear % 4 == 0 && mYear % 100 != 0) || mYear % 400 == 0) {
            true
        } else {
            false
        }
}
