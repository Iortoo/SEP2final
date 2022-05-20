package Server.Model.Customer.Deposit;

import Server.Database.DatabaseAdapterImpl;
import Server.Database.Deposit.DepositDAOImpl;

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
    double add = Double.parseDouble(amount);
    DepositDAOImpl.getInstance().deposit(username,add,cardNo,cvv,expDate);
  }
}
