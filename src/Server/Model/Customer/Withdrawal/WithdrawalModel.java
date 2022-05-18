package Server.Model.Customer.Withdrawal;

public interface WithdrawalModel
{
  void withdraw(String username,String amount,String cardNo,String cvv,String expDate);
}
