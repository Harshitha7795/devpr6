package cse.prg2;

import junit.framework.TestCase;

public class AppTest extends TestCase {
    
    public void testGreet() {
        String result = App.greet("Harsh");
        assertEquals("Hello, Harsh!", result);
    }
}
