package Client.View.Customer.LoanOverview;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import Client.View.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class LoanOverviewViewController implements ViewController
{
  private ViewHandler viewHandler;
  private LoanOverviewViewModel viewModel;
  private String username;
  private String accountNo;
  private String loan;
  @FXML Button transfersButton;
  @FXML Button overviewButton;
  @FXML Button profileButton;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory, String username)
  {
    this.viewHandler=viewHandler;
    viewModel=viewModelFactory.getLoanOverviewViewModel();
    this.username=username;
  }
  public void initPlus(ViewHandler viewHandler, ViewModelFactory viewModelFactory, String username,String accountNo,String loan)
  {
    init(viewHandler,viewModelFactory,username);
    this.accountNo=accountNo;
    this.loan=loan;
  }

  public void onTransfersButton() throws IOException
  {
    viewHandler.openTransfersView(username,accountNo);
  }

  public void onOverviewButton() throws IOException
  {
    viewHandler.openOverviewView(username,accountNo);
  }

  public void onProfileButton() throws IOException
  {
    viewHandler.openProfileView(username);
  }
}
