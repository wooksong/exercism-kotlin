import kotlin.math.pow
import kotlin.math.sqrt

object Darts {
    fun score(x: Any, y: Any): Int {
        val rIn: Double = 1.0
        val rMid: Double = 5.0
        val rOut: Double = 10.0

        var dx: Double = x.toString().toDouble()
        var dy: Double = y.toString().toDouble()
        var dr = sqrt(dx.pow(2.0) + dy.pow(2.0))

        when {
            dr <= rIn -> return 10
            dr <= rMid -> return 5
            dr <= rOut -> return 1
            else -> return 0
        }

        return 0
    }
}
