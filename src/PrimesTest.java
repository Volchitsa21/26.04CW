import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class PrimesTest {

    @Test
    public void testSetOfPrimes() {
        assertEquals(Arrays.asList(2, 3, 5, 7, 11), Primes.getPrimesTill(12));
    }

    @Test
    public void testFirstNumbers() {
        assertEquals(Arrays.asList(2, 3), Primes.getPrimesTill(4));
    }

    @Test
    public void testZeroAndOne() {
        assertEquals(Collections.emptyList(), Primes.getPrimesTill(0));
        assertEquals(Collections.emptyList(), Primes.getPrimesTill(1));
    }

}