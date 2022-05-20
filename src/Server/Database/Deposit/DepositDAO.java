package Server.Database.Deposit;

public interface DepositDAO
{
  void deposit(String accountNo, double amount,String cardNo,String cvv,String expDate);
}
