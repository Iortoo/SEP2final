package Server.Database.Withdraw;

public interface WithdrawDAO
{
  void withdraw(String accountNo, Double amount,String cardNo,String cvv,String expDate);
}
