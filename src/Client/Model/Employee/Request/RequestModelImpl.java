package Client.Model.Employee.Request;

import Client.Networking.Client;

import java.util.ArrayList;

/**
 * Class that is implementing RequestModel interface
 */
public class RequestModelImpl implements RequestModel
{
  private static RequestModel instance;
  private Client client;

  /**
   * Constructor that initialises the client
   */
  private RequestModelImpl(Client client)
  {
    this.client=client;
  }

  /**
   * Method that instantiates the singleton
   * @return instance object
   */
  public static RequestModel getInstance(Client client)
  {
    if(instance==null) instance= new RequestModelImpl(client);
    return instance;
  }

  /**
   * Method that returns the information of a request
   * @param requestId the request ID
   * @return information list
   */
  public ArrayList<String> getRequestInfo(String requestId)
  {
    return client.getRequestInfo(requestId);
  }

  /**
   * Method that accepts the request
   * @param requestId the request ID
   */
  public void acceptRequest(String requestId)
  {
    client.acceptRequest(requestId);
  }

  /**
   * Method that denies a request
   * @param requestId the request ID
   */
  public void denyRequest(String requestId)
  {
    client.denyRequest(requestId);
  }
}
