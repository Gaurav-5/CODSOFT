import java.util.*;
public class ABC_ATM {

    public static void main(String [] args )
     {
         Scanner sc = new Scanner(System.in);

        //declare and initialize balance, withdraw, and deposit
         Random ran = new Random();
         int balance =  ran.nextInt(1000000)+1;
         System.out.println("Your Account Balance :"+balance);

         int  WithdrawalAmount, DepositAmount;


         while (true) {
             System.out.println("Choose 1 for Withdraw");
             System.out.println("Choose 2 for Deposit");
             System.out.println("Choose 3 for Check Balance");
             System.out.println("Choose for Exit");

             int choice = sc.nextInt();
             switch (choice) {
                 case 1:
                     System.out.print("Enter money to be withdrawn:");
                     DepositAmount = sc.nextInt();

                     if (balance >= DepositAmount) {
                         balance = balance - DepositAmount;
                         System.out.println("Please collect your money");
                     } else {
                         System.out.println("Insufficient Balance");
                     }
                     System.out.println(" ");
                     break;

                 case 2:
//                 For Deposited
                     System.out.print("Enter money to be deposited:");
                     DepositAmount = sc.nextInt();

                     //add the deposit amount to the total Balance
                     balance = balance + DepositAmount;
                     System.out.println("Your Money has been successfully Deposited :" + balance);
                     System.out.println(" ");
                     break;
//
                 case 3:
//                     Final Account Balance.
                     System.out.println("Balance : " + balance);
                     System.out.println(" ");
                     break;

                 case 4:
                 System.exit(0);
             }
         }
        }
    }

