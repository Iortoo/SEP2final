package Server.Database.Withdraw;

import Server.Database.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;

public class WithdrawDAOImpl implements WithdrawDAO
{
  private static WithdrawDAO instance;

  private WithdrawDAOImpl(){}

  public static WithdrawDAO getInstance()
  {
    if(instance==null) instance = new WithdrawDAOImpl();
    return instance;
  }

  public void withdraw(String accountNo, Double amount,String cardNo,String cvv,String expDate)
  {
    try(Connection connection= DatabaseConnection.getConnection()){
      Class.forName("org.postgresql.Driver");

      String sql = "update account\n"
          + "set balance = balance-?\n"
          + "where accountNo=?";

      PreparedStatement preparedStatement = connection.prepareStatement(sql.toLowerCase(
          Locale.ROOT));

      preparedStatement.setDouble(1, amount);
      preparedStatement.setString(2, accountNo);
      ResultSet resultSet = preparedStatement.executeQuery();
      connection.close();
      resultSet.close();
      preparedStatement.close();
      System.out.println("WITHDRAW DONE");
    }
    catch (SQLException | ClassNotFoundException exception)
    {
      exception.printStackTrace();
      System.out.println("WITHDRAW ERROR");
    }
  }
}
