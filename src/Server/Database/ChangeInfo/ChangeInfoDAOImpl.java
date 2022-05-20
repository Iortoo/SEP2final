package Server.Database.ChangeInfo;

import Server.Database.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Locale;

public class ChangeInfoDAOImpl implements ChangeInfoDAO
{
  private static ChangeInfoDAO instance;

  private ChangeInfoDAOImpl(){}

  public static ChangeInfoDAO getInstance()
  {
    if(instance==null) instance=new ChangeInfoDAOImpl();
    return instance;
  }

  public void requestInfoChange(String fmName,String lName,String username,String adress,String dob,String phone)
  {
    try(Connection connection = DatabaseConnection.getConnection())
    {
      Class.forName("org.postgresql.Driver");

      String sql = "";

      PreparedStatement preparedStatement = connection.prepareStatement(sql.toLowerCase(
          Locale.ROOT));
    }
    catch (SQLException | ClassNotFoundException exception)
    {
      exception.printStackTrace();
    }
  }

}
