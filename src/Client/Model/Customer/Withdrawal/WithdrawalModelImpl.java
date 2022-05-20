package Client.Model.Customer.Withdrawal;

import Client.Networking.Client;

/**
 * Class that is implementing WithdrawalModel interface
 */
public class WithdrawalModelImpl implements WithdrawalModel
{
  private static WithdrawalModel instance;
  private Client client;

  /**
   * Constructor that initialises the client
   */
  private WithdrawalModelImpl(Client client)
  {
    this.client=client;
  }

  /**
   * Method that instantiates the singleton
   * @return instance object
   */
  public static WithdrawalModel getInstance(Client client)
  {
    if(instance==null) instance=new WithdrawalModelImpl(client);
    return instance;
  }

  /**
   * Method that does the withdrawal
   * @param userId the user ID
   * @param amount the amount to withdraw
   * @param cardNo the card number
   * @param cvv the CVV of the card
   * @param expDate the expiry date of the card
   */
  public void withdraw(String userId,String amount,String cardNo,String cvv,String expDate)
  {
    client.withdraw(userId,amount,cardNo,cvv,expDate);
  }
}
