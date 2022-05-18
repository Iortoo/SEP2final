package Client.View.Customer.Profile;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import Client.View.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class ProfileViewController implements ViewController
{
  private  ViewHandler viewHandler;
  private ProfileViewModel viewModel;
  private String username;
  @FXML Label fullNameLabel;
  @FXML Label usernameLabel;
  @FXML Button accountsButton;
  @FXML Button profileInfoButton;
  @FXML Button logoutButton;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory,String username)
  {
    this.username=username;
    this.viewHandler=viewHandler;
    viewModel = viewModelFactory.getProfileViewModel();
    usernameLabel.setText(username);
    fullNameLabel.setText(viewModel.getFullName(username));
  }

  public void onAccountsButton() throws IOException
  {
    viewHandler.openAccountListView(username);
  }

  public void onProfileInfoButton()throws IOException
  {
    viewHandler.openProfileInfoView(username);
  }

  public void onLogoutButton() throws IOException
  {
    viewModel.logOut();
    viewHandler.openLoginView();
  }
}
