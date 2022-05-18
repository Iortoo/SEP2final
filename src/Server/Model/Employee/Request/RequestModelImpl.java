package Server.Model.Employee.Request;

import Server.Database.DatabaseAdapterImpl;

import java.util.ArrayList;

public class RequestModelImpl implements RequestModel
{
  private static RequestModel instance;

  private RequestModelImpl()
  {
  }

  public static RequestModel getInstance()
  {
    if(instance==null) instance= new RequestModelImpl();
    return instance;
  }

  public ArrayList<String> getRequestInfo(String requestId)
  {
    return DatabaseAdapterImpl.getInstance().getRequestInfo(requestId);
  }

  public void acceptRequest(String requestId)
  {
    DatabaseAdapterImpl.getInstance().acceptRequest(requestId);
  }

  public void denyRequest(String requestId)
  {
    DatabaseAdapterImpl.getInstance().denyRequest(requestId);
  }
}
