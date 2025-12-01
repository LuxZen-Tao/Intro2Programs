
/**
 * Process Number Operations.
 * @author (Luke Brighton = LB837)
 */
public class NumberProcessor
{
    private InputReader reader;

    public NumberProcessor() {
        reader = new InputReader();
    }

    /**
     * Ask for a positive n, then read n numbers and print their sum.
     */
    public void sum() {
        int n = reader.getInt("How many numbers do you want to add? (positive): ");
        while (n <= 0) {
            n = reader.getInt("Please type a POSITIVE number for n: ");
        }

        int count = 0;
        int total = 0;

        while (count < n) {
            int value = reader.getInt("Type number " + (count + 1) + ": ");
            total = total + value;
            count = count + 1;
        }

        System.out.println("The sum is: " + total);
    }

    /**
     * Ask for a positive n, then read n numbers and print the maximum.
     */
    public void maximum() {
        int n = reader.getInt("How many numbers do you want to compare? (positive): ");
        while (n <= 0) {
            n = reader.getInt("Please type a POSITIVE number for n: ");
        }

        int count = 0;
        int max = 0;
        boolean first = true;

        while (count < n) {
            int value = reader.getInt("Type number " + (count + 1) + ": ");

            if (first) {
                max = value;     // initialise max with first value
                first = false;
            } else if (value > max) {
                max = value;
            }

            count = count + 1;
        }

        System.out.println("The maximum is: " + max);
    }

    /**
     * Ask for a positive n, then read n numbers and
     * print BOTH their sum and their maximum.
     */
    public void sumAndMaximum() {
        int n = reader.getInt("How many numbers? (positive): ");
        while (n <= 0) {
            n = reader.getInt("Please type a POSITIVE number for n: ");
        }

        int count = 0;
        int total = 0;
        int max = 0;
        boolean first = true;

        while (count < n) {
            int value = reader.getInt("Type number " + (count + 1) + ": ");

            total = total + value;

            if (first) {
                max = value;
                first = false;
            } else if (value > max) {
                max = value;
            }

            count = count + 1;
        }

        System.out.println("The sum is: " + total);
        System.out.println("The maximum is: " + max);
    }
}
