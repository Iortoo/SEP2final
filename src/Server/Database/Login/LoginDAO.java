package Server.Database.Login;

public interface LoginDAO
{
  int loginQuery(String username, String password);
}
