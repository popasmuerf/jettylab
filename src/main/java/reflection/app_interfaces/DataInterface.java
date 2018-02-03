package reflection.app_interfaces;

/**
 * Created by mikeyb on 2/2/18.
 * https://www.javaworld.com/article/2076541/java-web-development/building-a-java-servlet-framework-using-reflection--part-1.html
 *
 *
 * This simple interface for logging user actions or accepting user inputs
 * to a database.  Because all DataObjects must satisfy the DataInteface, it is
 * possible for a singl object to perform the duties associated with the database
 * interaction.  Again, no component outside of the data functionality should have to deal
 * with connection poooling or database parameters.....
 *
 *
 *
 */
public interface DataInterface {
    public void intializeDataObject() ;
    public void beginTransaction() ;
    public void commitTransaction();
    public void rollbackTransistion() ;
    public void executeSQL(String query);
    public void executeNoSQL(String query);
}
