import java.util.Scanner;

public class SimpleNums
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter range start: ");
        int start = scanner.nextInt();
        System.out.println("Enter range end: ");
        int end = scanner.nextInt();
        System.out.println("Simple nums in range from: " + start + " to " + end + ":");
        for (int i = start; i <= end; i++)
        {
            if (isPrime(i))
            {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrime(int number)
    {
        if (number <= 1)
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++)
        {
            if (number % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
