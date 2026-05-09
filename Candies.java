import java.util.Scanner;

public class CandiesJar
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int totalCandies = 10;
        int minCandies = 5;

        int sold = sc.nextInt();

        if(sold > totalCandies || sold < 0)
        {
            System.out.println("INVALID INPUT");
        }
        else
        {
            totalCandies = totalCandies - sold;

            if(totalCandies <= k)
            {
                totalCandies = 10;
            }

            System.out.println("Number of Candies Sold: " + sold);

            System.out.println("Number of Candies available:" + totalCandies);
        }
    }
}
