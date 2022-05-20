package Client.Model.Customer.Transfers;

import Client.Networking.Client;

import java.util.ArrayList;

/**
 * Class that is implementing the TransfersModel interface
 */
public class TransfersModelImpl implements TransfersModel
{
  private static TransfersModel instance;
  private Client client;

  /**
   * Constructor that initialises the client
   */
  private TransfersModelImpl(Client client)
  {
    this.client=client;
  }

  /**
   * Method that instantiates the singleton
   * @return instance object
   */
  public static TransfersModel getInstance(Client client)
  {
    if(instance==null) instance=new TransfersModelImpl(client);
    return instance;
  }

  /**
   * Method that returns the transfers of an account
   * @param accountNo the account number
   * @return list of transfers
   */
  public ArrayList<String> getTransfers(String accountNo)
  {
    return client.getTransfers(accountNo);
  }
}
