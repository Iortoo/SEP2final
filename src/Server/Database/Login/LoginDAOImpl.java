package Server.Database.Login;

import Server.Database.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;

public class LoginDAOImpl implements LoginDAO
{
  private static LoginDAO instance;

  private LoginDAOImpl()
  {
  }

  public static LoginDAO getInstance()
  {
    if(instance==null) instance= new LoginDAOImpl();
    return instance;
  }

  public int loginQuery(String username, String password)
  {
    if(username==null || password==null) return 3;
    boolean customer=false, employee =false;
    System.out.println("AAAAAAA");
    try(Connection connection = DatabaseConnection.getConnection()){
      Class.forName("org.postgresql.Driver");
      String sql = "SELECT id, password FROM customer where id = ? and password = ?";

      PreparedStatement statement = connection.prepareStatement(sql);
      statement.setString(1,username);
      statement.setString(2,password);
      ResultSet resultSet = statement.executeQuery();
      String userId="", userPw="";
      if(resultSet.next())
      {
        userId = resultSet.getString("id");
        userPw = resultSet.getString("password");
        System.out.println(userId+" "+userPw+"AICI");
      }
      connection.close();
      resultSet.close();
      statement.close();
      
      if(userId.equals(username))
      {
        customer = true;
        if(userPw.equals(password)) return 1;
        return 0;
      }
    }
    catch (SQLException | ClassNotFoundException e){
      System.out.println(e.getMessage());
    }

    try(Connection connection = DatabaseConnection.getConnection()){
      Class.forName("org.postgresql.Driver");

      String sql = "SELECT id, password FROM bankemployee where id = ? and password = ?";

      PreparedStatement statement = connection.prepareStatement(sql);
      statement.setString(1,username);
      statement.setString(2,password);
      ResultSet resultSet = statement.executeQuery();
      String userId="", userPw="";
      if(resultSet.next())
      {
        userId = resultSet.getString("id");
        userPw = resultSet.getString("password");
      }
      connection.close();
      resultSet.close();
      statement.close();

      if(userId.equals(username))
      {
        employee = true;
        if(userPw.equals(password)) return 4;
        return 0;
      }
    }
    catch (SQLException | ClassNotFoundException e){
      System.out.println(e.getMessage());
    }
    return 2;
  }
}
