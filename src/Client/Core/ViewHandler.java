package Client.Core;

import Client.View.Customer.AccountList.AccountListViewController;
import Client.View.Customer.Deposit.DepositViewController;
import Client.View.Customer.LoanOverview.LoanOverviewViewController;
import Client.View.Customer.Loans.LoansViewController;
import Client.View.Customer.MakeTransfer.MakeTransferViewController;
import Client.View.Customer.NewAccount.NewAccountViewController;
import Client.View.Customer.NewLoan.NewLoanViewController;
import Client.View.Customer.Overview.OverviewViewController;
import Client.View.Customer.Profile.ProfileViewController;
import Client.View.Customer.ProfileInfo.ProfileInfoViewController;
import Client.View.Customer.Transfers.TransfersViewController;
import Client.View.Customer.Withdrawal.WithdrawalViewController;
import Client.View.Employee.EmployeeOverview.EmployeeOverviewViewController;
import Client.View.Employee.Request.RequestViewController;
import Client.View.General.Login.LoginViewController;
import Client.View.General.Register.RegisterViewController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewHandler
{

  private Stage stage;
  private ViewModelFactory viewModelFactory;

  public ViewHandler(Stage stage, ViewModelFactory viewModelFactory)
  {
    this.stage=stage;
    this.viewModelFactory=viewModelFactory;
  }

  public void openLoginView() throws IOException
  {
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;

    loader.setLocation(getClass().getResource("../View/General/Login/LoginView.fxml"));
    root = loader.load();
    LoginViewController controller = loader.getController();
    controller.init(this,viewModelFactory,"");
    scene = new Scene(root);
    stage.setTitle("Log In");
    stage.setScene(scene);
    stage.show();
  }

  public void openOverviewView(String username,String accountNo) throws IOException
  {
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;

    loader.setLocation(getClass().getResource("../View/Customer/Overview/OverviewView.fxml"));
    root = loader.load();
    OverviewViewController controller = loader.getController();
    controller.initPlus(this,viewModelFactory,username,accountNo);
    scene = new Scene(root);
    stage.setTitle("Overview");
    stage.setScene(scene);
    stage.show();
  }

  public void openDepositView(String username,String accountNo) throws IOException
  {
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;

    loader.setLocation(getClass().getResource("../View/Customer/Deposit/DepositView.fxml"));
    root = loader.load();
    DepositViewController controller = loader.getController();
    controller.initPlus(this,viewModelFactory,username,accountNo);
    scene = new Scene(root);
    stage.setTitle("Deposit");
    stage.setScene(scene);
    stage.show();
  }

  public void openWithdrawalView(String username,String accountNo) throws IOException
  {
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;

    loader.setLocation(getClass().getResource("../View/Customer/Withdrawal/WithdrawalView.fxml"));
    root = loader.load();
    WithdrawalViewController controller = loader.getController();
    controller.initPlus(this,viewModelFactory,username,accountNo);
    scene = new Scene(root);
    stage.setTitle("Withdrawal");
    stage.setScene(scene);
    stage.show();
  }

  public void openProfileView(String username)// throws IOException
  {
    try
    {
      Scene scene = null;
      FXMLLoader loader = new FXMLLoader();
      Parent root = null;

      loader.setLocation(getClass().getResource("../View/Customer/Profile/ProfileView.fxml"));
      root = loader.load();
      ProfileViewController controller = loader.getController();
      controller.init(this,viewModelFactory,username);
      scene = new Scene(root);
      stage.setTitle("Profile");
      stage.setScene(scene);
      System.out.println("HANDLER");
      stage.show();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }

  public void openAccountListView(String username) throws IOException
  {
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;

    loader.setLocation(getClass().getResource("../View/Customer/AccountList/AccountListView.fxml"));
    root = loader.load();
    AccountListViewController controller = loader.getController();
    controller.init(this,viewModelFactory,username);
    scene = new Scene(root);
    stage.setTitle("Account list");
    stage.setScene(scene);
    stage.show();
  }

  public void openProfileInfoView(String username) throws IOException
  {
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;

    loader.setLocation(getClass().getResource("../View/Customer/ProfileInfo/ProfileInfoView.fxml"));
    root = loader.load();
    ProfileInfoViewController controller = loader.getController();
    controller.init(this,viewModelFactory,username);
    scene = new Scene(root);
    stage.setTitle("Profile info");
    stage.setScene(scene);
    stage.show();
  }

  public void openNewAccountView(String username) throws IOException
  {
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;

    loader.setLocation(getClass().getResource("../View/Customer/NewAccount/NewAccountView.fxml"));
    root = loader.load();
    NewAccountViewController controller = loader.getController();
    controller.init(this,viewModelFactory,username);
    scene = new Scene(root);
    stage.setTitle("Open new account");
    stage.setScene(scene);
    stage.show();
  }

  public void openRegisterView() throws IOException
  {
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;

    loader.setLocation(getClass().getResource("../View/General/Register/RegisterView.fxml"));
    root = loader.load();
    RegisterViewController controller = loader.getController();
    controller.init(this,viewModelFactory,"");
    scene = new Scene(root);
    stage.setTitle("Sign up");
    stage.setScene(scene);
    stage.show();
  }

  public void openLoansView(String username,String accountNo) throws IOException
  {
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;

    loader.setLocation(getClass().getResource("../View/Customer/Loans/LoansView.fxml"));
    root = loader.load();
    LoansViewController controller = loader.getController();
    controller.initPlus(this,viewModelFactory,username,accountNo);
    scene = new Scene(root);
    stage.setTitle("Loans");
    stage.setScene(scene);
    stage.show();
  }

  public void openLoanOverviewView(String username,String accountNo,String loan) throws IOException
  {
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;

    loader.setLocation(getClass().getResource("../View/Customer/LoanOverview/LoanOverviewView.fxml"));
    root = loader.load();
    LoanOverviewViewController controller = loader.getController();
    controller.initPlus(this,viewModelFactory,username,accountNo,loan);
    scene = new Scene(root);
    stage.setTitle("Loan Overview");
    stage.setScene(scene);
    stage.show();
  }

  public void openTransfersView(String username,String accountNo) throws IOException
  {
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;

    loader.setLocation(getClass().getResource("../View/Customer/Transfers/TransfersView.fxml"));
    root = loader.load();
    TransfersViewController controller = loader.getController();
    controller.initPlus(this,viewModelFactory,username,accountNo);
    scene = new Scene(root);
    stage.setTitle("Transfers");
    stage.setScene(scene);
    stage.show();
  }

  public void openMakeTransferView(String username,String accountNo) throws IOException
  {
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;

    loader.setLocation(getClass().getResource("../View/Customer/MakeTransfer/MakeTransferView.fxml"));
    root = loader.load();
    MakeTransferViewController controller = loader.getController();
    controller.initPlus(this,viewModelFactory,username,accountNo);
    scene = new Scene(root);
    stage.setTitle("Transfer funds");
    stage.setScene(scene);
    stage.show();
  }

  public void openNewLoanView(String username,String accountNo) throws IOException
  {
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;

    loader.setLocation(getClass().getResource("../View/Customer/NewLoan/NewLoanView.fxml"));
    root = loader.load();
    NewLoanViewController controller = loader.getController();
    controller.initPlus(this,viewModelFactory,username,accountNo);
    scene = new Scene(root);
    stage.setTitle("Take a loan");
    stage.setScene(scene);
    stage.show();
  }

  public void openEmployeeOverviewView(String username) throws IOException
  {
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;

    loader.setLocation(getClass().getResource("../View/Employee/EmployeeOverview/EmployeeOverviewView.fxml"));
    root = loader.load();
    EmployeeOverviewViewController controller = loader.getController();
    controller.init(this,viewModelFactory,username);
    scene = new Scene(root);
    stage.setTitle("R.E.A.L Bank");
    stage.setScene(scene);
    stage.show();
  }

  public void openRequestView(String username,String requestId) throws IOException
  {
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;

    loader.setLocation(getClass().getResource("../View/Employee/Request/RequestView.fxml"));
    root = loader.load();
    RequestViewController controller = loader.getController();
    controller.initPlus(this,viewModelFactory,username,requestId);
    scene = new Scene(root);
    stage.setTitle("Request");
    stage.setScene(scene);
    stage.show();
  }
}
