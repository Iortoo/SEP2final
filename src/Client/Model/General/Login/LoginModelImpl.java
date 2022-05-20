package Client.Model.General.Login;

import Client.Networking.Client;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * Class that is implementing LoginModel interface
 */
public class LoginModelImpl implements LoginModel
{
  private static LoginModel instance;
  private Client client;
  private PropertyChangeSupport support;

  /**
   * Constructor that initialises the client and adds a listener
   */
  private LoginModelImpl(Client client)
  {
    this.client=client;
    support = new PropertyChangeSupport(this);
    client.addListener("validation",this::validation);
  }

  /**
   * Method that instantiates the singleton
   * @return instance object
   */
  public static LoginModel getInstance(Client client)
  {
    if(instance==null) instance = new LoginModelImpl(client);
    return instance;
  }

  /**
   * Method that logs in a user
   * @param userId the user ID
   * @param password the password of the user
   */
  public void login(String userId, String password)
  {
    client.login(userId,password);
    System.out.println("MODEL");
  }

  /**
   * Method that fires a PropertyChange
   */
  private void validation(PropertyChangeEvent e)
  {
    support.firePropertyChange("validation",null,e.getNewValue());
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
