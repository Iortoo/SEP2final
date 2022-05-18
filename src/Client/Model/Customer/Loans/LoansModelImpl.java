package Client.Model.Customer.Loans;

import Client.Networking.Client;

import java.util.ArrayList;

public class LoansModelImpl implements LoansModel
{
  private static LoansModel instance;
  private Client client;

  private LoansModelImpl(Client client)
  {
    this.client=client;
  }

  public static LoansModel getInstance(Client client)
  {
    if(instance==null) instance=new LoansModelImpl(client);
    return instance;
  }

  public ArrayList<String> getLoans(String username)
  {
    return client.getLoans(username);
  }
}
