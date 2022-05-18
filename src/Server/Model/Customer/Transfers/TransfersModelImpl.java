package Server.Model.Customer.Transfers;

import Server.Database.DatabaseAdapterImpl;

import java.util.ArrayList;

public class TransfersModelImpl implements TransfersModel
{
  private static TransfersModel instance;

  private TransfersModelImpl()
  {
  }

  public static TransfersModel getInstance()
  {
    if(instance==null) instance=new TransfersModelImpl();
    return instance;
  }

  public ArrayList<String> getTransfers(String accountNo)
  {
    return DatabaseAdapterImpl.getInstance().getTransfers(accountNo);
  }
}
