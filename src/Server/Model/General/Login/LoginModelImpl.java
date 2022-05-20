package Server.Model.General.Login;

import Server.Database.DatabaseAdapterImpl;
import Server.Database.Login.LoginDAOImpl;

public class LoginModelImpl implements LoginModel
{
  private static LoginModel instance;

  private LoginModelImpl()
  {
  }

  public static LoginModel getInstance()
  {
    if(instance==null) instance = new LoginModelImpl();
    return instance;
  }

  public int getLogin(String username, String password)
  {
    int result = LoginDAOImpl.getInstance().loginQuery(username,password);
    System.out.println(result);
    return result;
  }
}
