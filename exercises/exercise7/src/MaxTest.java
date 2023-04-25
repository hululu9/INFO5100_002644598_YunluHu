import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 2, 7, 1, 4);
        int max = Max.findMax(numbers, 1, 5, Comparator.naturalOrder());
        System.out.println("Maximal element in range [1, 5): " + max);
    }
}
