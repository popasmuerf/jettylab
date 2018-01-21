package DAOjava;

import java.sql.SQLException;

/**
 * Created by mdb on 1/6/18.
 */
public class MethodReflection {
    public void sayHello(String greeting, String name){
        System.out.println(greeting + "" + name);
    }
    public String search(String keyword) throws SQLException{
        return null ;
    }
}
