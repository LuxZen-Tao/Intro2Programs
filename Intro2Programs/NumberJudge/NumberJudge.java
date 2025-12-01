
/**
 * * Judge the number and return a text result.
 * @author (Luke Brighton = LB837)
 */
public class NumberJudge
{
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

    public void showJudgement(int number) {
        String result = judge(number);
        System.out.println("The number " + number + " is " + result + ".");
    }
}