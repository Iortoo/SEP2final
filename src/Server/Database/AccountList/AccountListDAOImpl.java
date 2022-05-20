package Server.Database.AccountList;

import Server.Database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Locale;

public class AccountListDAOImpl implements AccountListDAO
{
  private static AccountListDAO instance;

  private AccountListDAOImpl()
  {

  }

  public static AccountListDAO getInstance()
  {
    if(instance==null) instance = new AccountListDAOImpl();
    return instance;
  }


  @Override public ArrayList<String> getAccounts(String username)
  {
    try(Connection connection = DatabaseConnection.getConnection())
    {
      System.out.println(username);

      ArrayList<String> accounts = new ArrayList<>();

      Class.forName("org.postgresql.Driver");

      String sql = "select * from account where ownerid = ?";

      PreparedStatement preparedStatement = connection.prepareStatement(sql.toLowerCase(
          Locale.ROOT));
      preparedStatement.setString(1, username);

      ResultSet resultSet = preparedStatement.executeQuery();
      while (resultSet.next())
      {
        //System.out.println(resultSet.first());
        accounts.add(resultSet.getString("accountno"));
      }
      connection.close();
      resultSet.close();
      preparedStatement.close();
      return accounts;
    }
    catch (SQLException | ClassNotFoundException exception)
    {
      exception.printStackTrace();
      return new ArrayList<String>();
    }
  }
}
