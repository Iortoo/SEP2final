package Server.Model.Customer.Profile;

import Server.Database.DatabaseAdapterImpl;
import Server.Database.Profile.ProfileDAOImpl;

public class ProfileModelImpl implements ProfileModel
{
  private static ProfileModel instance;

  private ProfileModelImpl()
  {
  }

  public static ProfileModel getInstance()
  {
    if(instance==null)instance=new ProfileModelImpl();
    return instance;
  }

  public String getFullName(String username)
  {
    return ProfileDAOImpl.getInstance().getFullName(username);
  }
}
