//Program to find sum of digits of two numbers
public class SumOfDigits {

    public static void main(String[] args) {
        int num =565;
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum= sum+digit;
            num=num/10;
        }
        System.out.println("Sum of digits of num is "+sum);
    }

}
