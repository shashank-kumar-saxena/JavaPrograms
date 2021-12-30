package com.shsnk.pubpriclass;

public class cons {
    protected String Name;
    protected String Ram;
    protected String Storage;

    public cons(String name, String ram, String storage) {
        Name = name;
        Ram = ram;
        Storage = storage;
    }
    public void getAll()
    {
        System.out.println("Name "+Name+"\nRam "+Ram+"\snStorage "+Storage);
    }
}
