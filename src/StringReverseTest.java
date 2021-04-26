import org.junit.Test;



import static org.junit.Assert.*;

public class StringReverseTest {

    @Test
    public void testValidStrings() {
        assertEquals("olleH",  StringReverse.reverseString("Hello"));
        assertNotEquals("Hello", StringReverse.reverseString("Hello"));
        assertEquals("h", StringReverse.reverseString("h"));
        assertEquals("aha", StringReverse.reverseString("aha"));
    }

    @Test
    public void testReverse_emptyString(){
        assertEquals("",  StringReverse.reverseString(""));
    }
}