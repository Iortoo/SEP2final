package Server.Database.AccountList;

import java.util.ArrayList;

public interface AccountListDAO
{
  ArrayList<String> getAccounts(String username);
}
