package Server.Model.Customer.NewAccount;

import Server.Database.DatabaseAdapterImpl;

public class NewAccountModelImpl implements NewAccountModel
{
  private static NewAccountModel instance;

  private NewAccountModelImpl()
  {
  }

  public static NewAccountModel getInstance()
  {
    if(instance==null) instance = new NewAccountModelImpl();
    return instance;
  }

  public void newAccount(String username,String type, String amount)
  {
    DatabaseAdapterImpl.getInstance().newAccount(username,type,amount);
  }
}
