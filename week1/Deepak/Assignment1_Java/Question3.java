// Write a Java program using a for loop and if statements to print “Fizz” for numbers divisible by 3,
//  “Buzz” for numbers divisible by 5, and “FizzBuzz” for numbers divisible by both, between 1 and 30.
public class Question3 {
    public static void main(String[] args) {
        for(int i=1;i<=30;i++){

            if(i%3==0 || i%5==0){
                if(i%3==0 && i%5==0){
                    System.out.println(i+ " FizzBuzz");;
                }
                else if(i%3==0 && i%5!=0){
                    System.out.println(i+" Fizz");
                }
                else{
                    System.out.println(i+ " Buzz");
                }
            }
        }
    }
}
