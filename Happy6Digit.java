import java.util.Scanner;

public class Happy6Digit
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 6-digit num: ");
        int num = scanner.nextInt();
        if (num >= 100000 && num <= 999999)
        {
            String numStr = String.valueOf(num);
            int sumFirstThree = Character.getNumericValue(numStr.charAt(0)) +
                    Character.getNumericValue(numStr.charAt(1)) +
                    Character.getNumericValue(numStr.charAt(2));
            int sumLastThree = Character.getNumericValue(numStr.charAt(3)) +
                    Character.getNumericValue(numStr.charAt(4)) +
                    Character.getNumericValue(numStr.charAt(5));
            if (sumFirstThree == sumLastThree)
            {
                System.out.println("Happy num!");
            }
            else
            {
                System.out.println("Non Happy num.");
            }
        }
        else
        {
            System.out.println("ERROR");
        }
    }
}
