
/**
 * Write a description of class TestInputReader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestInputReader
{
	private InputReader reader;
	
	public TestInputReader()
	{
	    reader = new InputReader();
	}
	
	/** This method asks the user for two numbers and prints
	 * out their sum
	 */
	public void test()
	{
	    int number1;
	    int number2;
	    int sum;
	   
	    number1 = reader.getInt("Please type a number? ");
	    number2 = reader.getInt("Please type another number? ");
	    
	    sum = number1 + number2;
	    
	    System.out.println("The sum of " + number1 + " and " + number2 + " is " + sum);
	}
	        
}
