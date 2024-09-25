public class Employee {
//    int Id Employee ID
//    String Name Employee Name
//    Float BasicSalary The basic salary for the employee
//    Float Bonus Bonus amount for the employee
//    Float NetSalary The net salary after all calculations

    int EmployeeID;
    String EmployeeName;
    float basicSalary;
    float bonus;
    float netSalary;

    void displayDetails() {
        System.out.println("Employee ID: " + EmployeeID);
        System.out.println("Employee Name: " + EmployeeName);
        System.out.println("Bonus: " + bonus);
        System.out.println("Net Salary: " + netSalary);
    }
}
