package Client.Model;

public class ModelImpl// implements Model
{/*
  private Client client;
  private PropertyChangeSupport support;

  public ModelImpl(Client client)
  {
    this.client=client;
    support = new PropertyChangeSupport(this);
    client.addListener("validation",this::validation);
    client.addListener("newBalance",this::newBalance);
  }

  // MOVED
  public void signup(String username,String type, String fName, String lName, String address, String dob, String phone)
  {
    client.signup(username,type,fName,lName,address,dob,phone);
  }

  // MOVED
  public void login(String username, String password)
  {
    client.login(username,password);
  }

  // MOVED
  public void employeeLogOut()
  {
    client.employeeLogOut();
  }
  // MOVED
  public void customerLogOut()
  {
    client.customerLogOut();
  }

  // MOVED
  private void validation(PropertyChangeEvent e)
  {
    support.firePropertyChange("validation",null,e.getNewValue());
  }
  // MOVED
  public void deposit(String username,String amount,String cardNo,String cvv,String expDate)
  {
    client.deposit(username,amount,cardNo,cvv,expDate);
  }
  // MOVED
  public String getBalance(String username)
  {
    return client.getBalance(username);
  }
  // MOVED
  public String getFullName(String username)
  {
    return client.getFullName(username);
  }
  // MOVED
  public void withdraw(String username,String amount,String cardNo,String cvv,String expDate)
  {
    client.withdraw(username,amount,cardNo,cvv,expDate);
  }
  // MOVED
  private void newBalance(PropertyChangeEvent e)
  {
    support.firePropertyChange("newBalance",null,"newBalance");
  }
  // MOVED
  public void requestInfoChange(String fmName,String lName,String username,String adress,String dobD,String dobM,String dobY,String phone)
  {
    client.requestInfoChange(fmName,lName,username,adress,dobD,dobM,dobY,phone);
  }
  // MOVED
  public String[] getInfo(String username)
  {
    return client.getInfo(username);
  }
  // MOVED
  public void newAccount(String username,String type, String amount)
  {
    client.newAccount(username,type,amount);
  }
  // MOVED
  public int transfer(String username,String accountNo,String recAccNo,String recSwift,String amount)
  {
    return client.transfer(username,accountNo,recAccNo,recSwift,amount);
  }
  // MOVED
  public ArrayList<String> getRequests()
  {
    return client.getRequests();
  }
  // MOVED
  public void acceptRequest(String requestId)
  {
    client.acceptRequest(requestId);
  }
  // MOVED
  public void denyRequest(String requestId)
  {
    client.denyRequest(requestId);
  }
  // MOVED
  public ArrayList<String> getAccounts(String username)
  {
    return client.getAccounts(username);
  }
  // MOVED
  public ArrayList<String> getRequestInfo(String requestId)
  {
    return client.getRequestInfo(requestId);
  }
  // MOVED
  public ArrayList<String> getLoans(String username)
  {
    return client.getLoans(username);
  }
  // MOVED
  public ArrayList<String> getTransactions(String accountNo)
  {
    return client.getTransactions(accountNo);
  }
  // MOVED
  public ArrayList<String> getTransfers(String accountNo)
  {
    return client.getTransfers(accountNo);
  }

  public void addListener(String event, PropertyChangeListener listener)
  {
    support.addPropertyChangeListener(event,listener);
  }

  public void removeListener(String event, PropertyChangeListener listener)
  {
    support.removePropertyChangeListener(event,listener);
  }
  */
}

