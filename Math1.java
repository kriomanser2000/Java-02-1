import java.util.Scanner;

public class Math1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first num: ");
        double firstNum = scanner.nextDouble();
        System.out.println("Enter second num: ");
        double secondNum = scanner.nextDouble();
        double sum = firstNum + secondNum;
        double difference = firstNum - secondNum;
        double product = firstNum * secondNum;
        System.out.println("Suma: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
    }
}
