import java.util.ArrayList;
import java.util.Scanner;

class UserException extends Exception {
    public UserException(String message) {
        super(message);
    }
}
class Employee{
    private int id;
    private String name;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
class EmployeeCollection{
    private final ArrayList<Employee> employees =  new ArrayList<>();
    public void addEmployee(Employee emp) {
        employees.add(emp);
    }
    public boolean getEmployee(int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
public class UserDefinedException {
    public static void main(String[] args) {
        EmployeeCollection ec = new EmployeeCollection();
        ec.addEmployee(new Employee(1, "Alex"));
        ec.addEmployee(new Employee(2, "Bob"));
        ec.addEmployee(new Employee(3, "Charlie"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        int id = sc.nextInt();

        try{
            if(ec.getEmployee(id)) {
                System.out.println("Employee Found..");
            }
            else{
                throw new UserException("Employee with ID "+id+" not found");
            }
        }
        catch (UserException e) {
            System.out.println(e);
        }
    }
}
