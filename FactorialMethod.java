import java.util.Scanner;

public class FactorialMethod
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = {3, 4, 5};
        long[] factorials = calcFactorials(inputArray);
        System.out.println("Factorials of massive elements: ");
        for(int i = 0; i < factorials.length; i++)
        {
            System.out.println("Factorial " + inputArray[i] + " = " + factorials[i]);
        }
    }
    public static long[] calcFactorials(int[] array)
    {
        long[] factorials = new long[array.length];
        for (int i = 0; i < array.length; i++)
        {
            factorials[i] = factorial(array[i]);
        }
        return factorials;
    }
    public static long factorial(int number)
    {
        long result = 1;
        for (int i = 1; i <= number; i++)
        {
            result *= i;
        }
        return result;
    }
}
