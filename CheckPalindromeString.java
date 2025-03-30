// Program to check if a string is palindrome
public class CheckPalindromeString {
    public static void main(String[] args) {
        
        String str="abbac",revStr="";
        
        for(int i=str.length()-1;i>=0;i--){
           char temp=str.charAt(i); 
           revStr=revStr+temp;
        }
        if(str.equals(revStr)){
            System.out.println(str+" is a palindorme string");
        }
        else{
            System.out.println(str+" is not a palindrome string");
        }
    }
}
