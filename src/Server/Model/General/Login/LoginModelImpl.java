package Server.Model.General.Login;

import Server.Database.DatabaseAdapterImpl;

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
    int result = DatabaseAdapterImpl.getInstance().loginQuery(username,password);
    System.out.println(result);
    return result;
  }
}
