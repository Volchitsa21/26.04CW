import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PointIntervalTest {

    @Test
    public void testPositive() {
        assertEquals(4, PointInterval.getPointsNumber(Arrays.asList(-10, -9, -7, -5, 0, 1, 2, 3), 3));
    }

}