import java.util.*;

public class Set_Collection {
    public static void main(String[] args) {
        Set<Car> s=new HashSet<>();
        Car c=new Car();
        c.setCno(1234);
        c.setModel("Hyundai");
        c.setYear(2009);

        Car c1=new Car();
        c1.setCno(1467);
        c1.setModel("Mahindra");
        c1.setYear(2005);

        s.add(c1);
        s.add(c);

        System.out.println("Hashset");
        System.out.println(s);


        Set<Car> s1= new LinkedHashSet<>();
        Car c2=new Car();
        c2.setCno(234);
        c2.setModel("Suzuki");
        c2.setYear(2021);
        s1.add(c2);

        Car c3=new Car();
        c3.setCno(134);
        c3.setModel("Bugatti");
        c3.setYear(2027);
        s1.add(c3);

        Car c4=new Car();
        c4.setCno(2334);
        c4.setModel("Volkswagen");
        c4.setYear(2022);
        s1.add(c4);
        System.out.println("LinkedHashSet");
        System.out.println(s1);


        Set<Car> s2= new TreeSet<>();
        Car c5=new Car();
        c5.setCno(234);
        c5.setModel("Suzuki");
        c5.setYear(2021);
        s2.add(c5);

        Car c6=new Car();
        c6.setCno(134);
        c6.setModel("Bugatti");
        c6.setYear(2027);
        s2.add(c6);

        Car c7=new Car();
        c7.setCno(2334);
        c7.setModel("Volkswagen");
        c7.setYear(2022);
        s2.add(c7);
        System.out.println("TreeSet");
        System.out.println(s2);





    }
    
}
