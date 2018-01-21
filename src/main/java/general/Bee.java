package general;
import org.slf4j.Logger ;
import org.slf4j.LoggerFactory;
/**
 * Created by mdb on 1/18/18.
 */
public class Bee {
   static  private  Logger logger = LoggerFactory.getLogger(Bee.class);

    public static void getLog(){
        for(int i = 0 ; i <= 10; i++){
            logger.info("log from instance of BAR");
        }
    }


}
