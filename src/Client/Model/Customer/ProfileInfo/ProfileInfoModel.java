package Client.Model.Customer.ProfileInfo;

public interface ProfileInfoModel
{
  void requestInfoChange(String fmName,String lName,String username,String adress,String dobD,String dobM,String dobY,String phone);
  String[] getInfo(String username);
}
