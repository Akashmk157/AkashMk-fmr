import java.util.Scanner;

public class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        System.out.println("Details of product --------");
        ct.display();
        ct.show();
        ct.displayCategory();
    }
}
