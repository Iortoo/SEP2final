package Client.Model.Customer.NewAccount;

import Client.Networking.Client;

/**
 * @author
 * Class that is implementing the NewAccountModel interface
 */
public class NewAccountModelImpl implements NewAccountModel
{
  private static NewAccountModel instance;
  private Client client;

  /**
   * Constructor that initialises the client
   */
  private NewAccountModelImpl(Client client)
  {
    this.client=client;
  }

  /**
   * Method the instantiates the singleton
   * @return instance object
   */
  public static NewAccountModel getInstance(Client client)
  {
    if(instance==null) instance = new NewAccountModelImpl(client);
    return instance;
  }

  /**
   * Method that creates a new account for a user
   * @param userId the user ID
   * @param type the type of account
   * @param amount the amount
   */
  public void newAccount(String userId,String type, String amount)
  {
    client.newAccount(userId,type,amount);
  }
}
