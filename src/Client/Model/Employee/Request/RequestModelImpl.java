package Client.Model.Employee.Request;

import Client.Networking.Client;

import java.util.ArrayList;

public class RequestModelImpl implements RequestModel
{
  private static RequestModel instance;
  private Client client;

  private RequestModelImpl(Client client)
  {
    this.client=client;
  }

  public static RequestModel getInstance(Client client)
  {
    if(instance==null) instance= new RequestModelImpl(client);
    return instance;
  }

  public ArrayList<String> getRequestInfo(String requestId)
  {
    return client.getRequestInfo(requestId);
  }

  public void acceptRequest(String requestId)
  {
    client.acceptRequest(requestId);
  }

  public void denyRequest(String requestId)
  {
    client.denyRequest(requestId);
  }
}
