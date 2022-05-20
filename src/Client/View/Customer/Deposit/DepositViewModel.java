package Client.View.Customer.Deposit;

import Client.Model.Customer.Deposit.DepositModel;

public class DepositViewModel
{
  private DepositModel model;

  public DepositViewModel(DepositModel model)
  {
    this.model=model;
  }

  public void deposit(String accountNo,String amount,String cardNo,String cvv,String expDate)
  {
    model.deposit(accountNo,amount,cardNo,cvv,expDate);
  }
}
