package Client.Core;

import Client.Model.Customer.AccountList.AccountListModel;
import Client.Model.Customer.AccountList.AccountListModelImpl;
import Client.Model.Customer.Deposit.DepositModel;
import Client.Model.Customer.Deposit.DepositModelImpl;
import Client.Model.Customer.LoanOverview.LoanOverviewModel;
import Client.Model.Customer.LoanOverview.LoanOverviewModelImpl;
import Client.Model.Customer.Loans.LoansModel;
import Client.Model.Customer.Loans.LoansModelImpl;
import Client.Model.Customer.MakeTransfer.MakeTransferModel;
import Client.Model.Customer.MakeTransfer.MakeTransferModelImpl;
import Client.Model.Customer.NewAccount.NewAccountModel;
import Client.Model.Customer.NewAccount.NewAccountModelImpl;
import Client.Model.Customer.NewLoan.NewLoanModel;
import Client.Model.Customer.NewLoan.NewLoanModelImpl;
import Client.Model.Customer.Overview.OverviewModel;
import Client.Model.Customer.Overview.OverviewModelImpl;
import Client.Model.Customer.Profile.ProfileModel;
import Client.Model.Customer.Profile.ProfileModelImpl;
import Client.Model.Customer.ProfileInfo.ProfileInfoModel;
import Client.Model.Customer.ProfileInfo.ProfileInfoModelImpl;
import Client.Model.Customer.Transfers.TransfersModel;
import Client.Model.Customer.Transfers.TransfersModelImpl;
import Client.Model.Customer.Withdrawal.WithdrawalModel;
import Client.Model.Customer.Withdrawal.WithdrawalModelImpl;
import Client.Model.Employee.EmployeeOverview.EmployeeOverviewModel;
import Client.Model.Employee.EmployeeOverview.EmployeeOverviewModelImpl;
import Client.Model.Employee.Request.RequestModel;
import Client.Model.Employee.Request.RequestModelImpl;
import Client.Model.General.Login.LoginModel;
import Client.Model.General.Login.LoginModelImpl;
import Client.Model.General.Register.RegisterModel;
import Client.Model.General.Register.RegisterModelImpl;

public class ModelFactory
{
  private ClientFactory clientFactory;
  private AccountListModel accountListModel;
  private DepositModel depositModel;
  private LoanOverviewModel loanOverviewModel;
  private LoansModel loansModel;
  private MakeTransferModel makeTransferModel;
  private NewAccountModel newAccountModel;
  private NewLoanModel newLoanModel;
  private OverviewModel overviewModel;
  private ProfileModel profileModel;
  private ProfileInfoModel profileInfoModel;
  private TransfersModel transfersModel;
  private WithdrawalModel withdrawalModel;
  private EmployeeOverviewModel employeeOverviewModel;
  private RequestModel requestModel;
  private LoginModel loginModel;
  private RegisterModel registerModel;

  public ModelFactory(ClientFactory clientFactory)
  {
    this.clientFactory=clientFactory;
  }

  /*public Model getModel()
  {
    if(model==null)model=new ModelImpl(clientFactory.getClient());
    return model;
  }*/

  public AccountListModel getAccountListModel()
  {
    if(accountListModel==null) accountListModel = AccountListModelImpl.getInstance(clientFactory.getClient());
    return accountListModel;
  }

  public DepositModel getDepositModel()
  {
    if(depositModel==null) depositModel = DepositModelImpl.getInstance(clientFactory.getClient());
    return depositModel;
  }

  public LoanOverviewModel getLoanOverviewModel()
  {
    if(loanOverviewModel==null) loanOverviewModel = LoanOverviewModelImpl.getInstance(clientFactory.getClient());
    return loanOverviewModel;
  }

  public LoansModel getLoansModel()
  {
    if(loansModel==null) loansModel = LoansModelImpl.getInstance(clientFactory.getClient());
    return loansModel;
  }

  public MakeTransferModel getMakeTransferModel()
  {
    if(makeTransferModel==null) makeTransferModel = MakeTransferModelImpl.getInstance(clientFactory.getClient());
    return makeTransferModel;
  }

  public NewAccountModel getNewAccountModel()
  {
    if(newAccountModel==null) newAccountModel= NewAccountModelImpl.getInstance(clientFactory.getClient());
    return newAccountModel;
  }

  public NewLoanModel getNewLoanModel()
  {
    if(newLoanModel==null)  newLoanModel = NewLoanModelImpl.getInstance(clientFactory.getClient());
    return newLoanModel;
  }

  public OverviewModel getOverviewModel()
  {
    if(overviewModel==null) overviewModel = OverviewModelImpl.getInstance(clientFactory.getClient());
    return overviewModel;
  }

  public ProfileModel getProfileModel()
  {
    if(profileModel==null) profileModel = ProfileModelImpl.getInstance(clientFactory.getClient());
    return profileModel;
  }

  public ProfileInfoModel getProfileInfoModel()
  {
    if(profileInfoModel==null) profileInfoModel = ProfileInfoModelImpl.getInstance(clientFactory.getClient());
    return profileInfoModel;
  }

  public TransfersModel getTransfersModel()
  {
    if(transfersModel==null) transfersModel = TransfersModelImpl.getInstance(clientFactory.getClient());
    return transfersModel;
  }

  public WithdrawalModel getWithdrawalModel()
  {
    if(withdrawalModel==null) withdrawalModel = WithdrawalModelImpl.getInstance(clientFactory.getClient());
    return withdrawalModel;
  }

  public EmployeeOverviewModel getEmployeeOverviewModel()
  {
    if(employeeOverviewModel==null) employeeOverviewModel = EmployeeOverviewModelImpl.getInstance(clientFactory.getClient());
    return employeeOverviewModel;
  }

  public RequestModel getRequestModel()
  {
    if(registerModel==null) requestModel = RequestModelImpl.getInstance(clientFactory.getClient());
    return requestModel;
  }

  public LoginModel getLoginModel()
  {
    if(loginModel==null) loginModel = LoginModelImpl.getInstance(clientFactory.getClient());
    return loginModel;
  }

  public RegisterModel getRegisterModel()
  {
    if(registerModel==null) registerModel= RegisterModelImpl.getInstance(clientFactory.getClient());
    return registerModel;
  }
}
