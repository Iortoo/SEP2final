package Client.View.Customer.Loans;

import Client.Model.Customer.Loans.LoansModel;

import java.util.ArrayList;

public class LoansViewModel
{
  private LoansModel model;

  public LoansViewModel(LoansModel model)
  {
    this.model=model;
  }

  public ArrayList<String> getLoans(String username)
  {
    return model.getLoans(username);
  }
}
