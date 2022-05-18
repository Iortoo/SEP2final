package Client.Core;
import Client.Networking.Client;
import Client.Networking.ClientImpl;

public class ClientFactory
{

  private Client client;

  public Client getClient()
  {
    if(client==null)client = new ClientImpl();
    return client;
  }
}
