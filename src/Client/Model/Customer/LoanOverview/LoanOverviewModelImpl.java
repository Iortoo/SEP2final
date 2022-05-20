package Client.Model.Customer.LoanOverview;

import Client.Networking.Client;

/**
 * @author
 * Class that is implementing LoanOverviewModel interface
 */
public class LoanOverviewModelImpl implements LoanOverviewModel
{
  private static LoanOverviewModel instance;
  private Client client;

  /**
   * Constructor that initialises the client
   */
  private  LoanOverviewModelImpl(Client client)
  {
    this.client=client;
  }

  /**
   * Method that instantiates the singleton
   * @return instance object
   */
  public static LoanOverviewModel getInstance(Client client)
  {
    if(instance==null) instance = new LoanOverviewModelImpl(client);
    return instance;
  }
}
