import java.util.Arrays;
import java.util.Collection;

public class PrimeTest {
    public static void main(String[] args) {
        Collection<Integer> ci = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int count = Counter.countIf(ci, new PrimePredicate());
        System.out.println("Number of prime integers : " + count);
    }
}
