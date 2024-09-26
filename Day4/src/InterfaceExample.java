import javax.swing.*;
import java.awt.*;

interface Machine{
    public void start();
    public void stop();
}
interface paint{
    public void painting();
}
class car implements Machine, paint{
    @Override
    public void start() {
        System.out.println("Washing car started...");
    }

    @Override
    public void stop() {
        System.out.println("Washing car stopped...");
    }

    public void painting(){
        System.out.println("Painting the car...");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Machine wash = new car();
        wash.start();
        wash.stop();

        paint pt = new car();
        pt.painting();

    }
}
