package Server.Database.Balance;

import Server.Database.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;

public class BalanceDAOImpl implements BalanceDAO
{
  private static BalanceDAO instance;

  private BalanceDAOImpl(){}

  public static BalanceDAO getInstance()
  {
    if (null == instance)
      instance = new BalanceDAOImpl();
    return instance;

  }

  @Override public String getBalance(String accountno)
  {
    try(Connection connection = DatabaseConnection.getConnection())
    {
      Class.forName("org.postgresql.Driver");

      String sql = "select * from account where accountno = ?";

      PreparedStatement preparedStatement = connection.prepareStatement(sql.toLowerCase(
          Locale.ROOT));

      preparedStatement.setString(1, accountno);

      ResultSet resultSet = preparedStatement.executeQuery();

      String balance = "";
      if (resultSet.next())
      {
        balance = resultSet.getString("balance");
      }
      connection.close();
      resultSet.close();
      preparedStatement.close();
      System.out.println(balance+"BALANCE");
      return balance;
    }
    catch (SQLException | ClassNotFoundException exception)
    {
      exception.printStackTrace();
      return "Error";
    }
  }
}
