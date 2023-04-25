import java.util.Comparator;
import java.util.List;

public class Max {
    public static <T> T findMax(List<T> list, int begin, int end, Comparator<T> comparator) {
        // First to determine whether the interval is valid
        if (begin < 0 || end > list.size() || begin >= end) {
            throw new IndexOutOfBoundsException();
        }

        // Assume the first element in the interval is the maximum
        T max = list.get(begin);
        // Compare each element in the interval with the current maximum value in turn
        for (int i = begin + 1; i < end; i++) {
            T current = list.get(i);
            if (comparator.compare(current, max) > 0) {
                max = current; // Update the maximum
            }
        }
        return max;
    }
}
