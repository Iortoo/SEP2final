package Server.Database.Transaction;

import Server.Database.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TransactionDAOImpl implements TransactionDAO
{
  private static TransactionDAO instance;

  private TransactionDAOImpl(){}

  public static TransactionDAO getInstance()
  {
    if(instance==null) instance=new TransactionDAOImpl();
    return instance;
  }

  @Override public ArrayList<String> getTransactions(String accountNo)
  {
    try(Connection connection = DatabaseConnection.getConnection())
    {
      Class.forName("org.postgresql.Driver");

      ArrayList<String> transactions = new ArrayList<>();

      String sql = "select * from transaction where senderno = ?";
      PreparedStatement preparedStatement = connection.prepareStatement(sql);

      preparedStatement.setString(1, accountNo);

      ResultSet resultSet = preparedStatement.executeQuery();

      while (resultSet.next())
      {
        String string = resultSet.getString("receiverno");
        string += resultSet.getString("amount");
        string += resultSet.getString("date");
        transactions.add(string);
      }

      connection.close();
      resultSet.close();
      preparedStatement.close();
      System.out.println(transactions+accountNo+"TRANSACTION");
      return transactions;
    }
    catch (SQLException | ClassNotFoundException exception)
    {
      exception.printStackTrace();
      return new ArrayList<>();
    }
  }
}
