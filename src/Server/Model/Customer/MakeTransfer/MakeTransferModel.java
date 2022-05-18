package Server.Model.Customer.MakeTransfer;

public interface MakeTransferModel
{
  int transfer(String username,String accountNo,String recAccNo,String recSwift,String amount);
}
