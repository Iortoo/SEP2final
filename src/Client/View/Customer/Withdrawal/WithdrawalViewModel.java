package Client.View.Customer.Withdrawal;

import Client.Model.Customer.Withdrawal.WithdrawalModel;

public class WithdrawalViewModel
{
  private WithdrawalModel model;

  public WithdrawalViewModel(WithdrawalModel model)
  {
    this.model=model;
  }

  public void withdraw(String accountNo,String amount,String cardNo,String cvv,String expDate)
  {
    model.withdraw(accountNo,amount,cardNo,cvv,expDate);
  }
}
