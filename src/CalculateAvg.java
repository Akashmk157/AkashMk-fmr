import java.util.Scanner;

public class CalculateAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter the " + i + "th number: ");
            array[i] = sc.nextInt();
        }
        System.out.println("The average of the array is: "+ calculateAvg(array));

    }
    public static double calculateAvg(int[] arr){
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
