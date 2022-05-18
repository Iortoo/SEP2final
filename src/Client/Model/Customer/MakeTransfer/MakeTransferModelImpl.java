package Client.Model.Customer.MakeTransfer;

import Client.Networking.Client;

public class MakeTransferModelImpl implements MakeTransferModel
{
  private static MakeTransferModel instance;
  private Client client;

  private MakeTransferModelImpl(Client client)
  {
    this.client=client;
  }

  public static MakeTransferModel getInstance(Client client)
  {
    if(instance==null) instance=new MakeTransferModelImpl(client);
    return instance;
  }

  public int transfer(String username,String accountNo,String recAccNo,String recSwift,String amount)
  {
    return client.transfer(username,accountNo,recAccNo,recSwift,amount);
  }
}
