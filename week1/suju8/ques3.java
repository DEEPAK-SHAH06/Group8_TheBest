// “Buzz” for numbers divisible by 5, and “FizzBuzz” for numbers
//  divisible by both, between 1 and 30.
public class ques3{
    public static void main(String[] args){
        System.out.println("FizzBuzz from 1 to 30: ");
        for (int i = 1; i<=30; i++){
            if (i % 3==0 && i % 5 ==0 ){
                System.out.println("FizzBuzz");
            }
            else if (i % 3 ==0){
                System.out.println("Fuzz");

            }
            else if (i % 5 ==0){
                System.out.println("Buzz");

            }
            else {
                System.out.println(i);
            }
        }
    }
}