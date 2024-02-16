import kotlin.math.ceil
import kotlin.math.sqrt

object CryptoSquare {

    fun ciphertext(plaintext: String): String {
        var normedText: String = plaintext.lowercase().filter { it.isLetterOrDigit() }
        val len: Int = normedText.length
        var cLimit: Int = ceil(sqrt(len.toDouble())).toInt()
        var c: Int = 0
        var r: Int = 0

        if (len == 0) return normedText

        for (i in 1..cLimit) {
            for (j in 0..1) {
                if ((i * (i - j)) >= len) {
                    r = i - j
                    c = i
                }
            }
        }

        var chunkedText = normedText.chunked(c)
        var tmp = MutableList<String>(c) { "" }

        for (i in 0 until c) {
            for (j in 0 until r) {
                var word = chunkedText.get(j)

                tmp[i] += word.getOrElse(i) { '_' }.toString()
            }
        }

        var ret: String = ""
        tmp.forEach {
            ret += it
            ret += " "
        }
        return ret.trimEnd().replace('_', ' ')
    }
}
