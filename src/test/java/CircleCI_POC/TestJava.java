package CircleCI_POC;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class TestJava {

    @Test
    public void testPass() {
        assertTrue(true);
    }

    @Test
    public void testFail() {
        assertTrue(false);
    }
}