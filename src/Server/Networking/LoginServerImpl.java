package Server.Networking;

import Server.Model.General.Login.LoginModelImpl;
import Server.Model.General.Register.RegisterModelImpl;
import SharedResources.Networking.ClientSide.ClientCallBack;
import SharedResources.Networking.ServerSide.LoginServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class LoginServerImpl implements LoginServer
{
  private static LoginServerImpl instance;
  private List<ClientCallBack> clients;

  private LoginServerImpl() throws RemoteException
  {
    UnicastRemoteObject.exportObject(this,0);
  }

  public static LoginServerImpl getInstance() throws RemoteException
  {
    if(instance==null)instance=new LoginServerImpl();
    return instance;
  }

  public void signup(String username,String type, String fName, String lName, String address, String dob, String phone)throws RemoteException
  {
    RegisterModelImpl.getInstance().signup(username,type,fName,lName,address,dob,phone);
  }

  public int login(String username, String password) throws RemoteException
  {
    int result = LoginModelImpl.getInstance().getLogin(username,password);
    if(result==4) ServerImpl.getInstance().sendToEmployeeServer(clients);
    if(result==1) ServerImpl.getInstance().sendToCustomerServer(clients);
    return LoginModelImpl.getInstance().getLogin(username,password);
  }

  public void setClients(List<ClientCallBack> clients) throws RemoteException
  {
    this.clients=clients;
  }
}
