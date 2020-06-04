
//It is the simplest code for DtoB
//For noobs
import java.util.Scanner;

public class DecimaltoBinary {

	public static void main(String[] args) {
		//This is the code for binary to decimal converter
		//Code by Soumen Samanta
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Number : ");
		long input = sc.nextLong(); //taking input from user
		String result = ""; //Creating a blank string for the result
		while(input > 0) {
			if(input % 2 == 1) { 
				result +='1'; // It will add the 1 as a string in result
				input /= 2; // input = input / 2
			}else {
				result += '0'; //
				input /= 2;
			}
		}
		for(int x = result.length() - 1; x >= 0; x--) { // Reverse the String and print it on the console
			System.out.print(result.charAt(x));
		}
	}

}
