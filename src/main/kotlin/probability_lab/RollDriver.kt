package probability_lab
import mu.KLogging
import org.slf4j.LoggerFactory

/**
 * Created by mdb on 1/21/18.
 *
 *
 */


class LogHelper{
    companion object : KLogging()
    fun logSomething(str:String){
        logger.info(str)
    }
}




//val logger = LoggerFactory.getLogger()
fun main(args:Array<String>){
   val logger: LogHelper = LogHelper()
   val die:Die = Die(6)
    for( i in 1..10){
        logger.logSomething(die.roll().toString())
    }
}