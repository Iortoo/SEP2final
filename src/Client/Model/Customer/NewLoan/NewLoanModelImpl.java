package Client.Model.Customer.NewLoan;

import Client.Networking.Client;

/**
 * @author
 * Class that is implementing NewLoanModel interface
 */
public class NewLoanModelImpl implements NewLoanModel
{
  private static NewLoanModel instance;
  private Client client;

  /**
   * Constructor that initialises the client
   */
  private NewLoanModelImpl(Client client)
  {
    this.client=client;
  }

  /**
   * Method that instantiates the singleton
   * @return instance object
   */
  public static NewLoanModel getInstance(Client client)
  {
    if(instance==null) instance=new NewLoanModelImpl(client);
    return instance;
  }
}
