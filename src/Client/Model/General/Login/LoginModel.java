package Client.Model.General.Login;

import SharedResources.Subject;

public interface LoginModel extends Subject
{
  void login(String username, String password);
}
