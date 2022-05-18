package Client.Model.Employee.EmployeeOverview;

import Client.Networking.Client;

import java.util.ArrayList;

public class EmployeeOverviewModelImpl implements EmployeeOverviewModel
{
  private static EmployeeOverviewModel instance;
  private Client client;

  private EmployeeOverviewModelImpl(Client client)
  {
    this.client=client;
  }

  public static EmployeeOverviewModel getInstance(Client client)
  {
    if(instance==null) instance= new EmployeeOverviewModelImpl(client);
    return instance;
  }

  public ArrayList<String> getRequests()
  {
    return client.getRequests();
  }

  public void employeeLogOut()
  {
    client.employeeLogOut();
  }
}
