package Client.Model.Customer.AccountList;

import Client.Networking.Client;

import java.util.ArrayList;

/**
 * @author
 * Class that is implementing AccountListModel interface
 */
public class AccountListModelImpl implements AccountListModel
{
  private static AccountListModel instance;
  private Client client;

  /**
   * Constructor that initialises the client
   */
  private AccountListModelImpl(Client client)
  {
    this.client=client;
  }

  /**
   * Method that instantiates the singleton
   * @return instance object
   */
  public static AccountListModel getInstance(Client client)
  {
    if(instance==null) instance = new AccountListModelImpl(client);
    return instance;
  }

  /**
   * Method that returns the accounts of a user
   * @param userId the user ID
   * @return list of accounts
   */
  public ArrayList<String> getAccounts(String userId)
  {
    return client.getAccounts(userId);
  }
}
