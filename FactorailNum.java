import java.util.Scanner;

public class FactorailNum
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num for Factorial: ");
        int num = scanner.nextInt();
        if (num < 0)
        {
            System.out.println("Factorial Error for negative nums.");
        }
        else
        {
            long factorial = 1;
            for (int i = 1; i <= num; i++)
            {
                factorial *= i;
            }
            System.out.println("Factorial num: " + num + " = " + factorial);
        }
    }
}
