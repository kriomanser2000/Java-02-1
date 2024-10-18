import java.util.Scanner;

public class NumReverse
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 4-digit number: ");
        int num = scanner.nextInt();
        String reversedString = new StringBuilder(String.valueOf(num)).reverse().toString();
        int reversedNum = Integer.parseInt(reversedString);
        System.out.println("Reversed num: " + reversedNum);
    }
}
