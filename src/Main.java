import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declarations
        Scanner input= new Scanner(System.in);
        int EmpId;
        double earnings, FTax, STax, SSec, Mcare, PPlan, Health, Total_Deductions, NetPay;
        String Lname, Fname;

//Input

        System.out.println(" Enter the employee ID:");
        EmpId= input.nextInt();

        System.out.println(" Enter the last name:");
        Lname= input.next();

        System.out.println("Enter the first name:");
        Fname= input.next();

        System.out.println("Enter the earnings for the current month:");
        earnings= input.nextDouble();

        System.out.println("");

//Process

        FTax= (.15 * earnings);
        STax= (.05 * earnings);
        SSec= (.05 * earnings);
        Mcare= (.03 * earnings);
        PPlan= (.08 * earnings);
        Health= 125.00;
        Total_Deductions= FTax+STax+SSec+Mcare+PPlan+Health;
        NetPay= earnings - Total_Deductions;

//output

        //net pay after deductions

        System.out.println("Employee ID: " + EmpId);
        System.out.println("Employee Name: " +Fname+" "+Lname);
        System.out.println();
        System.out.printf("Earnings         : %10.2f\n", earnings);
        System.out.printf("Federal Tax      : %10.2f\n", FTax);
        System.out.printf("State Tax        : %10.2f\n", STax);
        System.out.printf("Social Security  : %10.2f\n" ,SSec);
        System.out.printf("Medicare/Medicaid: %10.2f\n" ,Mcare);
        System.out.printf("Pension Plan     : %10.2f\n" ,PPlan);
        System.out.printf("Health Insurance : %10.2f\n" ,Health);
        System.out.println();
        System.out.printf("NET PAY          : %10.2f\n ",NetPay);
    }
}