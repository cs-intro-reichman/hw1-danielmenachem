// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int input = Integer.parseInt(args[0]); 
		if (input > 0) {
			int num1 = (int) (Math.random()*input);
			int num2 = (int) (Math.random()*input); 
			int num3 = (int) (Math.random()*input); 
			int[] numbers = {num1, num2, num3}; 
			int max = 0; 
			int min = num1;
			int med = 0;
			// finding max value:
			int i = 0;
			while (i<3){
				if (numbers[i]>max){
					max = numbers[i];
					i++;
				}
				else {
					i++;
				}
			}
			// finding the min value:
			int j = 0; 
			while (j<3){
				if (numbers[j]<min){
					min = numbers[j]; 
					j++;
				}
				else {
					j++; 
				}
			}
			//finding the med value:
			int k = 0; 
			while (k<3){
				if (numbers[k]!=max && numbers[k]!=min){
					med = numbers[k];
					k=3; 
				}
				else {
					k++;
				}
			}
			System.out.println(num1 + " "  + num2 + " " + num3); 
			System.out.println(min + " " + med + " " + max); 
		}
		else {
			System.out.println("ERROR. please insert a number greater then 0.");
		}
	}
}
