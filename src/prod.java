public class prod {
    String prodName;
    int prodPrice;

    public prod(String prodName, int prodPrice) {
        this.prodName = prodName;
        this.prodPrice = prodPrice;
    }
    public void display() {
        System.out.println("product name: " + prodName + ", product price: " + prodPrice);
    }
}
