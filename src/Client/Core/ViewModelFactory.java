package Client.Core;

import Client.View.Customer.AccountList.AccountListViewModel;
import Client.View.Customer.Deposit.DepositViewModel;
import Client.View.Customer.LoanOverview.LoanOverviewViewModel;
import Client.View.Customer.Loans.LoansViewModel;
import Client.View.Customer.MakeTransfer.MakeTransferViewModel;
import Client.View.Customer.NewAccount.NewAccountViewModel;
import Client.View.Customer.NewLoan.NewLoanViewModel;
import Client.View.Customer.Overview.OverviewViewModel;
import Client.View.Customer.Profile.ProfileViewModel;
import Client.View.Customer.ProfileInfo.ProfileInfoViewModel;
import Client.View.Customer.Transfers.TransfersViewModel;
import Client.View.Customer.Withdrawal.WithdrawalViewModel;
import Client.View.Employee.EmployeeOverview.EmployeeOverviewViewModel;
import Client.View.Employee.Request.RequestViewModel;
import Client.View.General.Login.LoginViewModel;
import Client.View.General.Register.RegisterViewModel;

public class ViewModelFactory
{
  private ModelFactory modelFactory;
  private LoginViewModel loginViewModel;
  private OverviewViewModel overviewViewModel;
  private DepositViewModel depositViewModel;
  private WithdrawalViewModel withdrawalViewModel;
  private ProfileViewModel profileViewModel;
  private ProfileInfoViewModel profileInfoViewModel;
  private AccountListViewModel accountListViewModel;
  private NewAccountViewModel newAccountViewModel;
  private RegisterViewModel registerViewModel;
  private LoansViewModel loansViewModel;
  private LoanOverviewViewModel loanOverviewViewModel;
  private MakeTransferViewModel makeTransferViewModel;
  private NewLoanViewModel newLoanViewModel;
  private TransfersViewModel transfersViewModel;
  private EmployeeOverviewViewModel employeeOverviewViewModel;
  private RequestViewModel requestViewModel;

  public ViewModelFactory(ModelFactory modelFactory)
  {
    this.modelFactory=modelFactory;
  }

  public LoginViewModel getLoginViewModel()
  {
    if(loginViewModel==null) loginViewModel=new LoginViewModel(modelFactory.getLoginModel());
    return loginViewModel;
  }

  public OverviewViewModel getOverviewViewModel()
  {
    if(overviewViewModel==null) overviewViewModel = new OverviewViewModel(modelFactory.getOverviewModel());
    return overviewViewModel;
  }

  public DepositViewModel getDepositViewModel()
  {
    if(depositViewModel==null) depositViewModel = new DepositViewModel(modelFactory.getDepositModel());
    return depositViewModel;
  }

  public WithdrawalViewModel getWithdrawalViewModel()
  {
    if(withdrawalViewModel==null) withdrawalViewModel = new WithdrawalViewModel(modelFactory.getWithdrawalModel());
    return withdrawalViewModel;
  }

  public ProfileViewModel getProfileViewModel()
  {
    if(profileViewModel==null) profileViewModel = new ProfileViewModel(modelFactory.getProfileModel());
    return profileViewModel;
  }

  public ProfileInfoViewModel getProfileInfoViewModel()
  {
    if(profileInfoViewModel==null)profileInfoViewModel=new ProfileInfoViewModel(modelFactory.getProfileInfoModel());
    return profileInfoViewModel;
  }

  public AccountListViewModel getAccountListViewModel()
  {
    if(accountListViewModel==null)accountListViewModel = new AccountListViewModel(modelFactory.getAccountListModel());
    return accountListViewModel;
  }

  public NewAccountViewModel getNewAccountViewModel()
  {
    if(newAccountViewModel==null)newAccountViewModel = new NewAccountViewModel(modelFactory.getNewAccountModel());
    return newAccountViewModel;
  }

  public RegisterViewModel getRegisterViewModel()
  {
    if(registerViewModel==null)registerViewModel = new RegisterViewModel(modelFactory.getRegisterModel());
    return registerViewModel;
  }

  public LoanOverviewViewModel getLoanOverviewViewModel()
  {
    if(loanOverviewViewModel==null) loanOverviewViewModel = new LoanOverviewViewModel(modelFactory.getLoanOverviewModel());
    return loanOverviewViewModel;
  }

  public LoansViewModel getLoansViewModel()
  {
    if(loansViewModel==null) loansViewModel = new LoansViewModel(modelFactory.getLoansModel());
    return loansViewModel;
  }

  public MakeTransferViewModel getMakeTransferViewModel()
  {
    if(makeTransferViewModel==null) makeTransferViewModel = new MakeTransferViewModel(modelFactory.getMakeTransferModel());
    return makeTransferViewModel;
  }

  public NewLoanViewModel getNewLoanViewModel()
  {
    if(newLoanViewModel==null)newLoanViewModel = new NewLoanViewModel(modelFactory.getNewLoanModel());
    return newLoanViewModel;
  }

  public TransfersViewModel getTransfersViewModel()
  {
    if(transfersViewModel==null)transfersViewModel = new TransfersViewModel(modelFactory.getTransfersModel());
    return transfersViewModel;
  }

  public EmployeeOverviewViewModel getEmployeeOverviewViewModel()
  {
    if(employeeOverviewViewModel==null)employeeOverviewViewModel = new EmployeeOverviewViewModel(modelFactory.getEmployeeOverviewModel());
    return employeeOverviewViewModel;
  }

  public RequestViewModel getRequestViewModel()
  {
    if(requestViewModel==null)requestViewModel = new RequestViewModel(modelFactory.getRequestModel());
    return requestViewModel;
  }
}
