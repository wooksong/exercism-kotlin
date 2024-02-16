class CustomSet() {

    var mIntList: ArrayList<Int> = ArrayList<Int>()

    constructor(vararg es: Int) : this() {
        for (e in es) {
            if (mIntList.contains(e)) continue
            mIntList.add(e)
        }
    }

    constructor(alist: ArrayList<Int>) : this() {
        mIntList.addAll(alist)
    }

    fun isEmpty(): Boolean {
        return mIntList.isEmpty()
    }

    fun isSubset(other: CustomSet): Boolean {
        if (mIntList.count() == 0) return true
        if (mIntList.count() > other.mIntList.count()) return false

        mIntList.forEach { i -> if (!other.mIntList.contains(i)) return false }

        return true
    }

    fun isDisjoint(other: CustomSet): Boolean {
        if (mIntList.count() == 0 || other.mIntList.count() == 0) return true
        mIntList.forEach { i -> if (other.mIntList.contains(i)) return false }

        return true
    }

    fun contains(other: Int): Boolean {
        return mIntList.contains(other)
    }

    fun intersection(other: CustomSet): CustomSet {
        var tmp: ArrayList<Int> = ArrayList<Int>()

        mIntList.forEach { i -> if (other.contains(i)) tmp.add(i) }
        return CustomSet(tmp)
    }

    fun add(other: Int) {
        if (!mIntList.contains(other)) mIntList.add(other)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CustomSet) return false
        if (mIntList.count() != other.mIntList.count()) return false

        other.mIntList.forEach { i -> if (!mIntList.contains(i)) return false }

        return true
    }

    operator fun plus(other: CustomSet): CustomSet {
        other.mIntList.forEach { i ->
            if (!mIntList.contains(i)) {
                mIntList.add(i)
            }
        }
        return CustomSet(mIntList)
    }

    operator fun minus(other: CustomSet): CustomSet {
        other.mIntList.forEach { i ->
            if (mIntList.contains(i)) {
                mIntList.remove(i)
            }
        }
        return CustomSet(mIntList)
    }
}
