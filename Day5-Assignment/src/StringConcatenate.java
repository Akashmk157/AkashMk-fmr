import java.util.Scanner;

public class StringConcatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter a last name: ");
        String lastName = sc.nextLine();

        String fullName = firstName + " " + lastName;
        //String FulName = firstName.concat(lastName);
        System.out.println("Full name: "+fullName);

    }
}
