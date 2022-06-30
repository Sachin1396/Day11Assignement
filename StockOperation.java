import java.util.Scanner;

public class StockOperation {

    int total_stock = 0;
    void details(String[] shareName,int[] sharePrice,int[] numberOfShare,int number){


            int k = 0;

            for(int j=0;j<number;j++)
            {
                total_stock = total_stock +(sharePrice[j] * numberOfShare[k]);
                System.out.println("total price of share " + shareName[j]+ " "+sharePrice[j] * numberOfShare[k]);
                k++;
            }

        System.out.println(total_stock + "total stock price");

    }
}
