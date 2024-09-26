import java.util.Scanner;

abstract class Shape{
    public void display(){
        System.out.println("Shape details: ");
    }
    public abstract double calculateVolume();
}

class cylinder extends Shape{
    private double radius;
    private double height;
    public cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}

class cube extends Shape{
    private final double side;
    public cube(double side){
        this.side = side;
    }

    @Override
    public double calculateVolume() {
        return Math.PI * Math.pow(side, 2);
    }
}
public class ShapeAbstract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the shape: \n1)Cylinder\n2)cube\n---- ");
        String shape = sc.nextLine();

        if(shape.equals("cylinder")){
            System.out.println("Enter the radius: ");
            double radius = sc.nextDouble();
            System.out.println("Enter the height: ");
            double height = sc.nextDouble();
            Shape r = new cylinder(radius, height);
            r.display();
            System.out.println("Volume of "+shape+" is : "+ r.calculateVolume());
        }
        else if(shape.equals("cube")){
            System.out.println("Enter the size: ");
            double size = sc.nextDouble();
            cube r = new cube(size);
            r.display();
            System.out.println("Volume of "+shape+" is : "+ r.calculateVolume());
        }
    }
}
