package Server.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection
{
  private static String url ="jdbc:postgresql://localhost:5432/postgres?currentSchema=\"REALBank\"";
  private static String user = "postgres";
  private static String pw = "postgres";

  public static Connection getConnection() throws SQLException
  {
    return DriverManager.getConnection(url,user,pw);
  }
}
