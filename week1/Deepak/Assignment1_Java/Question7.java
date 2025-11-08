// Write a Java program that simulates an ATM PIN verification system.
// The program should have a correct PIN stored (for example, 1234) and allow the user up to three attempts to enter the correct PIN.

// If the user enters the correct PIN, print "Access Granted" and stop the program.

// If the user enters the wrong PIN, print "Incorrect PIN, try again
//After three incorrect attempts, print "Account locked".


import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

        String pin;
        String correctPin="1234";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your PIN");
        for(int i=1;i<=3;i++){
            pin=sc.next();
            if(pin.equals(correctPin)){
                System.out.println("Access Granted !!");
                break;
            }else{
                if(i==3){
                    System.out.println("You used 3 attempts, Account Blocked !!");
                    break;
                }
                System.out.println("Incorrect PIN, try again !!");
            }
        }
        sc.close();
    }
}
