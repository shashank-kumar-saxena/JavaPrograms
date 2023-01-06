public class Phone {
    private int ram;
    private int storage;
    private String name;

    public Phone(int ram, int storage, String name) {
        this.ram = ram;
        this.storage = storage;
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "ram=" + ram +
                ", storage=" + storage +
                ", name='" + name + '\'' +
                '}';
    }
}
