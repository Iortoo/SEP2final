package Client.Model.Customer.NewLoan;

import Client.Networking.Client;

public class NewLoanModelImpl implements NewLoanModel
{
  private static NewLoanModel instance;
  private Client client;

  private NewLoanModelImpl(Client client)
  {
    this.client=client;
  }

  public static NewLoanModel getInstance(Client client)
  {
    if(instance==null) instance=new NewLoanModelImpl(client);
    return instance;
  }
}
