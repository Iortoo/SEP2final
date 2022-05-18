package Client.Model.Customer.Deposit;

import Client.Networking.Client;

public class DepositModelImpl implements DepositModel
{
  private static DepositModel instance;
  private Client client;

  private DepositModelImpl(Client client)
  {
    this.client=client;
  }

  public static DepositModel getInstance(Client client)
  {
    if(instance==null) instance=new DepositModelImpl(client);
    return instance;
  }

  public void deposit(String username,String amount,String cardNo,String cvv,String expDate)
  {
    client.deposit(username,amount,cardNo,cvv,expDate);
  }
}
