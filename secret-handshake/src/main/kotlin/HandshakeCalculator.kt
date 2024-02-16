object HandshakeCalculator {
    fun calculateHandshake(number: Int): List<Signal> {
        var Sig: Int = 0b1
        var Signals = listOf<Signal>()

        for (i in 0..4) {
            if (number.and(Sig) != 0) {
                when (Sig) {
                    1 -> Signals += Signal.WINK
                    2 -> Signals += Signal.DOUBLE_BLINK
                    4 -> Signals += Signal.CLOSE_YOUR_EYES
                    8 -> Signals += Signal.JUMP
                    else -> {
                        Signals = Signals.reversed()
                    }
                }
            }
            Sig = Sig.shl(1)
        }

        println("Sig = ${Sig}")
        return Signals
    }
}
