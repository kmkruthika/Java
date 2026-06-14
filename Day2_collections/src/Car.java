public class Car implements Comparable<Car>{
    private int cno;
    private String model;
    private int year;

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Car{");
        sb.append("cno=").append(cno);
        sb.append(", model=").append(model);
        sb.append(", year=").append(year);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.cno, o.cno);

            
        }
    }
    
    

