// Create a BankAccount class with deposit, withdrawal, and balance check methods

import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {
        Account account =new Account();
    Scanner sc = new Scanner(System.in);
            while(true){
        System.out.println("Please choose from an option below\n 1.Deposit \n 2.Withdraw \n 3.Check Balance \n 4. Exit");
                int option=sc.nextInt();
                if(option==1){
                    System.out.println("Please enter amount to deposit");
                    int amt=sc.nextInt();
                    String response =account.deposit(amt);
                    System.out.println(response);
                }
                else if(option==2){
                    System.out.println("Please enter amount to withdraw");
                    int amt =sc.nextInt();
                    String response =account.withdraw(amt);
                    System.out.println(response);
                }
                else if(option==3){
                    System.out.println(account.getBalance());   
                }
                else{
                    System.out.println("Thankyou for using our banking services");
                    break;
                }
        }
        sc.close();
    }

    
    
}
 class Account{
    int bankAccountBalance=0;

    String deposit(int balance){
        bankAccountBalance=bankAccountBalance+balance;
        return "Balance Added Your updated Bank balance is "+ bankAccountBalance;
        }

        String withdraw(int balance){
            if(balance>bankAccountBalance){
                    return"Withdraw failure insufficient Balance!!";
            }
            else{
                bankAccountBalance=bankAccountBalance-balance;
                return "Withdrawn sucessfully updated balance is "+bankAccountBalance;
            }
        }

        String getBalance(){
            return "Your balance is "+bankAccountBalance;
        }

}