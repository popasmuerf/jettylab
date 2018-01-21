package testlab;

import junit.framework.TestCase;

/**
 * Created by mdb on 1/18/18.
 *
 * Fixtures :
 * Fixed state of a set of objects used as a baseline for
 * running tests.  The purpose of a test fixture
 * is to ensure that there is a well-known and fixed
 * enviroment in which tests ae run so that rsults are
 * repeatable.  It includes:
 *
 *  - setUp(): which runs before every test invocation
 *  - tearDown(): which runs after every test method
 *
 *
 *
 *
 *
 */
public class JavaTest extends TestCase {
    protected int value1, value2 ;
    //assigning the values
    protected void setUp(){
        value1 = 3 ;
        value2 = 3 ;
    }
    public void testAdd(){
        double result = value1 + value2 ;
        assertTrue(result == 6 );
    }
}
