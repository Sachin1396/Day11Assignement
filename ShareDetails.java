import java.util.Scanner;

public class ShareDetails {
    void shareDetail(){
        String[] shareName = new String[5];
        int[] sharePrice = new int[5];
        int[] numberOfShare = new int[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the Number of stocks");
        int number = scanner.nextInt();
        System.out.println("Enter share name");
        for(int i=0;i<number;i++)
        {
            shareName[i]=scanner.next();
        }
        System.out.println("Enter share price");
        for(int i=0;i<number;i++)
        {
            sharePrice[i]=scanner.nextInt();
        }
        System.out.println("Enter the number of share");
        for(int i=0;i<number;i++)
        {
            numberOfShare[i]=scanner.nextInt();
        }
        for (int i=0;i<number;i++)
        {
            System.out.print(shareName[i]+ " ");
            System.out.print(sharePrice[i]+" ");
            System.out.println(numberOfShare[i]+ " ");

        }
        StockOperation stockOperation = new StockOperation();

        stockOperation.details(shareName,sharePrice,numberOfShare,number);

    }
}
