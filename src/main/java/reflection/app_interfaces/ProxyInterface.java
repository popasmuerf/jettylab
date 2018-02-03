package reflection.app_interfaces;

/**
 * Created by mikeyb on 2/2/18.
 */
public interface ProxyInterface {
    public DataInterface getDataObject(String name);
    public PresentationInterface getPresentationObject(String name);
    public ServiceInterface getBusinessObject(String name);
}
