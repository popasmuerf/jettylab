package general;
/**
 * Created by mdb on 1/18/18.
 */

import org.slf4j.Logger ;
import org.slf4j.LoggerFactory;

public class Foo  {
    Logger logger = null ;
    public Foo(){
       logger = LoggerFactory.getLogger(this.getClass());
       logger.info("log from instance of FOO");
   }

   public void logMethod(){
       for(int i = 0 ; i <= 10; i++){
           logger.info("log from instance of FOO");
       }
   }

}
