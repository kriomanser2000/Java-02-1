import java.util.Scanner;

public class MassiveSum
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter massive size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter massive element: ");
        for (int i = 0; i < size; i++)
        {
            array[i] = scanner.nextInt();
        }
        System.out.print("Massive element: ");
        for (int i = 0; i < size; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < size; i++)
        {
            sum += array[i];
        }
        System.out.println("Massive element sum: " + sum);
        double average = (double) sum / size;
        System.out.println("Avg arifm elem massive: " + average);
    }
}
