package services; 

public class OfficeManager {
    private int managerId;
    private String name;


    public OfficeManager(int managerId, String name) {
        this.managerId = managerId;
        this.name = name;
    }


    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OfficeManager{" +
                "managerId=" + managerId +
                ", name='" + name + '\'' +
                '}';
    }
}
