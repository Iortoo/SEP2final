package Client.View.Customer.NewAccount;

import Client.Model.Customer.NewAccount.NewAccountModel;

public class NewAccountViewModel
{
  private NewAccountModel model;

  public NewAccountViewModel(NewAccountModel model)
  {
    this.model=model;
  }

  public void newAccount(String username,String type, String amount)
  {
    model.newAccount(username,type,amount);
  }
}
