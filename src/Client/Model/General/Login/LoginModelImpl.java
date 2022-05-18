package Client.Model.General.Login;

import Client.Networking.Client;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class LoginModelImpl implements LoginModel
{
  private static LoginModel instance;
  private Client client;
  private PropertyChangeSupport support;

  private LoginModelImpl(Client client)
  {
    this.client=client;
    support = new PropertyChangeSupport(this);
    client.addListener("validation",this::validation);
  }

  public static LoginModel getInstance(Client client)
  {
    if(instance==null) instance = new LoginModelImpl(client);
    return instance;
  }

  public void login(String username, String password)
  {
    client.login(username,password);
  }

  private void validation(PropertyChangeEvent e)
  {
    support.firePropertyChange("validation",null,e.getNewValue());
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
