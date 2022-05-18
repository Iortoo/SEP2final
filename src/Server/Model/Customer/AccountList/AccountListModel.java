package Server.Model.Customer.AccountList;

import java.util.ArrayList;

public interface AccountListModel
{
  ArrayList<String> getAccounts(String username);
}
