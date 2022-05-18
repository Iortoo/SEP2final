package Client.Model.Customer.Transfers;

import Client.Networking.Client;

import java.util.ArrayList;

public class TransfersModelImpl implements TransfersModel
{
  private static TransfersModel instance;
  private Client client;

  private TransfersModelImpl(Client client)
  {
    this.client=client;
  }

  public static TransfersModel getInstance(Client client)
  {
    if(instance==null) instance=new TransfersModelImpl(client);
    return instance;
  }

  public ArrayList<String> getTransfers(String accountNo)
  {
    return client.getTransfers(accountNo);
  }
}
