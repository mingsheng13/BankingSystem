import java.util.LinkedList;
import java.util.Scanner;
import java.util.Date;

class accountDetails    //a class for storing data types needed for a bank account
{
    int id;
    int balance;
    int age;
    String lastName;
    String firstName;
    String phone_number;
    String email;

    String date_of_create;

    public void setID(int id)
    {
        this.id = id;
    }
    public void setBalance(int bal)
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
        System.out.println("ID: "+ tmp.id);
        System.out.println("Name: "+ tmp.firstName + " " +tmp.lastName);
        System.out.println("Age: "+tmp.age);
        System.out.println("Phone Number: "+tmp.phone_number);
        System.out.println("Email: "+ tmp.email);
        System.out.println("");
    }

    //method for showing all accounts
    public void showAllAccounts()
    {
        System.out.println("----------------------------------");
        System.out.println("Showing all accounts: ");
        for (accountDetails accountDetails : user) {
            System.out.println("Id: "+ accountDetails.id);
            System.out.println("Name: " + accountDetails.firstName + " " + accountDetails.lastName);
            System.out.println("Age: " + accountDetails.age);
            System.out.println("Phone Number: " + accountDetails.phone_number);
            System.out.println("Email: " + accountDetails.email);
            System.out.println("Date created: " + accountDetails.date_of_create);
        }
        System.out.println("");
    }
    public void accountDelete(String name)
    {
        System.out.println("Delete account: ");
    }

    public void accountUpdate(String name,String update)
    {

    }
}
