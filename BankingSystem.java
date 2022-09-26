import java.util.LinkedList;
import java.util.Scanner;
public class BankingSystem {
    public static void main(String[] args)
    {
        BankAccount bank = new BankAccount();
        bank.accountOpen("Derek");
        bank.accountOpen("MingSheng");
        bank.accountOpen("XinYuan");
        bank.accountDelete("Derek");
        bank.accountUpdate("XinYuan","Derek");
        System.out.println(bank.user);
    }

    public void withdrawal()
    {

    }

    public void deposit()
    {

    }

    public void checkBalance()
    {

    }


}
