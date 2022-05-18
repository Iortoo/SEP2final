package Client.View.Customer.NewLoan;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import Client.View.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;

import java.io.IOException;

public class NewLoanViewController implements ViewController
{
  private ViewHandler viewHandler;
  private NewLoanViewModel viewModel;
  private String username;
  private String accountNo;
  @FXML TextField amountTextField;
  @FXML TextField interestRateTextField;
  @FXML MenuButton tenureMenuButton;
  @FXML TextField totalPaybackTextField;
  @FXML Button requestButton;
  @FXML Button overviewButton;
  @FXML Button transfersButton;
  @FXML Button profileButton;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory, String username)
  {
    this.viewHandler=viewHandler;
    this.username=username;
    viewModel=viewModelFactory.getNewLoanViewModel();
  }
  public void initPlus(ViewHandler viewHandler,ViewModelFactory viewModelFactory,String username,String accountNo)
  {
    init(viewHandler,viewModelFactory,username);
    this.accountNo=accountNo;
  }

  public void onRequestButton()
  {
    // I DONT UNDERSTAND HOW LOANS WORK
    // SO MAYBE SOMEONE WHO GETS IT WHOULD HANDLE THIS ONE
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
}
