package Client.View.Customer.MakeTransfer;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import Client.View.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.io.IOException;

public class MakeTransferViewController implements ViewController
{
  private ViewHandler viewHandler;
  private MakeTransferViewModel viewModel;
  private String username;
  private String accountNo;
  @FXML TextField amountTextField;
  @FXML TextField accountNoTextField;
  @FXML TextField swiftTextField;
  @FXML Button sendButton;
  @FXML Button overviewButton;
  @FXML Button profileButton;
  @FXML Button transfersButton;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory, String username)
  {
    this.username=username;
    this.viewHandler=viewHandler;
    viewModel=viewModelFactory.getMakeTransferViewModel();
  }

  public void initPlus(ViewHandler viewHandler, ViewModelFactory viewModelFactory, String username,String accountNo)
  {
    init(viewHandler,viewModelFactory,username);
    this.accountNo=accountNo;
  }

  public void onSendButton() throws IOException
  {
    String recAccountNo = accountNoTextField.getText();
    String recSwift = swiftTextField.getText();
    String amount = amountTextField.getText();

    if(!accountNo.equals("") && !recSwift.equals("") && !amount.equals(""))
    {
      int result = viewModel.transfer(username,accountNo,recAccountNo,recSwift,amount);
      if(result==1)
      {
        JOptionPane.showMessageDialog(null,"Funds transferred");
      }
      else
      {
        JOptionPane.showMessageDialog(null,"International/Outstanding Transfer awaiting approval, est. 24hr");
      }
      System.out.println(recAccountNo+" "+recSwift+" "+amount+"AAAA");
      viewHandler.openOverviewView(username,accountNo);
    }
    else JOptionPane.showMessageDialog(null,"Please fill in all fields");
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
    // delete this comment
  }
}
