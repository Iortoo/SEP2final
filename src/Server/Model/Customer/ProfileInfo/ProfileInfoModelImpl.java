package Server.Model.Customer.ProfileInfo;

import Server.Database.DatabaseAdapterImpl;

public class ProfileInfoModelImpl implements ProfileInfoModel
{
  private static ProfileInfoModel instance;

  private ProfileInfoModelImpl()
  {
  }

  public static ProfileInfoModel getInstance()
  {
    if(instance==null)instance=new ProfileInfoModelImpl();
    return instance;
  }

  public void requestInfoChange(String fmName,String lName,String username,String adress,String dobD,String dobM,String dobY,String phone)
  {
    DatabaseAdapterImpl.getInstance().requestInfoChange(fmName,lName,username,adress,dobD,dobM,dobY,phone);
  }

  public String[] getInfo(String username)
  {
    return DatabaseAdapterImpl.getInstance().getInfo(username);
  }
}
