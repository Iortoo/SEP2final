package Client.View.Customer.MakeTransfer;

import Client.Model.Customer.MakeTransfer.MakeTransferModel;

public class MakeTransferViewModel
{
  private MakeTransferModel model;

  public MakeTransferViewModel(MakeTransferModel model)
  {
    this.model=model;
  }

  public int transfer(String username,String accountNo,String recAccNo,String recSwift,String amount)
  {
    return model.transfer(username,accountNo,recAccNo,recSwift,amount);
  }
}
