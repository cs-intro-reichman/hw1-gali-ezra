// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    
		int NumWords= Integer.parseInt(args[0]);
		int ones= NumWords%10;
		NumWords = NumWords/10;
		int tens = NumWords%10;
		NumWords = NumWords/10;
		int hundreds = NumWords%10;

		System.out.println(hundreds + " hundreds, " + tens + " tens," +" and "+ ones + " ones.");

	}
}
