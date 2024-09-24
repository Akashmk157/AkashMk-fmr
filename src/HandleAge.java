import java.util.Scanner;

public class HandleAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        checkEligibility(age);
    }
    public static void checkEligibility(int age) {
        if (age >= 18) {
            System.out.println("Eligible");
        }
        else if (age > 0) {
            System.out.println("Not Eligible");
        }
        else {
            System.out.println("Invalid age");
        }
    }
}
