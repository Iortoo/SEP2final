package Server.Model.General.Register;

import Server.Database.DatabaseAdapterImpl;

public class RegisterModelImpl implements RegisterModel
{
  private static RegisterModel instance;

  private RegisterModelImpl()
  {
  }

  public static RegisterModel getInstance()
  {
    if(instance==null) instance = new RegisterModelImpl();
    return instance;
  }

  public void signup(String username,String type, String fName, String lName, String address, String dob, String phone)
  {
    DatabaseAdapterImpl.getInstance().signup(username,type,fName,lName,address,dob,phone);
  }
}
