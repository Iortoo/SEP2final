package Server.Model.Customer.Overview;

import Server.Database.DatabaseAdapterImpl;

import java.util.ArrayList;

public class OverviewModelImpl implements OverviewModel
{
  private static OverviewModel instance;

  private OverviewModelImpl()
  {
  }

  public static OverviewModel getInstance()
  {
    if(instance==null) instance=new OverviewModelImpl();
    return instance;
  }

  public String getBalance(String username)
  {
    return DatabaseAdapterImpl.getInstance().getBalance(username);
  }

  public ArrayList<String> getTransactions(String accountNo)
  {
    return DatabaseAdapterImpl.getInstance().getTransactions(accountNo);
  }
}
