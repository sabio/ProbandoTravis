import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleTest {

    @Test
    public void myTest1() {
        assertEquals("a","a");
        System.out.println("Test 1 works");
    }

    @Test
    public void myTest2() {
        assertEquals("","");
        System.out.println("Test 2 works");
    }

    @Test
    public void myTest3() {
        assertEquals("a","");
        System.out.println("Test 3 works");
    }
}
