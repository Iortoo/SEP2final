package Server.Model.Customer.Deposit;

import Server.Database.DatabaseAdapterImpl;

public class DepositModelImpl implements DepositModel
{
  private static DepositModel instance;

  private DepositModelImpl()
  {
  }

  public static DepositModel getInstance()
  {
    if(instance==null) instance=new DepositModelImpl();
    return instance;
  }

  public void deposit(String username,String amount,String cardNo,String cvv,String expDate)
  {
    DatabaseAdapterImpl.getInstance().deposit(username,amount,cardNo,cvv,expDate);
  }
}
