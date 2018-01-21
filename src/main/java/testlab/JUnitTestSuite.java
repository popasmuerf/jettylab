package testlab;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by mdb on 1/18/18.
 *
 * A test suite bundles a few uit test cases and runs them
 * together.  In JUnite, both
 * @RunWith
 * @Suit
 * annotation are used to runt he suite test.
 * Given below is an example that uses:
 * TestJUnit1 & TestJUnit2
 *
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({TestJUnit1.class,TestJUnit2.class})
public class JUnitTestSuite {
}
