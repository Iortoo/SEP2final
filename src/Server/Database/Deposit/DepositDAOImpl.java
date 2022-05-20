package Server.Database.Deposit;

import Server.Database.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;

public class DepositDAOImpl implements DepositDAO
{
  private static DepositDAO instance;

  private DepositDAOImpl()
  {
  }

  public static DepositDAO getInstance()
  {
    if(instance==null) instance = new DepositDAOImpl();
    return instance;
  }

  public void deposit(String accountNo, double amount,String cardNo,String cvv,String expDate)
  {
    System.out.println(accountNo+" "+amount);
    try(Connection connection= DatabaseConnection.getConnection()){
      Class.forName("org.postgresql.Driver");

      String sql = "update account\n"
          + "set balance = balance+?\n"
          + "where accountNo=?";

      PreparedStatement preparedStatement = connection.prepareStatement(sql.toLowerCase(
          Locale.ROOT));

      preparedStatement.setDouble(1, amount);
      preparedStatement.setString(2, accountNo);
      ResultSet resultSet = preparedStatement.executeQuery();
      connection.close();
      resultSet.close();
      preparedStatement.close();
      System.out.println("DEPOSIT DONE");
    }
    catch (SQLException | ClassNotFoundException exception)
    {
      exception.printStackTrace();

      System.out.println("DEPOSIT ERROR");
    }
  }
}
