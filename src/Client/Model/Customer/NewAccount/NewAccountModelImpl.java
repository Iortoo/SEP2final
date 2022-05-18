package Client.Model.Customer.NewAccount;

import Client.Networking.Client;

public class NewAccountModelImpl implements  NewAccountModel
{
  private static NewAccountModel instance;
  private Client client;

  private NewAccountModelImpl(Client client)
  {
    this.client=client;
  }

  public static NewAccountModel getInstance(Client client)
  {
    if(instance==null) instance = new NewAccountModelImpl(client);
    return instance;
  }

  public void newAccount(String username,String type, String amount)
  {
    client.newAccount(username,type,amount);
  }
}
