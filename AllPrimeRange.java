//Program to print all prime numbers in a range
public class AllPrimeRange {
    public static void main(String[] args) {
        int start=2;
        int end =50;

        for(int i= start;i<end;i++){
         if(checkPrime(i)){
             System.out.println(i);
         }

        }
    }

    public static boolean checkPrime(int a){
        if(a<2){
            return false;
        } else if (a==2) {
            return true;
        } else{
            boolean isPrime =true;
            for(int i =3;i<a;i++){
                if(a%i==0){
                    isPrime=false;
                    return false;
                }
            }
        }
        return true;
    };

}
