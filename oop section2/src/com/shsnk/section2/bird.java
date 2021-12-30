package com.shsnk.section2;

public class bird extends animals
{
    public bird(String name, int legs, boolean hasTale) {
        super(name, legs, hasTale);
    }

    @Override
    public String eat(String food) {
        return("Chweeing"+food);
    }
}
