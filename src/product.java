import javax.smartcardio.CardTerminal;

public class product {
//    int productId;
//    String productName;
//    String category;
//    static String storeName = "btc";
//    public void Initialize(int productId, String productName, String category) {
//        this.productId = productId;
//        this.productName = productName;
//        this.category = category;
//    }
//    public void Display() {
//        System.out.println("Product ID: " + productId);
//        System.out.println("Product Name: " + productName);
//        System.out.println("Category: " + category);
//    }
//    public static void StoreName(){
//        System.out.println("Store Name: " + storeName);
//    }
        int prodId;
        String prodName;
        String prodPrice;

        public void display(){
            System.out.println("product ID: " + prodId + "\nproduct name: " + prodName + "\nproduct price: " + prodPrice);
        }
}
