public class hierarchical {
    public static void main(String[] args) {
        //Hierarchical inheritance
        Electronicsprod ep = new Electronicsprod("Tv", 20000, 3);
        ep.displayInfo();

        FoodProduct fp = new FoodProduct("Bread", 100, "12-04-2024");
        fp.displayInfo();
    }
}
