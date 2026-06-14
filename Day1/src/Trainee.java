public class Trainee {
    private int tid;
    private String tname;
    private boolean accessCard;
    private Laptop laptop;

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public boolean isAccessCard() {
        return accessCard;
    }

    public void setAccessCard(boolean accessCard) {
        this.accessCard = accessCard;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trainee{");
        sb.append("tid=").append(tid);
        sb.append(", tname=").append(tname);
        sb.append(", accessCard=").append(accessCard);
        sb.append(", laptop=").append(laptop);
        sb.append('}');
        return sb.toString();
    }
}
