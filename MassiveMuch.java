import java.util.Scanner;

public class MassiveMuch
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter massive elements count: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter massive elements: ");
        for (int i = 0; i < size; i++)
        {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter num for counting: ");
        int searchNumber = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < size; i++)
        {
            if (array[i] == searchNumber)
            {
                count++;
            }
        }
        System.out.println("Num " + searchNumber + " in massive " + count + " times");
    }
}
