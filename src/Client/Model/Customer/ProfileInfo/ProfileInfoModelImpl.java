  package Client.Model.Customer.ProfileInfo;

import Client.Networking.Client;

public class ProfileInfoModelImpl implements ProfileInfoModel
{
  private static ProfileInfoModel instance;
  private Client client;

  private ProfileInfoModelImpl(Client client)
  {
    this.client=client;
  }

  public static ProfileInfoModel getInstance(Client client)
  {
    if(instance==null)instance=new ProfileInfoModelImpl(client);
    return instance;
  }

  public void requestInfoChange(String fmName,String lName,String username,String adress,String dobD,String dobM,String dobY,String phone)
  {
    client.requestInfoChange(fmName,lName,username,adress,dobD,dobM,dobY,phone);
  }

  public String[] getInfo(String username)
  {
    return client.getInfo(username);
  }

}
