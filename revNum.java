// Program to reverse a number

public class revNum {
public static void main(String[] args) {
    int a=459;
    int reversedNum=0;
    while(a!=0){

        int num=a%10;
        reversedNum=reversedNum*10+num;
        a=a/10;

    }
    System.out.println("Reversed number is "+ reversedNum);

}    
}
