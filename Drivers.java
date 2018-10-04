public class Drivers{
    public static void main(){
      BankAccount a = new BankAccount(balance: 0, accountID: 0, password: "" );
      a.Values(4815162342.0, 498340234, "drowssap");
      System.out.println(a.getID(), a.getBalance(), a.getCode());
      System.out.println(a.toString());
      Deposit(15);
      System.out.println(a.getBalance());
      Withdraw(23);
      System.out.println(a.getBalance());
    }
}
