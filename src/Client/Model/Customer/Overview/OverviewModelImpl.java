package Client.Model.Customer.Overview;

import Client.Networking.Client;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

/**
 * @author
 * Class that is implementing OverviewModel interface
 */
public class OverviewModelImpl implements OverviewModel
{
  private static OverviewModel instance;
  private Client client;
  private PropertyChangeSupport support;

  /**
   * Constructor that initialises the client and adds a listener
   */
  private OverviewModelImpl(Client client)
  {
    this.client=client;
    support = new PropertyChangeSupport(this);
    client.addListener("newBalance",this::newBalance);
  }

  /**
   * Method that instantiates the singleton
   * @return instance object
   */
  public static OverviewModel getInstance(Client client)
  {
    if(instance==null) instance=new OverviewModelImpl(client);
    return instance;
  }

  /**
   * Method that fires a PropertyChange
   */
  private void newBalance(PropertyChangeEvent e)
  {
    support.firePropertyChange("newBalance",null,"newBalance");
  }

  /**
   * Method that returns the balance of a user
   * @param userId the user ID
   * @return balance
   */
  public String getBalance(String userId)
  {
    return client.getBalance(userId);
  }

  /**
   * Method that returns a list of transactions
   * @param accountNo the account number
   * @return list of transactions
   */
  public ArrayList<String> getTransactions(String accountNo)
  {
    return client.getTransactions(accountNo);
  }

  /**
   * Method that adds a listener
   */
  public void addListener(String event, PropertyChangeListener listener)
  {
    support.addPropertyChangeListener(event,listener);
  }

  /**
   * Method that removes a listener
   */
  public void removeListener(String event, PropertyChangeListener listener)
  {
    support.removePropertyChangeListener(event,listener);
  }
}
