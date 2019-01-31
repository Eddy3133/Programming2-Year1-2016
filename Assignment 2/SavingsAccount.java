/*name: Edirin Okpikpi
  Student Id: 3078829
  Assignment 2
  */
public class SavingsAccount extends BankAccount
{
  public SavingsAccount(double bala, double intr)
  {
    super(bala, intr);
  }
  public boolean isActive()
  {
    if (AccountBalance >= 25)
      return true;
      return false;
  }
 //deposit
  public void deposit()
  {
    if(isActive() == true)
    {
      super.deposit(amount);
    }
  }
  
  //withdraw
  public void withdraw()
  {
    if(isActive() == true){
      super.withdraw(amount);
    }
  }
  //checks and adds charges
  public void monthlyProcess()
  {
    if(NoWith > 4)
      MonOfSerChar++;
  }
}