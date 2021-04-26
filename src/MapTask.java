import java.util.*;

public class MapTask {

    public int maxOccurrencesNumber(List<Integer> numbers) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        Iterator<Integer> i = numbers.iterator();

        while (i.hasNext()) {
            int num = i.next();
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        Set<Integer> set = map.keySet();
        i = set.iterator();
        int maxValue = 0, maxKey = 0;

        while(i.hasNext()) {
            int currentKey = i.next();
            int currentValue = map.get(currentKey);
            if (currentValue > maxValue) {
                maxValue = currentValue;
                maxKey = currentKey;
            }
        }

        return maxKey;
    }
}
