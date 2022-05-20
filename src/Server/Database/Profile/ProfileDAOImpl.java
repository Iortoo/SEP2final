package Server.Database.Profile;

import Server.Database.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;

public class ProfileDAOImpl implements ProfileDAO
{
  private static ProfileDAO instance;

  private ProfileDAOImpl(){}

  public static ProfileDAO getInstance()
  {
    if(instance==null) instance=new ProfileDAOImpl();
    return instance;
  }

  public String getFullName(String username)
  {
    String rtrn="";
    try(Connection connection= DatabaseConnection.getConnection()){
      Class.forName("org.postgresql.Driver");

      String sql = "select * from customer where  id = ?";

      PreparedStatement preparedStatement = connection.prepareStatement(sql.toLowerCase(
          Locale.ROOT));
      preparedStatement.setString(1, username);
      ResultSet resultSet = preparedStatement.executeQuery();

      if(resultSet.next())
      {
        rtrn= resultSet.getString("fName")+" ";
        rtrn+= resultSet.getString("lName");
      }
    }
    catch (SQLException | ClassNotFoundException exception)
    {
      exception.printStackTrace();
    }
    return rtrn;
  }
}
