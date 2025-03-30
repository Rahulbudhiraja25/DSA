// Program to check if a number is palindrome 

public class CheckPalindrome {
public static void main(String[] args) {
    int a =1221;
    int revnum=0;
    int temp=a;

    while(temp!=0){
        int digit=temp%10;
        revnum=revnum*10+digit;
        temp=temp/10;
    }
    // System.out.println(revnum);
    if(a==revnum){
        System.out.println(a+" is a palindrome number");
    }
    else{
        System.out.println(a+" is not a palindrome number");
    }
}
}