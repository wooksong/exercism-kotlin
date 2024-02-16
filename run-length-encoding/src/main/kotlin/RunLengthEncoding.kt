object RunLengthEncoding {

    fun encode(input: String): String {
        if (input.length == 0) return input

        val listCntLetter: ArrayList<Pair<Int, Char>> = ArrayList<Pair<Int, Char>>()
        var ret: String = ""
        var c: Char = input[0]
        var cnt: Int = 1

        for (i in 1 until input.length) {
            if (c != input[i]) {
                listCntLetter.add(Pair(cnt, c))
                cnt = 1
                c = input[i]
                continue
            }
            cnt++
        }

        listCntLetter.add(Pair(cnt, c))

        listCntLetter.forEach { (i, j) ->
            if (i != 1) {
                ret += i.toString()
            }

            ret += j.toString()
        }
        return ret
    }

    fun decode(input: String): String {
        val listCntLetter: ArrayList<Pair<Int, Char>> = ArrayList<Pair<Int, Char>>()
        var tmp: String = ""

        if (input.length == 0) return input

        for (c in input) {
            if (c.isDigit()) {
                tmp += c
                continue
            }

            listCntLetter.add(
                Pair(
                    if (tmp.isEmpty()) {
                        1
                    } else {
                        tmp.toInt()
                    },
                    c
                )
            )
            tmp = ""
        }

        tmp = ""
        listCntLetter.forEach { (n, c) ->
            for (i in 0 until n) {
                tmp += c
            }
        }

        return tmp
    }
}
