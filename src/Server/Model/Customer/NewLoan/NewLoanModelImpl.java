package Server.Model.Customer.NewLoan;

public class NewLoanModelImpl implements NewLoanModel
{
  private static NewLoanModel instance;

  private NewLoanModelImpl()
  {
  }

  public static NewLoanModel getInstance()
  {
    if(instance==null) instance=new NewLoanModelImpl();
    return instance;
  }
}
