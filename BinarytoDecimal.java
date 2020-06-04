package BinaryConverter;
import java.util.Scanner;

public class BinarytoDecimal {

	public static void main(String[] args) {
		//This is the code for binary to decimal converter
		//Code by Soumen Samanta
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Number : ");
		long input = sc.nextLong(); //taking input from user
		String result = "";
		while(input > 0) {
			if(input % 2 == 1) {
				result +='1';
				input /= 2;
			}else {
				result += '0';
				input /= 2;
			}
		}
		for(int x = result.length() - 1; x >= 0; x--) {
			System.out.print(result.charAt(x));
		}
	}

}
