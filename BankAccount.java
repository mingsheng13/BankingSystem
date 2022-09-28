import java.util.LinkedList;
import java.util.Scanner;
import java.util.Date;

class accountDetails    //a class for storing data types needed for a bank account
{
    private int id;
    private long balance;
    private int age;
    private String lastName;
    private String firstName;
    private String phone_number;
    private String email;
    private String date_of_create;

    //setter
    public void setID(int id)
    {
        this.id = id;
    }
    public void setBalance(long bal)
    {
        this.balance = bal;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setPhone_number(String phone_number)
    {
        this.phone_number = phone_number;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setDate_of_create()
    {
        Date today = new Date();
        this.date_of_create = today.toString();
    }

    //getter
    public int getID()
    {
        return id;
    }
    public long getBalance()
    {
        return balance;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getPhone_number()
    {
        return phone_number;
    }
    public String getEmail()
    {
        return email;
    }
    public int getAge()
    {
        return age;
    }
    public String getDate_of_create()
    {
        return date_of_create;
    }
    
}
public class BankAccount 
{
    private int id = 1;
    LinkedList<accountDetails> user = new LinkedList<accountDetails>();;

    //method used when creating a new account
    public void accountOpen()
    {
        accountDetails tmp = new accountDetails();
        Scanner input = new Scanner(System.in);

        tmp.setID(id);

        tmp.setBalance(0);      //account balance is always 0 when first created.

        System.out.print("Enter your first Name: ");
        tmp.setFirstName(input.nextLine());

        System.out.print("Enter your last Name: ");
        tmp.setLastName(input.nextLine());

        System.out.print("enter your age: ");
        tmp.setAge(input.nextInt());
        input.nextLine();

        System.out.print("Enter your phone number: ");
        tmp.setPhone_number(input.nextLine());

        System.out.print("Enter your email: ");
        tmp.setEmail(input.nextLine());

        tmp.setDate_of_create();

        user.add(tmp);
        this.id++;

        System.out.println("Account successfully created!");
        System.out.println("ID: "+ tmp.getID());
        System.out.println("Name: "+ tmp.getFirstName() + " " +tmp.getLastName());
        System.out.println("Age: "+tmp.getAge());
        System.out.println("Phone Number: "+tmp.getPhone_number());
        System.out.println("Email: "+ tmp.getEmail());
        System.out.println("");

    }

    //method for showing all accounts
    public void showAllAccounts()
    {
        System.out.println("----------------------------------");
        System.out.println("Showing all accounts: ");
        for (accountDetails accountDetails : user) {
            System.out.println("Id: "+ accountDetails.getID());
            System.out.println("Name: " + accountDetails.getFirstName() + " " + accountDetails.getLastName());
            System.out.println("Balance: " + accountDetails.getBalance());
            System.out.println("Age: " + accountDetails.getAge());
            System.out.println("Phone Number: " + accountDetails.getPhone_number());
            System.out.println("Email: " + accountDetails.getEmail());
            System.out.println("Date created: " + accountDetails.getDate_of_create());
        }
        System.out.println("");
    }
    public void accountDelete(String name)
    {
        System.out.println("Delete account: ");
        int userToDelete = 0;
        for (int i = 0; i < user.size(); i++) {
            if(user.get(i).getID() == userToDelete)
            {
                user.remove(i);
                break;
            }
        }
        //to be finished..
    }

    public void accountUpdate(String name,String update)
    {

    }
}
