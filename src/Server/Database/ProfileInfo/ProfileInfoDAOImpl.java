package Server.Database.ProfileInfo;

import Server.Database.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;

public class ProfileInfoDAOImpl implements ProfileInfoDAO
{
  private static ProfileInfoDAO instance;

  private ProfileInfoDAOImpl(){}

  public static ProfileInfoDAO getInstance()
  {
    if(instance==null) instance = new ProfileInfoDAOImpl();
    return instance;
  }

  public String[] getInfo(String username)
  {
    String[] rtrn = new String[6];
    try(Connection connection = DatabaseConnection.getConnection())
    {
      Class.forName("org.postgresql.Driver");

      String sql = "select * from customer where id = ?";

      PreparedStatement preparedStatement = connection.prepareStatement(sql.toLowerCase(
          Locale.ROOT));
      preparedStatement.setString(1, username);
      ResultSet resultSet = preparedStatement.executeQuery();
      if(resultSet.next())
      {
        rtrn[0]=resultSet.getString("fName");
        rtrn[1]=resultSet.getString("lName");
        rtrn[2]=resultSet.getString("id");
        rtrn[3]=resultSet.getString("address");
        rtrn[4]=resultSet.getString("dob");
        rtrn[5]= resultSet.getString("phone");
      }
      connection.close();
      resultSet.close();
      preparedStatement.close();
    }
    catch (SQLException | ClassNotFoundException exception)
    {
      exception.printStackTrace();
    }
    return rtrn;
  }
}
