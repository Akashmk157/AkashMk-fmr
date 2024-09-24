import java.util.Scanner;

public class cafeteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //prices
        int pizzaCost = 200, puffCost = 40, pepsiCost = 120;
        int grandTotal = 0;

        // inputs
        int pizzaTotal, puffTotal, pepsiTotal;
        System.out.print("Enter number of pizzas: ");
        pizzaTotal = sc.nextInt();
        System.out.print("Enter number of puffs: ");
        puffTotal = sc.nextInt();
        System.out.print("Enter number of pepsi: ");
        pepsiTotal = sc.nextInt();

        grandTotal = (pizzaCost*pizzaTotal) + (puffCost*puffTotal) + (pepsiCost*pepsiTotal);
        System.out.println("Bill details----");
        System.out.println("Total cost of pizzas: "+ (pizzaCost*pizzaTotal));
        System.out.println("Total cost of puffs: "+ (puffCost*puffTotal));
        System.out.println("Total cost of pepsi: "+ (pepsiCost*pepsiTotal));
        System.out.println("Grand Total: " + grandTotal);
    }
}
