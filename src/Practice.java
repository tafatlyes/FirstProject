import java.util.Scanner; //Scanner Practice

public class Practice {

    public static void main(String[] args) {

                String empName;
                double totalhour;
                double hrate;
                double grossPay;
                double NetPay;

                Scanner scanMachine = new Scanner(System.in);
                System.out.print("Enter Employee Name :");
                empName = scanMachine.nextLine();

                System.out.print("Enter Total Hour :");
                totalhour = scanMachine.nextDouble();
                System.out.print("Enter Hourly rate : $");
                hrate = scanMachine.nextDouble();
                grossPay = totalhour * hrate;
                NetPay = grossPay - (grossPay * .06);

                System.out.println("Employee Name is :" + empName);
                System.out.println("Total Hour is : " + totalhour);
                System.out.println("Hourly Rate is : $" + hrate);
                System.out.println("Gross Pay is : $" + grossPay);
        System.out.println("The Net Pay is : $" + NetPay);
            }

    }


