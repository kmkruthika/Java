import java.util.*;

public class Map_Collection {
    public static void main(String[] args) {
        Map<Integer, Car> m=new HashMap<>();

        Car c=new Car();
        c.setCno(1234);
        c.setModel("Hyundai");
        c.setYear(2009);

        Car c1=new Car();
        c1.setCno(1467);
        c1.setModel("Mahindra");
        c1.setYear(2005);

        m.put(c.getCno(), c);
        m.put(c1.getCno(), c1);

        System.out.println(m);

        Map<Integer, Car> m1=new LinkedHashMap<>();

        Car c3=new Car();
        c3.setCno(1234);
        c3.setModel("Hyundai");
        c3.setYear(2009);

        Car c2=new Car();
        c2.setCno(1467);
        c2.setModel("Mahindra");
        c2.setYear(2005);

        m1.put(c2.getCno(), c2);
        m1.put(c3.getCno(), c3);
        System.out.println("LinkedHashMap");

        System.out.println(m1);


        Map<Integer, Car> m2=new TreeMap<>();

        Car c4=new Car();
        c4.setCno(1234);
        c4.setModel("Hyundai");
        c4.setYear(2009);

        Car c5=new Car();
        c5.setCno(1467);
        c5.setModel("Mahindra");
        c5.setYear(2005);

        m2.put(c4.getCno(), c4);
        m2.put(c5.getCno(), c5);
        System.out.println("Tree Map");

        System.out.println(m2);









    }
    
}
