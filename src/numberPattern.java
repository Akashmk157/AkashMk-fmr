import java.util.Scanner;

public class numberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        int start;
        for(int i=1;i<=n;i++){
            start = 1;
            for(int j=1;j<=i;j++){
                System.out.print(start++ + " ");
            }
            System.out.println();
        }
    }
}
