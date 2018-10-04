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
    private boolean authenticate(String password){
        return this.password == password;
    }
    public boolean transferTo(BankAccount other, double amount, String password)
    {
        if (this.authenticate(password) && this.withdraw(amount))
        {
            System.out.println("Attempt to move " + amount + " from the b1 to b2 account:");
            if (other.deposit(amount))
            {
                System.out.println("Success");
                return true;
            }
            else
            {
                System.out.println(amount + " withdraw from " + accountID + " Failed to add to " +  other);
                return false;
            }
        }
        else
        {
            System.out.println("Failed to withdraw " + amount + " from " + accountID);
            return false;
        }
    }
}
