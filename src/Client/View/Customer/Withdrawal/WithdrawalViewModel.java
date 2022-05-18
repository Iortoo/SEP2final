package Client.View.Customer.Withdrawal;

import Client.Model.Customer.Withdrawal.WithdrawalModel;

public class WithdrawalViewModel
{
  private WithdrawalModel model;

  public WithdrawalViewModel(WithdrawalModel model)
  {
    this.model=model;
  }

  public void withdraw(String username,String amount,String cardNo,String cvv,String expDate)
  {
    model.withdraw(username,amount,cardNo,cvv,expDate);
  }
}
