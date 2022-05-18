package Client.Model.Customer.LoanOverview;

import Client.Networking.Client;

public class LoanOverviewModelImpl implements LoanOverviewModel
{
  private static LoanOverviewModel instance;
  private Client client;

  private  LoanOverviewModelImpl(Client client)
  {
    this.client=client;
  }

  public static LoanOverviewModel getInstance(Client client)
  {
    if(instance==null) instance = new LoanOverviewModelImpl(client);
    return instance;
  }
}
