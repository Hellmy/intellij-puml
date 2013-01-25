import de.docksnet.puml.parser.PumlParserTest;
import junit.framework.TestCase;
import junit.framework.TestSuite;

@SuppressWarnings("ALL")
public class PumlTestCase extends TestCase {
  public static TestSuite suite() {
    TestSuite suite = new TestSuite();
    suite.addTestSuite(PumlParserTest.class);
    return suite;
  }
}
