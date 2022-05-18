package Client.View.Customer.Transfers;

import Client.Model.Customer.Transfers.TransfersModel;

import java.util.ArrayList;

public class TransfersViewModel
{
  private TransfersModel model;

  public TransfersViewModel(TransfersModel model)
  {
    this.model=model;
  }

  public ArrayList<String> getTransfers(String accountNo)
  {
    return model.getTransfers(accountNo);
  }
}
