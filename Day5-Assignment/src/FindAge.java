import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class Person{
    private String firstName;
    private String lastName;
    private LocalDate dob;
    public Person(String firstName, String lastName, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public String Adult(){
        int age = getAge(dob);
        if(age >= 18){
            return "Adult";
        }
        else{
            return "Child";
        }
    }
    public void DisplayDetails(){
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + getAge(dob));
        System.out.println(Adult());
    }
    public int getAge(LocalDate dob){
        LocalDate now = LocalDate.now();
        return Period.between(dob, now).getYears();
    }

}
public class FindAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter Last Name: ");
        String lastName = sc.nextLine();
        System.out.println("Enter date of birth in yyyy/mm/dd format: ");
        String dob = sc.nextLine();
        String[] dobSplit = dob.split("/");
        LocalDate ld = LocalDate.of(Integer.parseInt(dobSplit[0]), Integer.parseInt(dobSplit[1]), Integer.parseInt(dobSplit[2]));
        Person p = new Person(firstName, lastName, ld);
        p.DisplayDetails();
    }
}
