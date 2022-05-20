package Client.Model.Customer.MakeTransfer;

import Client.Networking.Client;

/**
 * @author
 * Class that is implementing MakeTransferModel interface
 */
public class MakeTransferModelImpl implements MakeTransferModel
{
  private static MakeTransferModel instance;
  private Client client;

  /**
   * Constructor that initialises the client
   */
  private MakeTransferModelImpl(Client client)
  {
    this.client=client;
  }

  /**
   * Method that instantiates the singleton
   * @return instance object
   */
  public static MakeTransferModel getInstance(Client client)
  {
    if(instance==null) instance=new MakeTransferModelImpl(client);
    return instance;
  }

  /**
   * Method that does the transfer
   * @param userId the user ID
   * @param accountNo the account number of the user
   * @param recAccNo the receiver account number
   * @param recSwift the receiver SWIFT (Society for Worldwide Interbank Financial Telecommunications)
   * @param amount the amount that is transferred
   * @return an integer value that represents what type of transfer is made
   */
  public int transfer(String userId,String accountNo,String recAccNo,String recSwift,String amount)
  {
    return client.transfer(userId,accountNo,recAccNo,recSwift,amount);
  }
}
