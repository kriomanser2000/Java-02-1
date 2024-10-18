import java.util.Scanner;

public class MethodSum
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int start = 1;
        int end = 10;
        int result = sumInRange(start, end);
        System.out.println("The sum of nums from " + start + " to " + end + " = " + result);
    }
    public static int sumInRange(int start, int end)
    {
        int sum = 0;
        if (start > end)
        {
            int temp = start;
            start = end;
            end = temp;
        }
        for (int i = start; i <= end; i++)
        {
            sum += i;
        }
        return sum;
    }
}
