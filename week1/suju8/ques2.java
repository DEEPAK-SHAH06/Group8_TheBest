// Write a Java program that takes a number from the user and prints all numbers 
// from 1 to that number, but skips printing multiples of 4 using an if condition inside a for loop.
import java.util.Scanner;

public class ques2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("Numbers from 1 to " + num + " (skipping multiples of 4):");

    
        for (int i = 1; i <= num; i++){
            if (i % 4 == 0) {
                continue;
            }
            System.out.println(i);
        }

        input.close();
    }
}