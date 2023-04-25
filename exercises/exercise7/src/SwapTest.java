import java.util.Arrays;

public class SwapTest {
    public static void main(String[] args) {
        Integer[] numbers = { 1, 2, 3, 4, 5 };
        Swap.swapNum(numbers, 1, 4);
        System.out.println(Arrays.toString(numbers));
    }
}
