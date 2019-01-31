//Edirin Okpikpi
//3078829
import java.util.Scanner;
public class MainBankAccount
{
    public static void main (String[]args)
    {
       Scanner kb = new Scanner(System.in);
       double one ;
       int two;
       String three;
       one=kb.nextDouble();
       
       SavingsAccount SA = new SavingsAccount(74.33,47.5);
       System.out.println("please enter the withdrawals made ");
       two=kb.nextInt();
       SA.withdraw(two);
       
       System.out.println("please enter your deposits ");
       SA.calcInterest();
       
       three = "interest "+ (SA.getAccountBalance());
       
       three +=  "Account" + SA.isActive();
       System.out.println(three);
    }
}
        