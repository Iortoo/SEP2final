package Server.Model.Customer.Loans;

import Server.Database.DatabaseAdapterImpl;

import java.util.ArrayList;

public class LoansModelImpl implements LoansModel
{
  private static LoansModel instance;

  private LoansModelImpl()
  {
  }

  public static LoansModel getInstance()
  {
    if(instance==null) instance=new LoansModelImpl();
    return instance;
  }

  public ArrayList<String> getLoans(String username)
  {
    return DatabaseAdapterImpl.getInstance().getLoans(username);
  }
}
