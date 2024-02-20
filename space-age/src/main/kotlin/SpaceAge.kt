class SpaceAge {
    var dSec: Double

    constructor(iSec: Int) {
        dSec = iSec.toDouble()
    }

    fun onEarth(): Double = dSec / 31557600

    fun onMercury(): Double = onEarth() / 0.2408467

    fun onVenus(): Double = onEarth() / 0.61519726

    fun onMars(): Double = onEarth() / 1.8808158

    fun onJupiter(): Double = onEarth() / 11.862615

    fun onSaturn(): Double = onEarth() / 29.447498

    fun onUranus(): Double = onEarth() / 84.016846

    fun onNeptune(): Double = onEarth() / 164.79132
}
