// Write a Java program that takes a number from the user and prints all numbers from 1 to that number,
//  but skips printing multiples of 4 using an if condition inside a for loop.

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int number = sc.nextInt();

        for(int i=1;i<=number;i++){
            if(i%4==0){
                continue;
            }
            System.out.print(i+" ");
        }
        sc.close();
    }
}
