package Server.Model.Customer.Withdrawal;

import Server.Database.DatabaseAdapterImpl;
import Server.Database.Withdraw.WithdrawDAOImpl;

public class WithdrawalModelImpl implements WithdrawalModel
{
  private static WithdrawalModel instance;

  private WithdrawalModelImpl()
  {
  }

  public static WithdrawalModel getInstance()
  {
    if(instance==null) instance=new WithdrawalModelImpl();
    return instance;
  }

  public void withdraw(String username,String amount,String cardNo,String cvv,String expDate)
  {
    double take = Double.parseDouble(amount);
    WithdrawDAOImpl.getInstance().withdraw(username,take,cardNo,cvv,expDate);
  }
}
