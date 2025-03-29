// Write a program to demonstrate try, catch, finally, and throw keywords
class RahulException extends RuntimeException{
    public RahulException(String message){
        super(message);
    }
}

public class try_catch {
    final static void getLegalAge( int age){
        if(age<18){
            throw new RahulException("You cannot drive");
         
        }
        else{
            System.out.println("You can drive");
        }
}
    public static void main(String[] args) {
   

    try{
        int age =50;
        getLegalAge(age);
    
    }
    catch(RahulException r){
        System.out.println("Exception you cannot drive minor");
    }

    }
}
