package SystemUI;
import java.util.*;
import java.lang.*;


class Login {
    private ArrayList<String> passwords;
    private ArrayList<String> usernames;
    public static Login onlyInstance;

    public Login getOnlyInstance(){
        if(onlyInstance == null){
            onlyInstance = new Login();
        }
        return onlyInstance;
    }

    public void addUsername(String user){
        Login instance = getOnlyInstance();
        instance.getUsernames().add(user);
    }

    public void setUsername(int index, String newUser){
        Login instance = getOnlyInstance();
        instance.getUsernames().set(index, newUser);
    }

    public void removeUsername(String newUser){
        Login instance = getOnlyInstance();
        int index =  instance.getUsernames().indexOf(newUser);
        instance.getUsernames().remove(index);
    }

    public ArrayList<String> getUsernames(){
        return getOnlyInstance().usernames;
    }
    private Login(){
        passwords = new ArrayList<>();
        usernames = new ArrayList<>();
    }
}
