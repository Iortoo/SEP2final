package Client.Model.Customer.AccountList;

import Client.Networking.Client;

import java.util.ArrayList;

public class AccountListModelImpl implements AccountListModel
{
  private static AccountListModel instance;
  private Client client;

  private AccountListModelImpl(Client client)
  {
    this.client=client;
  }

  public static AccountListModel getInstance(Client client)
  {
    if(instance==null) instance = new AccountListModelImpl(client);
    return instance;
  }

  public ArrayList<String> getAccounts(String username)
  {
    return client.getAccounts(username);
  }
}
