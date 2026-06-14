public class Laptop {
    private int lid;
    private String model;
    private boolean isAllocated;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isIsAllocated() {
        return isAllocated;
    }

    public void setIsAllocated(boolean isAllocated) {
        this.isAllocated = isAllocated;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Laptop{");
        sb.append("lid=").append(lid);
        sb.append(", model=").append(model);
        sb.append(", isAllocated=").append(isAllocated);
        sb.append('}');
        return sb.toString();
    }
}
