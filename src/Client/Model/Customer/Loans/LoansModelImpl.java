package Client.Model.Customer.Loans;

import Client.Networking.Client;

import java.util.ArrayList;

/**
 * @author
 * Class that is implementing the LoandsModel interface
 */
public class LoansModelImpl implements LoansModel
{
  private static LoansModel instance;
  private Client client;

  /**
   * Constructor that initialises the client
   */
  private LoansModelImpl(Client client)
  {
    this.client=client;
  }

  /**
   * Method that instantiates the singleton
   * @return instance object
   */
  public static LoansModel getInstance(Client client)
  {
    if(instance==null) instance=new LoansModelImpl(client);
    return instance;
  }

  /**
   * Method that returns the loans of a user
   * @param userId the user ID
   * @return list of loans
   */
  public ArrayList<String> getLoans(String userId)
  {
    return client.getLoans(userId);
  }
}
