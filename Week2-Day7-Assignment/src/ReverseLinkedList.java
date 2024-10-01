import java.util.Scanner;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of LinkedList: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values: ");
        LinkedList ll = new LinkedList();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            ll.addLast(arr[i]);
        }

        System.out.println("Linked List: ");
        ll.display();

        System.out.println("\nReversed List: ");
        Node head = ll.reverseLL(); // reverseLL method is added in LinkedList class
        while(head != null){
            System.out.print(head.data +" --> ");
            head = head.next;
        }

    }
}
