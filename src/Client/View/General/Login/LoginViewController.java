package Client.View.General.Login;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import Client.View.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.beans.PropertyChangeEvent;
import java.io.IOException;

public class LoginViewController implements ViewController
{
  private ViewHandler viewHandler;
  private LoginViewModel viewModel;
  @FXML TextField idTextField;
  @FXML PasswordField passwordField;
  @FXML Button loginButton;
  @FXML Button signupButton;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory,String username)
  {
    this.viewHandler = viewHandler;
    viewModel = viewModelFactory.getLoginViewModel();
    viewModel.getModel().addListener("validation",this::validation);


    idTextField.textProperty().bindBidirectional(this.viewModel.userIdProperty());
    passwordField.textProperty().bindBidirectional(this.viewModel.passwordProperty());
  }

  public void onLoginButton()
  {
    String username = idTextField.getText();
    String password = passwordField.getText();
    viewModel.login(username,password);
  }

  public void onSignupButton() throws IOException
  {
    reset();
    viewHandler.openRegisterView();
  }

  private void loginAccepted() throws IOException
  {
    reset();
    JOptionPane.showMessageDialog(null,"Successfully logged in as customer");
    viewHandler.openProfileView(idTextField.getText());
  }

  private void passwordError() throws IOException
  {
    JOptionPane.showMessageDialog(null,"Invalid password.");
    reset();
  }

  private void notExistInDatabaseError() throws IOException
  {
    JOptionPane.showMessageDialog(null,"Username and password does not exist in the database.");
    reset();
  }
  private void isNullError() throws IOException
  {
    JOptionPane.showMessageDialog(null,"You must enter username and password.");
    reset();
  }

  private void employeeLogin() throws IOException
  {
    reset();
    JOptionPane.showMessageDialog(null,"Successfully logged in as employee");
    viewHandler.openEmployeeOverviewView(idTextField.getText());
  }


  public void validation(PropertyChangeEvent event)
  {
    switch((int)event.getNewValue())
    {
      case 1:
      {
        try{loginAccepted();}
        catch(IOException e){}
      }break;
      case 0:
      {
        try{passwordError();}
        catch(IOException e){};
      }
      break;
      case 2:
      {
        try{notExistInDatabaseError();}
        catch(IOException e){};
      }
      break;
      case 3:
      {
        try{isNullError();}
        catch(IOException e){};
      }break;
      case 4:
      {
        try{employeeLogin();}
        catch(IOException e){}
      }
    }
  }



  public void reset(){
    viewModel.reset();
  }

}
