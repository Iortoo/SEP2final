package Client.View.Customer.AccountList;

import Client.Model.Customer.AccountList.AccountListModel;

import java.util.ArrayList;

public class AccountListViewModel
{
  private AccountListModel model;
  public AccountListViewModel(AccountListModel model)
  {
    this.model=model;
  }

  public ArrayList<String> getAccounts(String username)
  {
    return model.getAccounts(username);
  }
}
