import java.util.Collection;
import java.util.function.Predicate;

public class Counter {
    // Collection<T>: the collection of elements to search
    // Predicate<T>: the predicate to apply to each element
    public static <T> int countIf(Collection<T> collection, Predicate<T> predicate) {
        int count = 0;  // Initialize the number of elements that satisfy the predicate
        // Loop through each element in the collection
        for (T element : collection) {
            // Test if the element satisfies the predicate, if it does, count +1
            if (predicate.test(element)) {
                count++;
            }
        }
        return count;
    }
}

// predicate for odd numbers
class OddPredicate implements Predicate<Integer> {
    public boolean test(Integer num) { return num % 2 != 0; }
}

// predicate for prime numbers
class PrimePredicate implements Predicate<Integer> {
    public boolean test(Integer num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// predicate for palindrome numbers
class PalindromePredicate implements Predicate<Integer> {
    public boolean test(Integer num) {
        int reversed = 0;
        int original = num;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }
}



