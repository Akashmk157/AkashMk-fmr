import java.util.Scanner;

public class Calculate {
    public static double findSquare(double num){
        return num*num;
    }
    public static double findCube(double num){
        return num*num*num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double num = sc.nextDouble();

        System.out.println("The square of " + num + " is " + findSquare(num));
        System.out.println("The cube of " + num + " is " + findCube(num));
    }
}
