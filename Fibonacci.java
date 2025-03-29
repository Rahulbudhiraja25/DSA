// Write a program to print the Fibonacci series up to N terms
public class Fibonacci {
    public static void main(String[] args) {
        int n=21;

        int a=0,b=1;
        for(int i=1;i<=n;i++){
            int next =a+b;
            System.out.print(next);
            if(i!=n){
                System.out.print(",");
            }
            a=b;
            b=next;
        }
    }
}
