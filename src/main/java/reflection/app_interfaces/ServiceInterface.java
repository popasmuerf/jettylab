package reflection.app_interfaces;

import java.util.LinkedHashMap;

/**
 * Created by mikeyb on 2/2/18.
 * An implimentation of this interface is spawned
 * every request made to the framework.
 * This interface contains a method thorugh which the
 * parameters pss fromt eh servlet to the business
 * object
 * In additon, the proxy is passed to the business
 * object in order to provide it with the
 * tools necessary to peform its task.
 *
 */
public interface ServiceInterface {
    public void init(ProxyInterface proxy, LinkedHashMap parameters)throws Exception;
}
