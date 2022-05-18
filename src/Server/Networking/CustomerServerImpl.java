package Server.Networking;

import Server.Model.Customer.AccountList.AccountListModelImpl;
import Server.Model.Customer.Deposit.DepositModelImpl;
import Server.Model.Customer.Loans.LoansModelImpl;
import Server.Model.Customer.MakeTransfer.MakeTransferModelImpl;
import Server.Model.Customer.NewAccount.NewAccountModelImpl;
import Server.Model.Customer.Overview.OverviewModelImpl;
import Server.Model.Customer.Profile.ProfileModelImpl;
import Server.Model.Customer.ProfileInfo.ProfileInfoModelImpl;
import Server.Model.Customer.Transfers.TransfersModelImpl;
import Server.Model.Customer.Withdrawal.WithdrawalModelImpl;
import SharedResources.Networking.ClientSide.ClientCallBack;
import SharedResources.Networking.ServerSide.CustomerServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class CustomerServerImpl implements CustomerServer
{
  private static CustomerServerImpl instance;
  private List<ClientCallBack> clients;

  private CustomerServerImpl() throws RemoteException
  {
    UnicastRemoteObject.exportObject(this,0);
  }

  public static CustomerServerImpl getInstance() throws RemoteException
  {
    if(instance==null)instance=new CustomerServerImpl();
    return instance;
  }

  public void setClients(List<ClientCallBack> clients)
  {
    this.clients=clients;
  }

  public void deposit(String username,String amount,String cardNo,String cvv, String expDate)
  {
    DepositModelImpl.getInstance().deposit(username,amount,cardNo,cvv,expDate);
  }

  public void withdraw(String username,String amount,String cardNo,String cvv, String expDate)
  {
    WithdrawalModelImpl.getInstance().withdraw(username,amount,cardNo,cvv,expDate);
  }

  public void requestInfoChange(String fmName,String lName,String username,String adress,String dobD,String dobM,String dobY,String phone)throws RemoteException
  {
    ProfileInfoModelImpl.getInstance().requestInfoChange(fmName,lName,username,adress,dobD,dobM,dobY,phone);
  }

  public void newAccount(String username,String type, String amount)throws RemoteException
  {
    NewAccountModelImpl.getInstance().newAccount(username,type,amount);
  }

  public String getBalance(String username) throws RemoteException
  {
    return OverviewModelImpl.getInstance().getBalance(username);
  }

  public int transfer(String username,String accountNo,String recAccNo,String recSwift,String amount)throws RemoteException
  {
    return MakeTransferModelImpl.getInstance().transfer(username,accountNo,recAccNo,recSwift,amount);
  }

  public String getFullName(String username) throws RemoteException
  {
    return ProfileModelImpl.getInstance().getFullName(username);
  }

  public String[] getInfo(String username) throws RemoteException
  {
    return ProfileInfoModelImpl.getInstance().getInfo(username);
  }

  public void logout() throws RemoteException
  {
    ServerImpl.getInstance().sendToLoginServer(clients);
  }

  public ArrayList<String> getAccounts(String username) throws RemoteException
  {
    return AccountListModelImpl.getInstance().getAccounts(username);
  }

  public ArrayList<String> getLoans(String username) throws RemoteException
  {
    return LoansModelImpl.getInstance().getLoans(username);
  }

  public ArrayList<String> getTransactions(String accountNo) throws RemoteException
  {
    return OverviewModelImpl.getInstance().getTransactions(accountNo);
  }

  public ArrayList<String> getTransfers(String accountNo) throws RemoteException
  {
    return TransfersModelImpl.getInstance().getTransfers(accountNo);
  }
}
