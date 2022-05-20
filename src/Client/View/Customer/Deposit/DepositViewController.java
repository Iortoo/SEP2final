package Client.View.Customer.Deposit;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import Client.View.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.io.IOException;

public class DepositViewController implements ViewController
{
  @FXML TextField amountTextField;
  @FXML TextField cardNoTextField;
  @FXML TextField cvvTextField;
  @FXML TextField expMonthTextField;
  @FXML TextField expYearTextField;
  @FXML Button depositButton;
  @FXML Button overviewButton;
  @FXML Button transfersButton;
  @FXML Button profileButton;
  private ViewHandler viewHandler;
  private DepositViewModel viewModel;
  private String username;
  private String accountNo;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory,String username)
  {
    this.username=username;
    this.viewHandler = viewHandler;
    viewModel = viewModelFactory.getDepositViewModel();
  }

  public void initPlus(ViewHandler viewHandler, ViewModelFactory viewModelFactory,String username,String accountNo)
  {
    init(viewHandler,viewModelFactory,username);
    this.accountNo=accountNo;
  }

  public void onProfileButton() throws IOException
  {
    viewHandler.openProfileView(username);
  }

  public void onTransfersButton() throws IOException
  {
    viewHandler.openTransfersView(username,accountNo);
  }

  public void onOverviewButton() throws IOException
  {
    viewHandler.openOverviewView(username,accountNo);
  }

  public void onDepositButton() throws IOException
  {
    String amount = amountTextField.getText();
    String cardNo = cardNoTextField.getText();
    String cvv = cvvTextField.getText();
    String expDate = expMonthTextField.getText() + "/" + expYearTextField.getText();

    if(amount!=null && cardNo!=null && cvv!=null && !expDate.equals("/"))
    {
      viewModel.deposit(accountNo,amount,cardNo,cvv,expDate);
      viewHandler.openOverviewView(username,accountNo);
    }
    else JOptionPane.showMessageDialog(null,"Please fill in all fields");
  }
}
