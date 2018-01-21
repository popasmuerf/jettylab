package testlab;

import org.junit.runner.JUnitCore;
 import org.junit.runner.Result;
 import org.junit.runner.notification.Failure ;

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
 *  We use Testrunners to run our individual tests
 *  or Testsuites...etc
 *
 *
 * JUnit Classes:
 *
 * JUNit classes are important classes, used in
 * writing and testing JUnits. som
 * of the important classes are --
 *
 * Assert -- Contains a set of assert methods
 *
 * TestCase -- Contains a test cae that defines
 *             the fixture to run multiple tests
 *
 * TestResult -- Contains methods to collect the results
 *               of executing a test case
 *
 *
 *  org.junit.Assert
 *--------------------------------
 *
 */
public class TestRunner {
    public static void main(String[] args){
          Result result = JUnitCore.runClasses(TestJUnit.class);
          for(Failure failure : result.getFailures()){
              System.out.println(failure.toString());
          }
        System.out.println(result.wasSuccessful());
    }
}
