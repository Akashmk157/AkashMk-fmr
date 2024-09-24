public class Electronicsprod extends prod{
    int warrantyPeriodd;

    public Electronicsprod(String name , int price, int warrantyPeriodd){
        super(name, price);
        this.warrantyPeriodd = warrantyPeriodd;
    }
    public void displayInfo(){
        super.display();
        System.out.println("Warranty Period: " + warrantyPeriodd + " Years");
    }
}
