import java.util.Scanner;

public class AccountDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account ID");
        int id = sc.nextInt();
        System.out.println("Enter account type");
        String accountType = sc.next();
        System.out.println("Enter balance");
        double balance = sc.nextDouble();
        System.out.println("Enter Withdraw amount");
        double WithdrawAmount = sc.nextDouble();

        Account account = new Account(id, accountType, balance);
        System.out.println(account.getDetails());
        boolean withdraw = account.WithDraw(WithdrawAmount);
        if(withdraw){
            System.out.println("New Balance: "+account.getBalance());
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
}
