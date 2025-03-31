//Program to find HCF two numbers
public class HCF {

    public static void main(String[] args) {
        int a=12,b=18;

        int result=Math.min(a,b);
       while(result>0){
           if(a%result==0&&b%result==0){
               break;
           }
           result--;
       }
System.out.println("Gst of a and b is "+result);
    }

}
