fun translate(rna: String?): List<String> {
    val exceptionMsg = "Invalid codon"
    var translation = listOf<String>()

    if (rna.isNullOrEmpty()) return translation
    var isIncompleteRNA: Boolean =
        if (rna.length % 3 == 0) {
            false
        } else {
            true
        }

    for (eIdx in 2 until rna.length step 3) {
        var sIdx = eIdx - 2
        var subRNA = rna.substring(sIdx.rangeTo(eIdx))

        when (subRNA) {
            "AUG" -> translation += "Methionine"
            "UUU" -> translation += "Phenylalanine"
            "UUC" -> translation += "Phenylalanine"
            "UUA" -> translation += "Leucine"
            "UUG" -> translation += "Leucine"
            "UCU" -> translation += "Serine"
            "UCC" -> translation += "Serine"
            "UCA" -> translation += "Serine"
            "UCG" -> translation += "Serine"
            "UAU" -> translation += "Tyrosine"
            "UAC" -> translation += "Tyrosine"
            "UGU" -> translation += "Cysteine"
            "UGC" -> translation += "Cysteine"
            "UGG" -> translation += "Tryptophan"
            "UAA" -> return translation
            "UAG" -> return translation
            "UGA" -> return translation
            else -> throw IllegalArgumentException(exceptionMsg)
        }

        sIdx++
    }

    if (isIncompleteRNA) throw IllegalArgumentException(exceptionMsg)
    return translation
}
