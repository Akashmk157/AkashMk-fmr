import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();

        String[] words = s.split(" ");
        String reverseSen = "";
        for (int i = words.length-1; i >= 0; i--) {
            reverseSen += words[i] + " ";
        }
        System.out.println(reverseSen);

    }
}
