package Server.Model.Customer.Overview;

import java.util.ArrayList;

public interface OverviewModel
{
  String getBalance(String username);
  ArrayList<String> getTransactions(String accountNo);
}
