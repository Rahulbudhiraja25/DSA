//Program to print a rectangle pattern in java
public class Pattern_Rectangle {

    public static void main(String[] args) {
       int length=40;
       int breadth=50;

       for(int i=0;i<length;i++){
           for(int j=1;j<=breadth;j++){
               if(j==1||j==breadth||i==0||i==length-1){
               System.out.print("*");
               }
               else {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }



    }

}
