import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Car> l=new ArrayList<>();
        Car c=new Car();
        c.setCno(1);
        c.setModel("BMW");
        c.setYear(2004);
        l.add(c);
        System.out.println("output of ArrayList");
        System.out.println(l);

        LinkedList<Car> l1= new LinkedList<>();
        Car c1=new Car();
        c1.setCno(2);
        c1.setModel("Benz");
        c1.setYear(2010);
        l1.add(c1);

        Car c2=new Car();
        c2.setCno(3);
        c2.setModel("Range Rover");
        c2.setYear(2013);
        l1.add(c2);

        Car c3=new Car();
        c3.setCno(1);
        c3.setModel("Lambhorgini");
        c3.setYear(2020);
        l1.add(c3);




        System.out.println("Output of LinkedList");
        System.out.println(l1);

        Collections.sort(l1);
        System.out.println("After Sorting: "+l1);







        
        
    }
}
