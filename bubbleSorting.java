
import java.util.Scanner;
public class BubbleSorting {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of Array : ");
        int x = sc.nextInt();
        int ram = 0;
        int[] numbers = new int[100];
        System.out.println("Enter The values : ");
        for (int p = 0; p < x; p++) {
            numbers[p] = sc.nextInt();
            //Enter all of the inputs
        }
        for(int p = 0; p < x; p++){
            for(int k = 0; k < x-1-p; k++){
                if(numbers[k] > numbers[k + 1]){
                    ram = numbers[k];
                    numbers[k] = numbers[k + 1];
                    numbers[k + 1] = ram;
                }
            }
        }
        for (int i = 0; i < x; i++) {
            System.out.println(numbers[i]);
        }
//        int y = sc.nextInt();


    }
}
