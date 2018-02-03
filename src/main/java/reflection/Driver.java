package reflection;

import reflection.app_interfaces.ServiceInterface;

import java.lang.reflect.Constructor;

/**
 * Created by mikeyb on 2/2/18.
 */
public class Driver {

    /**
     * The Java reflection API provides an easy mechanism
     * with which to execute this framework.  In this first part
     * of the series, Reflection itself is not used.  For now,
     * we will use the
     *
     * class.forName(...)
     * method to load the appropiate business object....
     *
     *
     * The method loadServiceObject class and dynamically
     * loads the business object based upon the
     * tbe action name provided by the proxy.  This method
     * attempts to load the business object and , if any
     * exceptions occur, loads an object to handle
     * the error conditions.  It assumes a default constructor
     * for this example, bu can be tailored to suit any development
     * efforts as needed.
     *https://www.javaworld.com/article/2076541/java-web-development/building-a-java-servlet-framework-using-reflection--part-1.html
     *
     * The two main benefits to loading.
     * @param actionName
     * @return
     */


    private static ServiceInterface loadBusinessObject(String actionName){
        ServiceInterface servInterface = null ;
        String SERVICE_OBJECT = "....";
        try{
            //attempt to retrieve the class from the class loader
            Class _class = Class.forName(actionName + SERVICE_OBJECT) ;
            //initialze a class array with no elements(used in the constructor)
            Class[] parameterTypes = new Class[0] ;
            //Locate the constructor with no arguments
            Constructor constructor = _class.getConstructor(parameterTypes);
            Object[] initArgs = new Object[0] ;
            servInterface =(ServiceInterface) constructor.newInstance(initArgs);
        }catch(Exception e){
            //servInterface = (ServiceInterface) new ErrorServiceInterfaceObject() ;
            e.printStackTrace();

        }


        return null ;
    }
}
