import java.util.ArrayList;
import java.util.LinkedList;

class product{
    int product_id;
    String product_name;
    public product(int product_id, String product_name){
        this.product_id = product_id;
        this.product_name = product_name;
    }
}
public class CollectionCpt {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);

        for(int al : arrList){
            System.out.println(al);
        }
        LinkedList<product> ll = new LinkedList<>();
        ll.offer(new product(1,"hp"));
        ll.offer(new product(2,"lenovo"));

        for(product p : ll){
            System.out.println("Product id: "+p.product_id+" Product name: "+p.product_name);
        }

    }
}
