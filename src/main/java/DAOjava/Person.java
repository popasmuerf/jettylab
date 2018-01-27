package DAOjava;

/**
 * Created by mdb on 1/27/18.
 */

/**
 * If you make any updates to this pojo....
 * how would you go about avoiding
 * potential brittlness of code depending on
 * this ?
 */
public class Person {
    private int age ;
    private String firstName ;
    private String lastName ;
    public int getAge(){
        return age ;
    }
    public void setAge(int age){
        this.age = age ;
    }
    public String getFirstName(){
        return firstName ;
    }
    public void setFirstName(String firstName){
        this.firstName =  firstName ;
    }

    public String getLastName(){
        return lastName ;
    }
    public void setLastName(String lastName){
        this.firstName =  lastName ;
    }
}
