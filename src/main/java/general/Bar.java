package general;
import org.slf4j.Logger ;
import org.slf4j.LoggerFactory;
/**
 * Created by mdb on 1/18/18.
 */
public class Bar {
    private static final Bar instance = new Bar() ;
    private  Logger logger ;
    private Bar(){
        logger = LoggerFactory.getLogger(this.getClass());
        logger.info("log from instance of Bar");
    }

    public static Bar getInstance(){
        return instance ;
    }
    public void logMethod(){
        for(int i = 0 ; i <= 10; i++){
            logger.info("log from instance of BAR");
        }
    }
}
