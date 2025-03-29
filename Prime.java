// Implement a program to check if a number is prime
public class Prime {
    public static void main(String args[]) {

        
        int a = 2;
        if(a<=2){
            System.out.println(a+" is not a prime number");
            return ;
        }
        boolean isPrime=true;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(a + " is a Prime Number");

        } else {
            System.out.println(a + " is not a Prime Number");
        }
    }
}
