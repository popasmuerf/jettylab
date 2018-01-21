package testlab;

/**
 * Created by mdb on 1/18/18.
 */
public class MessageUtil {

    private String message;

    //Constructor
    //@param message to be printed

    public MessageUtil(String message){
        this.message = message;
    }

    // prints the message
    public String printMessage(){
        System.out.println(message);
        return message;
    }
    public String salutationMessage(){
        System.out.println(message);
        return message;
    }
}
