import java.util.Arrays;
import java.util.Collection;

public class PalindromeTest {
    public static void main(String[] args) {
        Collection<Integer> ci = Arrays.asList(121, 123, 1331, 987, 34543, 678, 7997);
        int count = Counter.countIf(ci, new PalindromePredicate());
        System.out.println("Number of palindrome integers : " + count);
    }
}
