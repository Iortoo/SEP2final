package Client.View.Employee.EmployeeOverview;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import Client.View.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;

public class EmployeeOverviewViewController implements ViewController
{
  private ViewHandler viewHandler;
  private EmployeeOverviewViewModel viewModel;
  private String username;
  @FXML ListView requestsListView;
  @FXML Button requestButton;
  @FXML Button logOutButton;
  @FXML Label usernameLabel;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory, String username)
  {
    this.viewHandler=viewHandler;
    this.username=username;
    viewModel=viewModelFactory.getEmployeeOverviewViewModel();
    getRequests();
    usernameLabel.setText(username);
  }

  public void onRequestButton() throws IOException
  {
    if(requestsListView.getSelectionModel().isEmpty()) JOptionPane.showMessageDialog(null,"Select request");
    else{
      String requestId = (String)requestsListView.getSelectionModel().getSelectedItem();
      viewHandler.openRequestView(username,requestId);
    }
  }

  public void onLogOutButton() throws IOException
  {
    viewModel.logOut();
    viewHandler.openLoginView();
  }

  private void getRequests()
  {
    ArrayList<String> requests = viewModel.getRequests();
    for(int i=0;i<requests.size();i++)
    {
      requestsListView.getItems().add(requests.get(i));
    }
  }
}
