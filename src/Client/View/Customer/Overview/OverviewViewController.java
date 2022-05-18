package Client.View.Customer.Overview;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import Client.View.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.beans.PropertyChangeEvent;
import java.io.IOException;
import java.util.ArrayList;

public class OverviewViewController implements ViewController
{
  private ViewHandler viewHandler;
  private OverviewViewModel viewModel;
  private String username;
  private String accountNo;
  @FXML Button accountsButton;
  @FXML Button loanButton;
  @FXML Button profileButton;
  @FXML Button transfersButton;
  @FXML Button depositButton;
  @FXML Button withdrawButton;
  @FXML TextField balanceTextField;
  @FXML Label accountNoLabel;
  @FXML ListView transactionsListView;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory,String username)
  {
    this.username = username;
    this.viewHandler = viewHandler;
    viewModel = viewModelFactory.getOverviewViewModel();
    viewModel.getModel().addListener("newBalance",this::newBalance);
  }

  public void initPlus(ViewHandler viewHandler,ViewModelFactory viewModelFactory,String username,String accountNo)
  {
    init(viewHandler,viewModelFactory,username);
    this.accountNo=accountNo;
    accountNoLabel.setText(accountNoLabel.getText()+" "+accountNo);
    update();
  }

  public void onAccountsButton() throws IOException
  {
    viewHandler.openAccountListView(username);
  }

  public void onLoanButton() throws IOException
  {
    viewHandler.openLoansView(username,accountNo);
  }

  public void onProfileButton() throws IOException
  {
    viewHandler.openProfileView(username);
  }

  public void onTransfersButton() throws IOException
  {
    viewHandler.openTransfersView(username,accountNo);
  }

  public void onDepositButton() throws IOException
  {
    viewHandler.openDepositView(username,accountNo);
  }

  public void onWithdrawButton() throws IOException
  {
    viewHandler.openWithdrawalView(username,accountNo);
  }

  public void newBalance(PropertyChangeEvent e)
  {
    update();
  }

  private void update()
  {
    balanceTextField.setText(viewModel.getBalance(username)+" DKK");
    ArrayList<String> result = viewModel.getTransactions(accountNo);
    System.out.println(result.size());
    for(int i=0;i<result.size();i++)
    {
      System.out.println("C");
      transactionsListView.getItems().add(result.get(i));
    }
  }
}
