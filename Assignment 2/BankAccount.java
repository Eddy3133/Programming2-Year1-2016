import java.util.Scanner;
/*name: Edirin Okpikpi
  Student Id: 3078829
  Assignment 2
  */
public abstract class BankAccount
{
    Scanner kb = new Scanner(System.in);
  double AccountBalance = kb.nextDouble();
  int NoDeposit;
  int NoWith;
  double IntR;
  double AnInt;
  double MonOfSerChar;
  double amount;
  double MonInt;
  public BankAccount(double bal, double intrRate){
    AccountBalance = bal;
    AnInt = intrRate;
  }
   public void setteramount(double Amou){
        amount = Amou;
    }
  public void deposit(double amountIn){
    AccountBalance = AccountBalance + amountIn;
    NoDeposit++;
  }
  public void withdraw(double amount){
    AccountBalance = AccountBalance - amount;
    NoWith++;
  }
  public double calcInterest(){
    double monRate;
    monRate= IntR / 12;
    MonInt = AccountBalance*monRate;
    AccountBalance = AccountBalance + MonInt;
    return AccountBalance;
  }
  public void monthlyProcess(double Am){
    Am = AccountBalance - MonOfSerChar;
    calcInterest();
    NoWith = 0;
    NoDeposit = 0;
    MonOfSerChar = 0;
  }
  //gets the balanace
  public double getAccountBalance(){
    return AccountBalance;
  }
  //gets deposit
  public double getDepo(){
    return NoDeposit;
  }
  //gets withdraw
  public double getWith(){
    return NoWith;
  }
}