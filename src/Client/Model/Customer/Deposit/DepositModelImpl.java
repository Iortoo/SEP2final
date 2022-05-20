package Client.Model.Customer.Deposit;

import Client.Networking.Client;

/**
 * @author
 * Class that is implementing DepositModel interface
 */
public class DepositModelImpl implements DepositModel
{
  private static DepositModel instance;
  private Client client;

  /**
   * Constructor that initialises the client
   */
  private DepositModelImpl(Client client)
  {
    this.client=client;
  }

  /**
   * Method that instantiates the singleton
   * @return instance object
   */
  public static DepositModel getInstance(Client client)
  {
    if(instance==null) instance=new DepositModelImpl(client);
    return instance;
  }

  /**
   * Method that makes the deposit
   * @param accountNo the account number
   * @param amount the amount to deposit
   * @param cardNo the card number of the user
   * @param cvv the Card Verification Value of the user
   * @param expDate the expiry date of the card
   */
  public void deposit(String accountNo,String amount,String cardNo,String cvv,String expDate)
  {
    client.deposit(accountNo,amount,cardNo,cvv,expDate);
  }
}
