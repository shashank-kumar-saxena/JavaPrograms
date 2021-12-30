package com.shsnk.phone;

public class Phone {
    private String name="";
    private String ram="";
    private String storage="";

    public Phone(String name, String ram, String storage) {
        this.name = name;
        this.ram = ram;
        this.storage = storage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }
}
