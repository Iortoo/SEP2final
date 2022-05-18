package Client.View.Employee.Request;

import Client.Model.Employee.Request.RequestModel;

import java.util.ArrayList;

public class RequestViewModel
{
  private RequestModel model;

  public RequestViewModel(RequestModel model)
  {
    this.model=model;
  }

  public void acceptRequest(String requestId)
  {
    model.acceptRequest(requestId);
  }

  public void denyRequest(String requestId)
  {
    model.denyRequest(requestId);
  }

  public ArrayList<String> getRequestInfo(String username)
  {
    return model.getRequestInfo(username);
  }
}
