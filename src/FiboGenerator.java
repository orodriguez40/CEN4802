// Otoniel Rodriguez-Perez
// Module 1 Assignment
// CEN 4802C

/**
 * A simple utility for computing Fibonacci numbers.
 */
public class FiboGenerator {

    public static long fibonacci(int n) {
        if (n <= 2) {
            return 1L;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int term = 10;
        long value = fibonacci(term);
        System.out.printf(
                "The %d%s term of the Fibonacci sequence is %d.%n",
                term,
                getOrdinalSuffix(term),
                value
        );
    }

    // helper to print “1st”, “2nd”, “3rd”, and “4th”
    private static String getOrdinalSuffix(int n) {
        int mod100 = n % 100;
        if (mod100 >= 11 && mod100 <= 13) return "th";
        return switch (n % 10) {
            case 1 -> "st";
            case 2 -> "nd";
            case 3 -> "rd";
            default -> "th";
        };
    }
}
