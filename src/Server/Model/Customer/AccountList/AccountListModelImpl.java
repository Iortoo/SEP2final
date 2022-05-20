package Server.Model.Customer.AccountList;

import Server.Database.AccountList.AccountListDAOImpl;
import Server.Database.DatabaseAdapterImpl;

import java.util.ArrayList;

public class AccountListModelImpl implements AccountListModel
{
  private static AccountListModel instance;

  private AccountListModelImpl()
  {
  }

  public static AccountListModel getInstance()
  {
    if(instance==null) instance = new AccountListModelImpl();
    return instance;
  }

  public ArrayList<String> getAccounts(String username)
  {
    return AccountListDAOImpl.getInstance().getAccounts(username);
  }
}
