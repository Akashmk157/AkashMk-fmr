import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //PermanentEmployee
        System.out.println("permanent Employee----------");
        PermanentEmployee permanentEmployee = new PermanentEmployee();
        System.out.println("Employee Id: ");
        int employeeId = sc.nextInt();
        System.out.println("Employee Name: ");
        String employeeName = sc.next();
        System.out.println("Basic Salary: ");
        float employeeSalary = sc.nextFloat();
        System.out.println("PF : ");
        float employeePF = sc.nextFloat();

        permanentEmployee.initialize(employeeId, employeeName, employeeSalary, employeePF);
        System.out.println("Permanent Employee Details: ");
        permanentEmployee.displayDetails();

        System.out.println("Temporary Employee ------------");
        TemporaryEmployee temporaryEmployee = new TemporaryEmployee();
        System.out.println("Employee Id: ");
        employeeId = sc.nextInt();
        System.out.println("Employee Name: ");
        employeeName = sc.next();
        System.out.println("Daily Wages : ");
        float dailyWages = sc.nextFloat();
        System.out.println("No of days: ");
        int noOfDays = sc.nextInt();

        temporaryEmployee.initialize(employeeId, employeeName, dailyWages, noOfDays);
        System.out.println("Temporary Employee Details: ");
        temporaryEmployee.displayDetails();
    }
}