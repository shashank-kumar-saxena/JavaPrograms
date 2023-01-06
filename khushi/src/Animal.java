public class Animal {
    private String name;
    private boolean hasTail;
    private int legs;

    public Animal(String name, boolean hasTail, int legs) {
        this.name = name;
        this.hasTail = hasTail;
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
