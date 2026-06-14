
public class App {
    public static void main(String[] args)  {
        System.out.println("Learning Objects, Class in Java");
        

        Trainee[] t=new Trainee[3];
        t[0]=new Trainee();
        t[0].setTid(1);
        t[0].setTname("KM");
        t[0].setAccessCard(false);
        Laptop l=new Laptop();
        l.setIsAllocated(true);
        l.setLid(101);
        l.setModel("Dell");
        t[0].setLaptop(l);

        t[1]=new Trainee();
        t[1].setTid(1);
        t[1].setTname("KM");
        t[1].setAccessCard(true);
        Laptop l1=new Laptop();
        l1.setIsAllocated(true);
        l1.setLid(102);
        l1.setModel("Dell");
        t[1].setLaptop(l1);

        t[2]=new Trainee();
        t[2].setTid(1);
        t[2].setTname("KM");
        t[2].setAccessCard(true);
        
        Laptop l2=new Laptop();
        l2.setIsAllocated(false);
        l2.setLid(101);
        l2.setModel("Dell");
        t[2].setLaptop(l2);
        


        for (Trainee t1:t){
        System.out.println(t1);
        }
        int count=0;
        for(Trainee t1 : t){
            if(t1==null ||t1.getLaptop()==null||!t1.getLaptop().isIsAllocated()){
                count++;
            }
        }

        System.out.println("Number of Trainees not having the laptop: "+count);
        int c=0;

        for(Trainee t2: t){
            if(!t2.isAccessCard()){
                c++;
            }
        }
        System.out.println("Number of trainees not having Access :"+ c);
        System.out.println(t[0].getLaptop().getModel());

    }
}
