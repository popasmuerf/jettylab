package testlab;

import org.junit.Test;
import static org.junit.Assert.assertEquals ;
/**
 * Created by mdb on 1/17/18.
 */
public class TestJUnit {
    String str = "Hello World";
    MessageUtil messageUtil = new MessageUtil(str);

    @Test
    public void testPrintMessage() {
        String str = "fuck dat";
        assertEquals(str,messageUtil.printMessage());
    }

}
