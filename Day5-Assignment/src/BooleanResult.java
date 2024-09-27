import java.util.Scanner;

public class BooleanResult {
    public static void main(String[] args) {
        int x, y;
        boolean result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        x = sc.nextInt();
        System.out.println("Enter the value of y: ");
        y = sc.nextInt();

        if(x<y){
            result = true;
        }
        else{
            result = false;
        }
        System.out.println("The result of whether x is less than y is "+result);

    }
}
