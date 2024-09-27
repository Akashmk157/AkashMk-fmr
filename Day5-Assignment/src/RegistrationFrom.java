import java.util.Scanner;

public class RegistrationFrom {
    public static void main(String[] args) {
        String name;
        int age;
        String country;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = input.next();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.print("Enter your country: ");
        country = input.next();

        //details
        System.out.println("Welcome "+name+". Your age is "+age+" and you are from "+country);

    }
}
