package tiy.pink;

import static org.junit.Assert.*;

/**
 * Created by Brice on 8/24/16.
 */
public class StringReverserTest {

    StringReverser reverser ;

    @org.junit.Before
    public void setUp() throws Exception {
        reverser = new StringReverser();
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void reverseString() throws Exception {
        String sampleString = "something";
        String reversedString = reverser.reverseString(sampleString);
        System.out.println(reversedString);
        assertEquals("gnihtemos", reversedString);
        // first parameter is what I expect, the second is what I get back
    }

}