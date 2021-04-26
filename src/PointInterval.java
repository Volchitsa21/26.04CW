import java.util.*;

public class PointInterval {

    public static int getPointsNumber(List<Integer> numbers, int l) {
        int max = 0;
        Collections.sort(numbers);

        for (int number : numbers) {
            int count = 0;
            for (int i = number; i <= number+l; i++) {
                if (numbers.contains(i)) {
                    count++;
                }
            }

            max = Math.max(max, count);
        }

        return max;
    }
}
