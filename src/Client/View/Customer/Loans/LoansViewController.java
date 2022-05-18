package Client.View.Customer.Loans;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import Client.View.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;

public class LoansViewController implements ViewController
{
  private ViewHandler viewHandler;
  private LoansViewModel viewModel;
  private String username;
  private String accountNo;
  @FXML ListView activeLoansListView;
  @FXML Button selectButton;
  @FXML Button newLoanButton;
  @FXML Button overviewButton;
  @FXML Button transfersButton;
  @FXML Button profileButton;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory, String username)
  {
    this.viewHandler=viewHandler;
    viewModel = viewModelFactory.getLoansViewModel();
    this.username=username;
    getLoans();
  }

  public void initPlus(ViewHandler viewHandler,ViewModelFactory viewModelFactory,String username,String accountNo)
  {
    init(viewHandler,viewModelFactory,username);
    this.accountNo=accountNo;
  }

  public void onSelectButton() throws IOException
  {
    if(activeLoansListView.getSelectionModel().isEmpty()) JOptionPane.showMessageDialog(null,"Select a loan");
    else
    {
      String loan =(String) activeLoansListView.getSelectionModel().getSelectedItem();
      viewHandler.openLoanOverviewView(username,accountNo,loan);
    }
  }

  public void onNewLoanButton() throws IOException
  {
    viewHandler.openNewLoanView(username,accountNo);
  }

  public void onOverviewButton() throws IOException
  {
    viewHandler.openOverviewView(username,accountNo);
  }

  public void onTransfersButton() throws IOException
  {
    viewHandler.openTransfersView(username,accountNo);
  }

  public void onProfileButton() throws IOException
  {
    viewHandler.openProfileView(username);
  }

  private void getLoans()
  {
    //will update the list with the loans from the database
    // to be added
    ArrayList<String> result = viewModel.getLoans(username);
    for(int i=0;i< result.size();i++)
    {
      activeLoansListView.getItems().add(result.get(i));
    }
  }
}
