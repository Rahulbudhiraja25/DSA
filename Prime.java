// Implement a program to check if a number is prime
public class Prime {
    public static void main(String args[]) {
        int a=19;

        if(a<2){
            System.out.println("A is not prime");
        } else{
            boolean isPrime =true;
            for(int i =3;i<a;i++){
                if(a%i==0){
                    isPrime=false;
                return;
                }
            }
            if(isPrime==true){
                System.out.println("A is a prime number");
            }
            else {
                System.out.println("A is not a prime number");
            }
        }

    }
}
