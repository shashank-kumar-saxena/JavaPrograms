public class Dog extends Animal{
    private String speak;
    public Dog(String name, boolean hasTail, int legs) {
        super(name, hasTail, legs);
    }

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }
}
