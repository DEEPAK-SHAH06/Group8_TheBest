// Write a Java program using a for loop that prints numbers from 1 to 30, but:
// Prints “skip” instead of 15,

// Doubles any number divisible by 4 before printing,

// And prints “done” at the end.


public class Question6 {
    public static void main(String[] args) {
        for(int i=1;i<=30;i++){
            if(i==15){
                System.out.println("Skip ");
                continue;
            }
            if(i%4==0){
                System.out.println(i*2);
                continue;
            }
            System.out.println(i);

        }
        System.out.println("Done");
    }
}
