package Client.View.Customer.Overview;

import Client.Model.Customer.Overview.OverviewModel;

import java.util.ArrayList;

public class OverviewViewModel
{
  private OverviewModel model;

  public OverviewViewModel(OverviewModel model)
 {
   this.model=model;
 }

  public OverviewModel getModel()
  {
     return model;
  }

  public String getBalance(String username)
 {
   return model.getBalance(username);
 }

  public ArrayList<String> getTransactions(String accountNo)
  {
    return model.getTransactions(accountNo);
  }
}
