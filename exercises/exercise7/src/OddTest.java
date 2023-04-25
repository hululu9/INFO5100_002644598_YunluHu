import java.util.Collection;
import java.util.Arrays;


public class OddTest {
    public static void main(String[] args) {
        Collection<Integer> ci = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int count = Counter.countIf(ci, new OddPredicate());
        System.out.println("Number of odd integers : " + count);
    }
}
