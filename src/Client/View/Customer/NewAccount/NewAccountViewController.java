package Client.View.Customer.NewAccount;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import Client.View.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.io.IOException;

public class NewAccountViewController implements ViewController
{
  private String username;
  private ViewHandler viewHandler;
  private NewAccountViewModel viewModel;
  @FXML MenuButton accountType;
  @FXML TextField amount;
  @FXML Button registerButton;
  @FXML Button accountsButton;
  @FXML Button profileButton;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory,
      String username)
  {
    this.username=username;
    this.viewHandler=viewHandler;
    viewModel=viewModelFactory.getNewAccountViewModel();
  }

  public void onRegisterButton() throws IOException
  {
    if(validation())
    {
      String type ="";// accountType. FIGURE THIS OUT
      String deposit = amount.getText();

      viewModel.newAccount(username,type,deposit);
      JOptionPane.showMessageDialog(null,"Request for a new account has been submitted");
      viewHandler.openAccountListView(username);
    }
  }

  public void onAccountsButton() throws IOException
  {
    viewHandler.openAccountListView(username);
  }

  public void onProfileButton() throws IOException
  {
    viewHandler.openProfileView(username);
  }

  private boolean validation()
  {
    if(amount.getText().isEmpty()/*also check for menu button if null*/){
      JOptionPane.showMessageDialog(null,"Fill in all fields");
      return false;
    }
    int p=0;
    for(int i=0;i<amount.getText().length();i++)
    {
      if(amount.getText().charAt(i)=='.')p++;
      if(!"1234567890.".contains(amount.getText().charAt(i)+"")){
        JOptionPane.showMessageDialog(null,"Enter valid amount");
        return false;
      }
    }
    if(p>1){
      JOptionPane.showMessageDialog(null,"Enter valid amount");
      return false;
    }
    return true;
  }
}
