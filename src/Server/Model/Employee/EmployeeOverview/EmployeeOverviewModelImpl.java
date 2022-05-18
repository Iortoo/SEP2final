package Server.Model.Employee.EmployeeOverview;

import Server.Database.DatabaseAdapterImpl;

import java.util.ArrayList;

public class EmployeeOverviewModelImpl implements EmployeeOverviewModel
{
  private static EmployeeOverviewModel instance;

  private EmployeeOverviewModelImpl()
  {
  }

  public static EmployeeOverviewModel getInstance()
  {
    if(instance==null) instance= new EmployeeOverviewModelImpl();
    return instance;
  }

  public ArrayList<String> getRequests()
  {
    return DatabaseAdapterImpl.getInstance().getRequests();
  }
}
