/**
 * Collects rainfall data and prints statistics.
 * Uses 99999 as a sentinel to end input.
 *
 * @author (Luke Brighton = LB837)
 */
public class Rainfall
{
    private InputReader reader;

    public Rainfall() {
        reader = new InputReader();
    }

    /**
     * Repeatedly read daily rainfall amounts (in mm) from the user
     * until the sentinel value 99999 is entered.
     *
     * Ignores:
     *  - negative inputs (prints a warning and skips them)
     *
     * Computes and prints:
     *  - average rainfall per valid day
     *  - number of rainy days ( > 0 mm )
     *  - number of valid inputs
     *  - maximum rainfall on any one day
     */
    public void getStatistics() {
        int SENTINEL = 99999;

        int totalRain = 0;      
        int countValid = 0;     
        int rainyDays = 0;      
        int maxRain = 0;        

        System.out.println("==================================");
        System.out.println("       Rainfall Data Capture      ");
        System.out.println("   (enter " + SENTINEL + " to finish)   ");
        System.out.println("==================================");

        int amount = reader.getInt("Enter rainfall (mm): ");

        while (amount != SENTINEL) {
            if (amount < 0) {
                System.out.println("? Negative rainfall ignored. Please enter 0 or more,");
                System.out.println("  or " + SENTINEL + " to finish.");
            } else {
                countValid++;
                totalRain = totalRain + amount;

                if (amount > 0) {
                    rainyDays++;
                }

                if (countValid == 1 || amount > maxRain) {
                    maxRain = amount;
                }
            }

            amount = reader.getInt("Enter rainfall (mm) (" + SENTINEL + " to end): ");
        }

        System.out.println("\n============= Results =============");

        if (countValid == 0) {
            System.out.println("No valid rainfall data entered.");
        } else {
            double average = (double) totalRain / countValid;

            System.out.println("Valid days recorded : " + countValid);
            System.out.println("Rainy days (> 0 mm) : " + rainyDays);
            System.out.println("Total rainfall (mm) : " + totalRain);
            System.out.println("Maximum in a day    : " + maxRain + " mm");
            System.out.println("Average per day     : " + average + " mm");
        }

        System.out.println("==================================");
    }
}
