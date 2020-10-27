package Try;
import java.util.Scanner;

public class ScannerExceptionMine {

    private static int a;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First number :");
        try {
            int a = scanner.nextInt();

            System.out.println("Enter second number :");
            int b = scanner.nextInt();

            int c =a+b;
            System.out.println("Total is "+c);
        }
        catch (Exception e){
            System.out.println("Invalid data. Please insert a number!!");
        }


    }
}
