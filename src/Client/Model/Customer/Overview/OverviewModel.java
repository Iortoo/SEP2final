package Client.Model.Customer.Overview;

import SharedResources.Subject;

import java.util.ArrayList;

public interface OverviewModel extends Subject
{
  String getBalance(String username);
  ArrayList<String> getTransactions(String accountNo);
}
