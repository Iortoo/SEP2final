package Client.Model.Customer.Withdrawal;

import Client.Networking.Client;

public class WithdrawalModelImpl implements WithdrawalModel
{
  private static WithdrawalModel instance;
  private Client client;

  private WithdrawalModelImpl(Client client)
  {
    this.client=client;
  }

  public static WithdrawalModel getInstance(Client client)
  {
    if(instance==null) instance=new WithdrawalModelImpl(client);
    return instance;
  }

  public void withdraw(String username,String amount,String cardNo,String cvv,String expDate)
  {
    client.withdraw(username,amount,cardNo,cvv,expDate);
  }
}
