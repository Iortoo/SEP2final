package Client.Model.Customer.Profile;

import Client.Networking.Client;

public class ProfileModelImpl implements ProfileModel
{
  private static ProfileModel instance;
  private Client client;

  private ProfileModelImpl(Client client)
  {
    this.client=client;
  }

  public static ProfileModel getInstance(Client client)
  {
    if(instance==null)instance=new ProfileModelImpl(client);
    return instance;
  }

  public String getFullName(String username)
  {
    return client.getFullName(username);
  }

  public void customerLogOut()
  {
    client.customerLogOut();
  }
}
