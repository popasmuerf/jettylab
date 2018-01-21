package probability_lab

import java.security.SecureRandom

/**
 * Created by mdb on 1/20/18.
 */
open class Die(val sides:Int):Rollable<Int>{
    var random:SecureRandom? = null
    init{
        random = SecureRandom()
    }
    override  fun roll() = random!!.nextInt(sides)
}