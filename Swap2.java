// Write a program to swap two numbers without using a third variable
// import java.util.*;
public class Swap2{
    public static void main(String[] args) {
        int a =5;
        int b=6;

        System.out.println(a);
        System.out.println(b);


        //   a=a+b;
        //   b=a-b;
        //   a=a-b;
      
        a=a*b;
        b=a/b;
        a=a/b;

        System.out.println(a);
        System.out.println(b);

    }
}