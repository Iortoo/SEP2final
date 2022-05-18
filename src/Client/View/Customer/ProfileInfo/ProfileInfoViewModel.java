package Client.View.Customer.ProfileInfo;

import Client.Model.Customer.ProfileInfo.ProfileInfoModel;

public class ProfileInfoViewModel
{
  private ProfileInfoModel model;

  public ProfileInfoViewModel(ProfileInfoModel model)
  {
    this.model=model;
  }

  public void requestInfoChange(String fmName,String lName,String username,String adress,String dobD,String dobM,String dobY,String phone)
  {
    model.requestInfoChange(fmName,lName,username,adress,dobD,dobM,dobY,phone);
  }

  public String[] getInfo(String username)
  {
    return model.getInfo(username);
  }
}
