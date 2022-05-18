package Client.View.Customer.Deposit;

import Client.Model.Customer.Deposit.DepositModel;

public class DepositViewModel
{
  private DepositModel model;

  public DepositViewModel(DepositModel model)
  {
    this.model=model;
  }

  public void deposit(String username,String amount,String cardNo,String cvv,String expDate)
  {
    model.deposit(username,amount,cardNo,cvv,expDate);
  }
}
