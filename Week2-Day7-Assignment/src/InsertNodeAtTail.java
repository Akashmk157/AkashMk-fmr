import java.util.Scanner;

public class InsertNodeAtTail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of LinkedList: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        LinkedList ll = new LinkedList();
        for(int i=0; i<n; i++){
            ll.addLast(arr[i]);
            System.out.print("After Inserting "+arr[i]+", The List is : ");
            ll.display();
            System.out.println();
        }
    }
}
