public class BankAccount{
    double balance;
    int accountID;
    String password;
    public BankAccount( double NewB, int NewID, String NewPassword){
        balance = NewB;
        accountID = NewID;
        password = NewPassword;
    }
    public double getID()
    {
        return accountID;
    }
    public String getcode()
    {
        return password;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setCode(String newCode)
    {
        password = newCode;
    }
    public String toString()
    {
        return "" + balance + "                   " +  accountID;
    }
    public boolean deposit(double dep)
    {
        if (balance > 0)
        {
            balance += dep;
            return true;
        }
        return false;
    }
    public boolean withdraw(double out)
    {
        if (balance >= out)
        {
            balance -= out;
            return true;
        }
        return false;
    }
}
