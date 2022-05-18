package SharedResources.Networking.ServerSide;

import SharedResources.Networking.ClientSide.ClientCallBack;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public interface EmployeeServer extends Remote, Serializable
{
  void setClients(List<ClientCallBack> clients) throws RemoteException;
  ArrayList<String> getRequests()throws RemoteException;
  void acceptRequest(String requestId)throws RemoteException;
  void denyRequest(String requestId)throws RemoteException;
  void logout() throws RemoteException;
  ArrayList<String> getRequestInfo(String requestId)throws RemoteException;

}
