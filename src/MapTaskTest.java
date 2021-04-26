import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MapTaskTest {

    @Test
    public void testOccurrences_allEqual() {
        List<Integer> intList = Arrays.asList(2, 1, 3, 4, 5, 6);
        MapTask mapTask = new MapTask();
        assertEquals(2,  mapTask.maxOccurrencesNumber(intList));
    }

    @Test
    public void testOccurrences_oneMax() {
        List<Integer> intList = Arrays.asList(1, 8, -10, 8, 3);
        MapTask mapTask = new MapTask();
        assertEquals(8,  mapTask.maxOccurrencesNumber(intList));
    }

    @Test
    public void testOccurrences_firstFind() {
        List<Integer> intList = Arrays.asList(1, 8, -10, 8, 3, 1);
        MapTask mapTask = new MapTask();
        assertEquals(1,  mapTask.maxOccurrencesNumber(intList));
    }

    @Test
    public void testOccurrences_OneMaxTwoLower() {
        List<Integer> intList = Arrays.asList(1, 8, 3, 8, 3, 1, 3);
        MapTask mapTask = new MapTask();
        assertEquals(3,  mapTask.maxOccurrencesNumber(intList));
    }
}