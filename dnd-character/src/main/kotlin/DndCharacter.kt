import kotlin.math.floor
import kotlin.random.Random

class DndCharacter {
    val strength: Int
    val dexterity: Int
    val constitution: Int
    val intelligence: Int
    val wisdom: Int
    val charisma: Int
    val hitpoints: Int

    init {
        strength = ability()
        dexterity = ability()
        constitution = ability()
        intelligence = ability()
        wisdom = ability()
        charisma = ability()
        hitpoints = 10 + modifier(constitution)
    }

    companion object {

        fun ability(): Int {
            var sum: Int = 0
            var min: Int = Int.MAX_VALUE

            for (i in 0..3) {
                var each: Int = Random.nextInt(from = 1, until = 7)
                min =
                    if (min > each) {
                        each
                    } else {
                        min
                    }
                sum += each
            }

            return sum - min
        }

        fun modifier(score: Int): Int {
            return floor((score - 10).toDouble() / 2.toDouble()).toInt()
        }
    }
}
