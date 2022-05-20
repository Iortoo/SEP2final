package Client.View.General.Login;

import Client.Model.General.Login.LoginModel;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class LoginViewModel
{
  private LoginModel model;

  private StringProperty userId;
  private StringProperty password;

  public LoginViewModel(LoginModel model)
  {

    this.model = model;

    this.userId=new SimpleStringProperty();
    this.password=new SimpleStringProperty();
  }

  public void login(String username, String password)
  {
    model.login(username,password);
    System.out.println("VIEW MODEL");
  }

  public LoginModel getModel()
  {
    return model;
  }

  public StringProperty userIdProperty(){
    return userId;
  }

  public StringProperty passwordProperty(){
    return password;
  }

  public void reset()
  {
    userId.set(null);
    password.set(null);
  }
}
