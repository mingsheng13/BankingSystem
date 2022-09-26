import java.util.LinkedList;

public class BankAccount {
    LinkedList<String> user = new LinkedList<String>();;

    public void accountOpen(String name)
    {
        user.add(name);


    }


    public void accountDelete(String name)
    {
        user.remove(user.indexOf(name));
        System.out.println("User ("+name+") has been remove");

    }

    public void accountUpdate(String name,String update)
    {
        user.set(user.indexOf(name),update);
        System.out.println("User ("+name+") has change to ("+update+")");
    }
}
