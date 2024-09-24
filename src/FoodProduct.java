public class FoodProduct extends prod{
    String Expirydate;

    public FoodProduct(String name, int price, String expirydate) {
        super(name, price);
        this.Expirydate = expirydate;
    }

    public void displayInfo(){
        super.display();
        System.out.println("Expirydate: " + Expirydate);
    }
}
