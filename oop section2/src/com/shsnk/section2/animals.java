package com.shsnk.section2;

public class animals {
    private String name;
    private int legs;
    private boolean hasTale;

    public animals(String name, int legs, boolean hasTale) {
        this.name = name;
        this.legs = legs;
        this.hasTale = hasTale;
    }
    public String eat(String food)
    {
        return ("Eat :"+food);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isHasTale() {
        return hasTale;
    }

    public void setHasTale(boolean hasTale) {
        this.hasTale = hasTale;
    }
}
