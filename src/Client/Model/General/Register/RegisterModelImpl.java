package Client.Model.General.Register;

import Client.Networking.Client;

public class RegisterModelImpl implements RegisterModel
{
  private static RegisterModel instance;
  private Client client;

  private RegisterModelImpl(Client client)
  {
    this.client=client;
  }

  public static RegisterModel getInstance(Client client)
  {
    if(instance==null) instance = new RegisterModelImpl(client);
    return instance;
  }

  public void signup(String username,String type, String fName, String lName, String address, String dob, String phone)
  {
    client.signup(username,type,fName,lName,address,dob,phone);
  }
}
