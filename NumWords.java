// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int input = Integer.parseInt(args[0]);
		int ones = input % 10 ; 
		int hundreds = input/100 ; 
		int tens = ((input - ones - hundreds*100)/10) % 100 ; 
		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones."); 
	}
}
