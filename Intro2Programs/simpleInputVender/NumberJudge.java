/**
 * Judge the number and return a text result.
 * @author (Luke Brighton = LB837)
 */
public class NumberJudge
{
    private InputReader reader;

    public NumberJudge() {
        reader = new InputReader();
    }

    /**
     * Decide if a number is positive, negative, or zero.
     * This method does not print anything.
     */
    public String judge(int number) {
        if (number > 0) {
            return "positive";
        } 
        else if (number < 0) {
            return "negative";
        } 
        else {
            return "zero";
        }
    }

    /**
     * Print the judgement in a sentence.
     */
    public void showJudgement(int number) {
        String result = judge(number);
        System.out.println("The number " + number + " is " + result + ".");
    }

    /**
     * Ask the user for one number and judge it.
     */
    public void judgeInput() {
        int value = reader.getInt("Type a number: ");
        showJudgement(value);
    }

    /**
     * Keep reading and judging until a negative number is typed.
     */
    public void judgeInputSequence() {
        int value = reader.getInt("Type a number (negative to stop): ");

        while (value >= 0) {
            showJudgement(value);
            value = reader.getInt("Type a number (negative to stop): ");
        }

        System.out.println("Goodbye");
    }
}
