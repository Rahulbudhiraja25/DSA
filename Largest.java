//Find the largest of three numbers
public class Largest {
    public static void main(String[] args) {
        int a=50;
        int b=5;
        int c=30;

        if(a>b&&a>c){
            System.out.println("A is greatest");
        } else if (b>c) {
            System.out.println("B is  greatest");
        }
        else {
            System.out.println("C is greatest");
        }
    }
}
