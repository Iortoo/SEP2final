package Server.Model.Customer.MakeTransfer;

import Server.Database.DatabaseAdapterImpl;

public class MakeTransferModelImpl implements MakeTransferModel
{
  private static MakeTransferModel instance;

  private MakeTransferModelImpl()
  {
  }

  public static MakeTransferModel getInstance()
  {
    if(instance==null) instance=new MakeTransferModelImpl();
    return instance;
  }

  public int transfer(String username,String accountNo,String recAccNo,String recSwift,String amount)
  {
    return DatabaseAdapterImpl.getInstance().transfer(username,accountNo,recAccNo,recSwift,amount);
  }
}
