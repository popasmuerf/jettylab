package testlab;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
/**
 * Created by mdb on 1/18/18.
 */
public class TestJUnit1 {
    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage(){
        System.out.println("Inside testPrintMessage()");
        assertEquals(message,messageUtil.printMessage());
    }

}
