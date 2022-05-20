package Server.Database.Transaction;

import java.util.ArrayList;

public interface TransactionDAO
{
  ArrayList<String> getTransactions(String accountNo);
}
