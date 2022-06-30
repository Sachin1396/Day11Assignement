import java.util.Scanner;

public class Account {
    int balance;
    int debit(int amount,int debited)
    {
        if(amount<debited)
        {
            System.out.println("debit amount execeds account balance");
            balance=amount;
        }
        else {
            System.out.println("debited amount is"+debited);
            balance=amount-debited;
        }
        return balance;
    }

}
