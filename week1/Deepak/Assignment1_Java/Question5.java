// Write a Java program that prints the sum of even numbers and
// the product of odd numbers between 1 and 10 using a for loop and if condition.
public class Question5 {
    public static void main(String[] args) {
        int sum=0;
        int product=1;
        for(int i =1;i<=10;i++){
            if(i%2==0){
             sum =sum+i;
            }
            else{
                product=product*i;
            }
        }
        System.out.println("Sum of Even numbers is "+sum+" and product of odd numbers is "+product);
    }
}
