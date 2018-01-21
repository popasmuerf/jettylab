package logging_lab;;import general.Bar;
import general.Bee;
import general.Foo;

/**
 * Created by mdb on 1/18/18.
 */
public class LogDriver {
    public static void main(String args[]){
        Foo foo = new Foo() ;
        foo.logMethod();
        Bar bar = Bar.getInstance();
        bar.logMethod();
        Bee.getLog();
    }
}
