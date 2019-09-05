import java.util.ArrayList;
import java.io.Serializable;
import java.util.logging.Logger;

public class User implements Serializable {

    private String firstName, LastName, username;
    private char[] password;
    private ArrayList<Message> messages;

    public User(String firstName, String lastName, String aUsername, char[] aPassword){
        messages=new ArrayList<>();
        username=aUsername;
        password=aPassword;
    }

    public String getUsername(){
        return username;
    }

    public char[] getPassword(){
        return password;
    }

    public void addMessage(Message message){

        messages.add(message);
        Logger.getGlobal().info("Message added!");
    }

    public ArrayList<Message> getMessages(){
        return messages;
    }

    public String toString(){
        return new StringBuffer("Username: ").append(username).append(" Password: ").append(password).toString();
    }
}
