import java.util.LinkedList;

class accountDetails
{
    int id;

    int balance;
    String lastName;
    String firstName;
    String phone_number;
    String email;
    String age;
    String date_of_create;
    public accountDetails(int id, int balance, String lastName, String firstName, String phone_number, String email, String age, String date_of_create)
    {
        this.id = id; this.balance = balance; this.lastName = lastName; this.firstName = firstName; this.phone_number = phone_number; this.email = email; this.age = age; this.date_of_create = date_of_create;
    }
    
    
}
public class BankAccount 
{
    LinkedList<accountDetails> user = new LinkedList<accountDetails>();;

    public void accountOpen(int id, int balance, String lastName, String firstName, String phone_number, String email, String age, String date_of_create)
    {
        accountDetails tmp = new accountDetails(id, balance, lastName, firstName, phone_number, email, age, date_of_create);
        user.add(tmp);
        System.out.println(user.getFirst().toString());
    }


    public void accountDelete(String name)
    {
        

    }

    public void accountUpdate(String name,String update)
    {

    }
}
