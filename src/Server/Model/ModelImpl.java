package Server.Model;

public class ModelImpl //implements Model
{/*
  private static Model instance;
  private PropertyChangeSupport support;

  private ModelImpl()
  {
    support = new PropertyChangeSupport(this);
  }

  public static Model getInstance()
  {
    if(instance == null) instance = new ModelImpl();
    return instance;
  }

  // MOVED
  public int getLogin(String username, String password)
  {
    int result = DatabaseAdapterImpl.getInstance().loginQuery(username,password);
    System.out.println(result);
    return result;
  }

  // MOVED
  public void signup(String username,String type, String fName, String lName, String address, String dob, String phone)
  {
    DatabaseAdapterImpl.getInstance().signup(username,type,fName,lName,address,dob,phone);
  }
  // MOVED
  public void deposit(String username,String amount,String cardNo,String cvv,String expDate)
  {
    DatabaseAdapterImpl.getInstance().deposit(username,amount,cardNo,cvv,expDate);
  }
  // MOVED
  public void withdraw(String username,String amount,String cardNo,String cvv,String expDate)
  {
    DatabaseAdapterImpl.getInstance().withdraw(username,amount,cardNo,cvv,expDate);
  }
  // MOVED
  public void requestInfoChange(String fmName,String lName,String username,String adress,String dobD,String dobM,String dobY,String phone)
  {
    DatabaseAdapterImpl.getInstance().requestInfoChange(fmName,lName,username,adress,dobD,dobM,dobY,phone);
  }
  // MOVED
  public void newAccount(String username,String type, String amount)
  {
    DatabaseAdapterImpl.getInstance().newAccount(username,type,amount);
  }
  // MOVED
  public String getBalance(String username)
  {
    return DatabaseAdapterImpl.getInstance().getBalance(username);
  }
  // MOVED
  public int transfer(String username,String accountNo,String recAccNo,String recSwift,String amount)
  {
    return DatabaseAdapterImpl.getInstance().transfer(username,accountNo,recAccNo,recSwift,amount);
  }

  // MOVED
  public String getFullName(String username)
  {
    return DatabaseAdapterImpl.getInstance().getFullName(username);
  }
  // MOVED
  public String[] getInfo(String username)
  {
    return DatabaseAdapterImpl.getInstance().getInfo(username);
  }

  // MOVED
  public ArrayList<String> getRequests()
  {
    return DatabaseAdapterImpl.getInstance().getRequests();
  }
  // MOVED
  public void acceptRequest(String requestId)
  {
    DatabaseAdapterImpl.getInstance().acceptRequest(requestId);
  }
  // MOVED
  public void denyRequest(String requestId)
  {
    DatabaseAdapterImpl.getInstance().denyRequest(requestId);
  }
  // MOVED
  public ArrayList<String> getAccounts(String username)
  {
    return DatabaseAdapterImpl.getInstance().getAccounts(username);
  }
  // MOVED
  public ArrayList<String> getRequestInfo(String requestId)
  {
    return DatabaseAdapterImpl.getInstance().getRequestInfo(requestId);
  }
  //MOVED
  public ArrayList<String> getLoans(String username)
  {
    return DatabaseAdapterImpl.getInstance().getLoans(username);
  }
  // MOVED
  public ArrayList<String> getTransactions(String accountNo)
  {
    return DatabaseAdapterImpl.getInstance().getTransactions(accountNo);
  }

  // MOVED
  public ArrayList<String> getTransfers(String accountNo)
  {
    return DatabaseAdapterImpl.getInstance().getTransfers(accountNo);
  }

  public void addListener(String event, PropertyChangeListener listener)
  {
    support.addPropertyChangeListener(event,listener);
  }

  public void removeListener(String event, PropertyChangeListener listener)
  {
    support.addPropertyChangeListener(event,listener);
  }
  */
}
