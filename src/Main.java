import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted te

        //Multilevel Inheritance
        Scanner sc = new Scanner(System.in);
//        product p1 = new product();
//        System.out.println("Enter product Id: ");
//        int productId = sc.nextInt();
//        System.out.println("Enter product Name: ");
//        String productName = sc.next();
//        System.out.println("Enter product category: ");
//        String category = sc.next();
//
//        p1.Initialize(productId, productName, category);
//        p1.Display();
//        product.StoreName();
//
//        product p2 = new product();
//        System.out.println("Enter product Id: ");
//        productId = sc.nextInt();
//        System.out.println("Enter product Name: ");
//        productName = sc.next();
//        System.out.println("Enter product category: ");
//        category = sc.next();
//
//        p2.Initialize(productId, productName, category);
//        p2.Display();
//        product.StoreName();
        Category ct = new Category();
        System.out.println("Category : ");
        ct.categoryName = sc.next();
        System.out.println("Brand name : ");
        ct.brandName = sc.next();
        System.out.println("product id : ");
        ct.prodId = sc.nextInt();
        System.out.println("product name : ");
        ct.prodName = sc.next();
        System.out.println("product price : ");
        ct.prodPrice = sc.next();

        ct.display();
        ct.show();
        ct.displayCategory();
    }
}