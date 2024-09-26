class Bank{
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    public Bank(String accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void performTransaction(int amount){
        if(amount > 0){
            balance = balance + amount;
            System.out.println("Deposit of amount "+amount+" to "+accountNumber+" is successful. \nNew balance is "+balance);
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    public void performTransaction(int amount, boolean isWithDraw){
        if(isWithDraw){
            if(amount > 0 && balance >= amount){
                balance = balance - amount;
                System.out.println("Withdrawal of amount "+amount+" to "+accountNumber+" is successful. \nNew balance is "+balance);
            }
            else{
                System.out.println("Insufficient balance");
            }
        }
    }
    public void performTransaction(String fromAcc, String toAcc, int amount){
        if(fromAcc.equals(this.accountNumber)){
            if(amount>0 && balance >= amount){
                balance = balance - amount;
                System.out.println("Transfer of "+amount+" from account "+fromAcc+" to "+toAcc+" is successful.\nNew balance is "+balance);
            }
            else{
                System.out.println("Insufficient balance");
            }
        }
        else{
            System.out.println("Invalid fromAccount, transaction fail.");
        }
    }
    public void performTransaction(){
        System.out.println("Account Details----");
        System.out.println("Account number: "+accountNumber);
        System.out.println("Account holder name: "+accountHolderName);
        System.out.println("Balance: "+balance);
        System.out.println();
    }
}

public class CTPolymorphism {
    public static void main(String[] args) {
        Bank acc1 = new Bank("12345", "John Smith", 1000);
        acc1.performTransaction();

        System.out.println("Performing transaction - deposit: ");
        acc1.performTransaction(1000);
        acc1.performTransaction();

        System.out.println("Performing transaction - withdraw: ");
        acc1.performTransaction(500, true);
        acc1.performTransaction();

        System.out.println("Performing transaction - transfer: ");
        acc1.performTransaction("12345", "7896", 200);
        acc1.performTransaction();
    }
}
