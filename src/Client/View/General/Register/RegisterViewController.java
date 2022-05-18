package Client.View.General.Register;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import Client.View.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.io.IOException;

public class RegisterViewController implements ViewController
{
  private ViewHandler viewHandler;
  private RegisterViewModel viewModel;
  @FXML MenuButton accType;
  @FXML TextField fmName;
  @FXML TextField lName;
  @FXML TextField id;
  @FXML TextField address;
  @FXML TextField dobD;
  @FXML TextField dobM;
  @FXML TextField dobY;
  @FXML TextField phone;
  @FXML Button registerButton;
  @FXML Button loginButton;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory, String username)
  {
    this.viewHandler=viewHandler;
    viewModel=viewModelFactory.getRegisterViewModel();
  }

  public void onLoginButton() throws IOException
  {
    reset();
    viewHandler.openLoginView();
  }

  public void onRegisterButton()
  {
    if(validate())
    {

      String type = accType.getTypeSelector();
      String dob = dobD.getText()+"/"+dobM.getText()+"/"+dobY.getText();

      viewModel.signup(id.getText(),type,fmName.getText(),lName.getText(),address.getText(),dob,phone.getText());

      JOptionPane.showMessageDialog(null,"Request to signup has been sent and is awaiting approval");
      reset();
    }
  }

  private void reset()
  {
    fmName.clear();
    lName.clear();
    id.clear();
    address.clear();
    dobD.clear();
    dobM.clear();
    dobY.clear();
    phone.clear();
  }

  private boolean validate()
  {
    // check for null
    if(fmName.getText().isEmpty() || lName.getText().isEmpty() || id.getText().isEmpty() || address.getText().isEmpty() || dobD.getText().isEmpty() || dobM.getText().isEmpty() || dobY.getText().isEmpty() || phone.getText().isEmpty())
    {
      JOptionPane.showMessageDialog(null,"Please fill in all fields");
      return false;
    }

    // check for letters in id
    for(int i=0;i<id.getText().length();i++)
    {
      if(!"0123456789".contains(id.getText().charAt(i)+""))
      {
        JOptionPane.showMessageDialog(null,"Only digits allowed in cpr field");
        return false;
      }
    }

    //check date
    int day=0, month=0, year=0;

    // check day
    if(dobD.getText().length()!=1 && dobD.getText().length()!=2)
    {
      dateError();
      return false;
    }
    for(int i=0;i<dobD.getText().length();i++)
    {
      if(!"0123456789".contains(dobD.getText().charAt(i)+""))
      {
        dateError();
        return false;
      }
      day= day*10+ (dobD.getText().charAt(i)-'0');
    }

    // check month
    if(dobM.getText().length()!=1 && dobM.getText().length()!=2)
    {
      dateError();
      return false;
    }
    for(int i=0;i<dobM.getText().length();i++)
    {
      if(!"0123456789".contains(dobM.getText().charAt(i)+""))
      {
        dateError();
        return false;
      }
      month= month*10+ (dobM.getText().charAt(i)-'0');
    }

    // check year
    for(int i=0;i<dobY.getText().length();i++)
    {
      if(!"0123456789".contains(dobY.getText().charAt(i)+""))
      {
        dateError();
        return false;
      }
      year= year*10+ (dobY.getText().charAt(i)-'0');
    }

    // check if date is correct
    if(!dateValidation(day,month,year)){
      dateError();
      return false;
    }

    // check for letters in phone
    for(int i=0;i<phone.getText().length();i++)
    {
      if(!"0123456789".contains(phone.getText().charAt(i)+""))
      {
        JOptionPane.showMessageDialog(null,"Only digits allowed in phone field");
        return false;
      }
    }

    return true;
  }

  private void dateError()
  {
    JOptionPane.showMessageDialog(null,"Enter a valid date");
  }

  private boolean dateValidation(int day,int month, int year)
  {
    System.out.println(day+" "+month+" "+year);
    if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
    {
      if(month>=1 && month <=12)
      {
        switch(month)
        {
          case 1: case 3: case 5: case 7: case 8: case 10: case 12:
          {
            if(day>=1 && day <=31) return true;
          }break;
          case 2:
          {
            if(day>=1 && day<=29) return true;
          }break;
          case 4: case 6: case 9: case 11:
          {
            if(day>=1 && day<=30) return true;
          } break;
        }
      }
    }
    else
    {
      if(month>=1 && month <=12)
      {
        switch(month)
        {
          case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        {
          if(day>=1 && day <=31) return true;
        }break;
          case 2:
          {
            if(day>=1 && day<=28) return true;
          }break;
          case 4: case 6: case 9: case 11:
        {
          if(day>=1 && day<=30) return true;
        } break;
        }
      }
    }
    return false;
  }
}
