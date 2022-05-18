package Client.Model.Customer.Overview;

import Client.Networking.Client;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class OverviewModelImpl implements OverviewModel
{
  private static OverviewModel instance;
  private Client client;
  private PropertyChangeSupport support;

  private OverviewModelImpl(Client client)
  {
    this.client=client;
    support = new PropertyChangeSupport(this);
    client.addListener("newBalance",this::newBalance);
  }

  public static OverviewModel getInstance(Client client)
  {
    if(instance==null) instance=new OverviewModelImpl(client);
    return instance;
  }

  private void newBalance(PropertyChangeEvent e)
  {
    support.firePropertyChange("newBalance",null,"newBalance");
  }

  public String getBalance(String username)
  {
    return client.getBalance(username);
  }

  public ArrayList<String> getTransactions(String accountNo)
  {
    return client.getTransactions(accountNo);
  }

  public void addListener(String event, PropertyChangeListener listener)
  {
    support.addPropertyChangeListener(event,listener);
  }

  public void removeListener(String event, PropertyChangeListener listener)
  {
    support.removePropertyChangeListener(event,listener);
  }
}
