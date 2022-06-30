import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args)
    {
        System.out.println("Enter the amount in the account");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        System.out.println("Enter withdrawing amont");
        int debited = scanner.nextInt();
        Account account = new Account();
      int debitedAmount = account.debit(amount,debited);
        System.out.println("Remaining balance"+debitedAmount);
    }
}
