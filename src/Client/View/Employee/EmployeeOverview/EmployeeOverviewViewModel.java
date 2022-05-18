package Client.View.Employee.EmployeeOverview;

import Client.Model.Employee.EmployeeOverview.EmployeeOverviewModel;

import java.util.ArrayList;

public class EmployeeOverviewViewModel
{
  private EmployeeOverviewModel model;

  public EmployeeOverviewViewModel(EmployeeOverviewModel model)
  {
    this.model=model;
  }

  public ArrayList<String> getRequests()
  {
    return model.getRequests();
  }

  public void logOut()
  {
    model.employeeLogOut();
  }
}
