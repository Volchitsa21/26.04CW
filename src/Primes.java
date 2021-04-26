import java.util.ArrayList;
import java.util.List;

public class Primes {
    public static List<Integer> getPrimesTill(int n) {
        List<Integer> result = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                result.add(i);
            }
        }

        return result;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
