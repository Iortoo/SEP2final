package Client.View.Customer.Profile;

import Client.Model.Customer.Profile.ProfileModel;

public class ProfileViewModel
{
  private ProfileModel model;

  public ProfileViewModel(ProfileModel model)
  {
    this.model=model;
  }

  public String getFullName(String username)
  {
    return model.getFullName(username);
  }

  public void logOut()
  {
    model.customerLogOut();
  }
}
