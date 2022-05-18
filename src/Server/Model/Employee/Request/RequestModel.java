package Server.Model.Employee.Request;

import java.util.ArrayList;

public interface RequestModel
{
  ArrayList<String> getRequestInfo(String requestId);
  void acceptRequest(String requestId);
  void denyRequest(String requestId);
}
