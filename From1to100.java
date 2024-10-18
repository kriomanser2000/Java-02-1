import java.util.Scanner;

public class From1to100
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num from 1 to 100: ");
        int num = scanner.nextInt();
        if (num >= 1 && num <= 100) {
            if (num % 3 == 0 && num % 5 == 0)
            {
                System.out.println("Fizz Buzz");
            }
            else if (num % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else if (num % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(num);
            }
        }
        else
        {
            System.out.println("ERROR");
        }
    }
}
