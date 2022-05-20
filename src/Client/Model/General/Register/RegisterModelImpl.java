package Client.Model.General.Register;

import Client.Networking.Client;

/**
 * Class that is implementing RegisterModel interface
 */
public class RegisterModelImpl implements RegisterModel
{
  private static RegisterModel instance;
  private Client client;

  /**
   * Constructor that initialises the client
   */
  private RegisterModelImpl(Client client)
  {
    this.client=client;
  }

  /**
   * Method that instantiates the singleton
   * @return instance object
   */
  public static RegisterModel getInstance(Client client)
  {
    if(instance==null) instance = new RegisterModelImpl(client);
    return instance;
  }

  /**
   * Method that signs up a user
   * @param userId the user Id
   * @param type the type of user
   * @param fName the first name of the user
   * @param lName the last name of the user
   * @param address the address of the user
   * @param dob the date of birth of the user
   * @param phone the phone number of the user
   */
  public void signup(String userId,String type, String fName, String lName, String address, String dob, String phone)
  {
    client.signup(userId,type,fName,lName,address,dob,phone);
  }
}
