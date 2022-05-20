package Server.Model.Customer.ProfileInfo;

import Server.Database.ChangeInfo.ChangeInfoDAOImpl;
import Server.Database.DatabaseAdapterImpl;
import Server.Database.ProfileInfo.ProfileInfoDAOImpl;

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
    String dob = dobY+"-"+dobM+"-"+dobD;
    ChangeInfoDAOImpl.getInstance().requestInfoChange(fmName,lName,username,adress,dob,phone);
  }

  public String[] getInfo(String username)
  {
    String[] aux = ProfileInfoDAOImpl.getInstance().getInfo(username);
    String[] rtrn = new String[8];
    String[] dob = aux[4].split("-");
    rtrn[0]=aux[0];
    rtrn[1]=aux[1];
    rtrn[2]=aux[2];
    rtrn[3]=aux[3];
    rtrn[4]=dob[2];
    rtrn[5]=dob[1];
    rtrn[6]=dob[0];
    rtrn[7]=aux[5];

    return rtrn;
  }
}
