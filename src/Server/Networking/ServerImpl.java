package Server.Networking;

import SharedResources.Networking.ClientSide.ClientCallBack;
import SharedResources.Networking.ServerSide.CustomerServer;
import SharedResources.Networking.ServerSide.EmployeeServer;
import SharedResources.Networking.ServerSide.LoginServer;
import SharedResources.Networking.ServerSide.Server;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ServerImpl implements Server
{
  private static ServerImpl instance;

  private LoginServer loginServer;
  private CustomerServer customerServer;
  private EmployeeServer employeeServer;
  private List<ClientCallBack> clients;

  private ServerImpl() throws RemoteException
  {
    this.loginServer=LoginServerImpl.getInstance();
    this.customerServer=CustomerServerImpl.getInstance();
    this.employeeServer=EmployeeServerImpl.getInstance();
    UnicastRemoteObject.exportObject(this,0);
    clients = new ArrayList<>();
  }

  public static ServerImpl getInstance() throws RemoteException
  {
    if(instance==null)instance=new ServerImpl();
    return instance;
  }

  public LoginServer getLoginServer() throws RemoteException
  {
    return loginServer;
  }

  public CustomerServer getCustomerServer()
  {
    return customerServer;
  }

  public EmployeeServer getEmployeeServer()
  {
    return employeeServer;
  }

  public void registerClient(ClientCallBack clientCallBack)
      throws RemoteException
  {
    clients.add(clientCallBack);
    sendToLoginServer(clients);
    System.out.println("CLIENT ADDED");
  }

  public void startServer() throws RemoteException, AlreadyBoundException
  {
    Registry registry = LocateRegistry.createRegistry(1099);
    registry.bind("Server",this);
    System.out.println("SERVER STARTED");
  }

  public void sendToLoginServer(List<ClientCallBack> clients) throws RemoteException
  {
    loginServer.setClients(clients);
  }

  public void sendToCustomerServer(List<ClientCallBack> clients) throws RemoteException
  {
    customerServer.setClients(clients);
  }

  public void sendToEmployeeServer(List<ClientCallBack> clients) throws RemoteException
  {
    employeeServer.setClients(clients);
  }

}
