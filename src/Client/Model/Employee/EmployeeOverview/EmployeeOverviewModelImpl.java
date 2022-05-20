package Client.Model.Employee.EmployeeOverview;

import Client.Networking.Client;

import java.util.ArrayList;

/**
 * Class that is implementing EmployeeOverviewModel interface
 */
public class EmployeeOverviewModelImpl implements EmployeeOverviewModel
{
  private static EmployeeOverviewModel instance;
  private Client client;

  /**
   * Constructor that initialises the client
   */
  private EmployeeOverviewModelImpl(Client client)
  {
    this.client=client;
  }

  public static EmployeeOverviewModel getInstance(Client client)
  {
    if(instance==null) instance= new EmployeeOverviewModelImpl(client);
    return instance;
  }

  /**
   * Method the returns requests sent to an employee
   * @return list of requests
   */
  public ArrayList<String> getRequests()
  {
    return client.getRequests();
  }

  /**
   * Method that logs out an employee
   */
  public void employeeLogOut()
  {
    client.employeeLogOut();
  }
}
