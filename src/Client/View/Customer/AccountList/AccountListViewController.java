package Client.View.Customer.AccountList;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import Client.View.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;

public class AccountListViewController implements ViewController
{
  @FXML ListView accountsListView;
  @FXML Button profileButton;
  @FXML Button selectButton;
  @FXML Button newAccountButton;
  private String username;
  private ViewHandler viewHandler;
  private AccountListViewModel viewModel;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory, String username)
  {
    this.username=username;
    this.viewHandler=viewHandler;
    viewModel=viewModelFactory.getAccountListViewModel();
    getAccounts();
  }

  private void getAccounts()
  {
    System.out.println(username);
    ArrayList<String> result = viewModel.getAccounts(username);
    for(int i=0;i< result.size();i++)
    {
      System.out.println(result.get(i));
      accountsListView.getItems().add(result.get(i));
    }
  }
  public void onProfileButton() throws IOException
  {
    viewHandler.openProfileView(username);
  }

  public void onSelectButton() throws IOException
  {
    if(accountsListView.getSelectionModel().isEmpty()) JOptionPane.showMessageDialog(null,"Select an account");
    else{
      String accountNo = (String)accountsListView.getSelectionModel().getSelectedItem();
      viewHandler.openOverviewView(username,accountNo);
    }
  }

  public void onNewAccountButton() throws IOException
  {
    viewHandler.openNewAccountView(username);
  }
}
