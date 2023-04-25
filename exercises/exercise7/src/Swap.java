import java.util.Arrays;

public class Swap {
    // i and j are the index of the elements to swap
    public static <T> void swapNum(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

