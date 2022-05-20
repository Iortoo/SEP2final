package Client.Model.Customer.Profile;

import Client.Networking.Client;

/**
 * Class that is implementing ProfileModel interface
 */
public class ProfileModelImpl implements ProfileModel
{
  private static ProfileModel instance;
  private Client client;

  /**
   * Constructor that initialises the client
   */
  private ProfileModelImpl(Client client)
  {
    this.client=client;
  }

  /**
   * Method that instantiates the singleton
   * @return instance object
   */
  public static ProfileModel getInstance(Client client)
  {
    if(instance==null)instance=new ProfileModelImpl(client);
    return instance;
  }

  /**
   * Method that returns the full name of a user
   * @param userId the user ID
   * @return full name of a customer
   */
  public String getFullName(String userId)
  {
    return client.getFullName(userId);
  }

  /**
   * Method that is logs out a user
   */
  public void customerLogOut()
  {
    client.customerLogOut();
  }
}
