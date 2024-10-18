import java.util.Scanner;

public class HoursDiap
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hours count(0-23): ");
        int hours = scanner.nextInt();
        if (hours >= 0 && hours < 6)
        {
            System.out.println("Good Night");
        }
        else if (hours >= 6 && hours < 13)
        {
            System.out.println("Good Morning");
        }
        else if (hours >= 13 && hours < 17)
        {
            System.out.println("Good Afternoon");
        }
        else if (hours >= 17 && hours < 24)
        {
            System.out.println("Good Evening");
        }
        else
        {
            System.out.println("ERROR");
        }
    }
}
