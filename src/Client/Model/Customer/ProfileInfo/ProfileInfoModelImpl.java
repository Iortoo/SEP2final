  package Client.Model.Customer.ProfileInfo;

import Client.Networking.Client;

  /**
   * @author
   * Class that is implementing ProfileInfoModel interface
   */
public class ProfileInfoModelImpl implements ProfileInfoModel
{
  private static ProfileInfoModel instance;
  private Client client;

  /**
   * Constructor that initialises the client
   */
  private ProfileInfoModelImpl(Client client)
  {
    this.client=client;
  }

  /**
   * Method that instantiates the singleton
   * @return instance object
   */
  public static ProfileInfoModel getInstance(Client client)
  {
    if(instance==null)instance=new ProfileInfoModelImpl(client);
    return instance;
  }

  /**
   * Method that makes a request to change the information about a customer
   * @param fName the full name
   * @param lName the last name
   * @param userId the user ID
   * @param adress the address
   * @param dobD the day from the date of birth
   * @param dobM the month from the date of birt
   * @param dobY the year from the date of birt
   * @param phone the phone number
   */
  public void requestInfoChange(String fName,String lName,String userId,String adress,String dobD,String dobM,String dobY,String phone)
  {
    client.requestInfoChange(fName,lName,userId,adress,dobD,dobM,dobY,phone);
  }

  /**
   * Methot that returns the information of a user
   * @param userId the user ID
   * @return information of a user
   */
  public String[] getInfo(String userId)
  {
    return client.getInfo(userId);
  }

}
