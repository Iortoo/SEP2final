package Client.View.General.Register;

import Client.Model.General.Register.RegisterModel;

public class RegisterViewModel
{
  private RegisterModel model;

  public RegisterViewModel(RegisterModel model)
  {
    this.model=model;
  }

  public void signup(String id, String type, String fName, String lName,String address, String dob, String phone)
  {
    model.signup(id,type,fName,lName,address,dob,phone);
  }
}
