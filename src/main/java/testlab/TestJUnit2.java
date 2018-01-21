package testlab;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mdb on 1/18/18.
 */
public class TestJUnit2 {
    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);
    @Test
    public void testSaultationMessage(){
        System.out.println("Inside testSalutationMessage()");
        message = "Hi! " + "Robert";
        assertEquals(message,messageUtil.salutationMessage());
    }
}
