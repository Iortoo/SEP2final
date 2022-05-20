package Client.Model.Customer.Withdrawal;

public interface WithdrawalModel
{
  void withdraw(String accountNo,String amount,String cardNo,String cvv,String expDate);
}
