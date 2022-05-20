package Server.Model.Customer.Overview;

import Server.Database.Balance.BalanceDAOImpl;
import Server.Database.DatabaseAdapterImpl;
import Server.Database.Transaction.TransactionDAOImpl;

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
    return BalanceDAOImpl.getInstance().getBalance(username);
  }

  public ArrayList<String> getTransactions(String accountNo)
  {
    return TransactionDAOImpl.getInstance().getTransactions(accountNo);
  }
}
