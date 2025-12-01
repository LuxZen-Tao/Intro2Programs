import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

/**
 * Class InputReader reads typed text input from the standard text terminal. The text
 * typed by a user is then chopped into words, and a set of words is provided.
 * 
 * @version    1.0  
 * @author     Michael Kolling and David J. Barnes
 */
public class InputReader
{
    private BufferedReader reader;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new BufferedReader(new InputStreamReader(System.in));;
    }

    /**
     * Read a line of text from standard input (the text terminal), and
     * return it as a set of words.
     *
     * @return  A set of Strings, where each String is one of the words
     * typed by the user
     */
    public ArrayList<String> getInput(String prompt) 
    {
        System.out.print(prompt);                // print prompt
        String inputLine = readInputLine().trim().toLowerCase();

        StringTokenizer tokenizer = new StringTokenizer(inputLine);
        ArrayList<String> words = new ArrayList<String>();

        while(tokenizer.hasMoreTokens())
            words.add(tokenizer.nextToken());      // add each word to the set

        return words;
    }

    /**
     * Read one line of input and return it as a String. 
     *
     * @return  A Strings representing the input, or an empty String if an error occurs.
     */
    public String readInputLine()
    {
        String line = "";

        try {
            line = reader.readLine();
        }
        catch(java.io.IOException exc) {
            System.out.println ("There was an error during reading: " + exc.getMessage());
        }
        return line;
    }
    
    public int getInt(String prompt) 
    {
        
        int answer = -1;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print(prompt);
                String line = readInputLine();
                answer = Integer.parseInt(line.trim());
                valid = true;
            }
            catch (Exception e) {
                System.out.println("Try again - must be an integer ");
            }
        }
        return answer;
    }
}
