public class BankAccount{
double balance;
int accountID;
String password;
public void Values(double NewB, int NewID, String NewPassword){
balance = NewB;
accountID = NewID;
password = NewPassword;
}
public double getID()
{
return BankAccount.accountID;
}
public String getcode()
{
return BankAccount.password;
}
public double getBalance()
{
return BankAccount.balance;
}
public void setCode(String newCode)
{
password = newCode;
}
public String toString()
{
  return "" + BankAccount.balance + "                   " +  BankAccount.accountID;
}
public boolean Deposit(int dep)
{
if (BankAcccount.balance > 0)
{
BankAccount.balance += dep;
return true;
}
return false;
}
public boolean Withdraw(int out)
{
if (BankAccount.balance >= out)
{
BankAccount.balance -= out;
return true;
}
return false;
}
}
