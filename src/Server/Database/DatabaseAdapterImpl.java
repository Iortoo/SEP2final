package Server.Database;

import java.util.ArrayList;

public class DatabaseAdapterImpl implements  DatabaseAdapter
{
  private static DatabaseAdapterImpl instance;

  private DatabaseAdapterImpl()
  {

  }

  public static DatabaseAdapterImpl getInstance()
  {
    if(instance==null) instance = new DatabaseAdapterImpl();
    return instance;
  }

  public int loginQuery(String username, String password)
  {/*
    if(username==null || password==null) return 3;
    try{
      Class.forName("org.postgresql.Driver");

      String url = "jdbc:postgresql://localhost:5432/postgres";
      String user = "admin";
      String pw = "postgres";
      Connection connection = DriverManager.getConnection(url,user,pw);

      String sql = "set schema SEP27eleven"
          + "SELECT id, password FROM customer "
          + "where id = ? and password = ?";

      PreparedStatement statement = connection.prepareStatement(sql);
      statement.setString(1,username);
      statement.setString(2,password);
      ResultSet resultSet = statement.executeQuery();
      while(resultSet.next())
      {
        int columns = resultSet.getMetaData().getColumnCount();
        for(int i=0;i<columns;i++)
        {
          String resultUsername = (String)resultSet.getObject(i+1);
          System.out.println(resultUsername);
        }
      }
      resultSet.close();
      statement.close();
      connection.close();
    }
    catch (ClassNotFoundException | SQLException e){
      System.out.println(e.getMessage());
    }
*/
    boolean customer=false, employee=false;
    if(username==null || password==null) return 3;
    if(username.equals("Customer"))
    {
      customer=true;
      if(password.equals("1234"))return 1;
    }
    if(username.equals("Employee"))
    {
      employee=true;
      if(password.equals("5678"))return 4;
    }
    if(customer||employee)return 0;
    return 2;
  }

  public void signup(String username,String type, String fName, String lName, String address, String dob, String phone)
  {
    // add a request in the table to open up a new customer account
  }

  public void deposit(String username, String amount,String cardNo,String cvv,String expDate)
  {
    // add to the deposit table
    // modify the account balance accordingly
  }

  public void withdraw(String username, String amount,String cardNo,String cvv,String expDate)
  {
    //add to the withdraw table
    //modify the account balance accordingly
  }

  public String getBalance(String username)
  {
    // return the account balance
    return "0";
  }

  public int transfer(String username,String accountNo,String recAccNo,String recSwift,String amount)
  {
    // check to see what type of transfer is
    // then add to corresponding table in database
    // return 1 if regular transfer
    // return 0 if external/big transfer

    // if is a big/external transfer also add to the request table
    return 1;
  }

  public String getFullName(String username)
  {
    // return full name based on username
    return "John Johnson";
  }

  public void requestInfoChange(String fmName,String lName,String username,String adress,String dobD,String dobM,String dobY,String phone)
  {
    // add a request to the request table to change credentials
  }

  public String[] getInfo(String username)
  {
    // return an arraylist like this:
    String[] rtrn ={"John","Johnson","123456","StreetFullOfBugs","01","02","1993","11223344"};
    return rtrn;
  }

  public void newAccount(String username,String type, String amount)
  {
    // add to user's accounts table
  }

  public ArrayList<String> getRequests()
  {
    // return the whole requests table structured accordingly

    ArrayList<String> rtrn = new ArrayList<>();

    rtrn.add("DummySignUpRequest");
    rtrn.add("DummyExternalTransferRequest");
    rtrn.add("DummyBigTransferRequest");
    rtrn.add("DummyBigExternalTransferRequest");
    rtrn.add("DummyInfoChangeRequest");

    return rtrn;
  }

  public void acceptRequest(String requestId)
  {
    // remove request from table
    // based on what type of request it is
    // make the adequate changes to the database
    // ex. create an account if new account request
  }

  public void denyRequest(String requestId)
  {
    // remove request from table
  }

  public ArrayList<String> getAccounts(String username)
  {
    // return accountNos based on username (id)

    ArrayList<String> rtrn = new ArrayList<>();
    rtrn.add("Dummy account");
    return rtrn;
  }

  public ArrayList<String> getRequestInfo(String requestId)
  {
    //return request-related info based on id

    ArrayList<String> rtrn = new ArrayList<>();

    rtrn.add("transfer");
    rtrn.add("Customer");
    rtrn.add("Bob bobson");
    rtrn.add("Request from Bob,\nHello Bob!");
    return rtrn;
  }

  public ArrayList<String> getLoans(String username)
  {
    // return loanIds based on username

    ArrayList<String> rtrn = new ArrayList<>();
    rtrn.add("Dummy Loan");
    return rtrn;
  }

  public ArrayList<String> getTransactions(String accountNo)
  {
    // return all transactions based on accountNo
    ArrayList<String> rtrn = new ArrayList<>();
    rtrn.add("Withdrawal ex");
    rtrn.add("Deposit ex");
    rtrn.add("External Transfer ex");
    rtrn.add("Internal Transfer ex");
    System.out.println("A");
    return rtrn;
  }

  public ArrayList<String> getTransfers(String accountNo)
  {
    // return all transfers based on accountNo
    ArrayList<String> rtrn = new ArrayList<>();
    rtrn.add("External Transfer ex");
    rtrn.add("Internal Transfer ex");
    return rtrn;
  }
}
